
import java.io.*; // importing FileReader/BufferedReader/exceptions

public class Main {
        public static void main(String[] args) throws IOException {

                 // using FileReader, BufferedReader, a while loop, and split()

                 // Read employee data from CSV file(FileReader)
                try {  // this try/catch handles exceptions
                        FileReader fileReader = new FileReader("employees.csv"); //creates file
                        BufferedReader bufReader = new BufferedReader(fileReader); //reads created file

                        String line;

                        bufReader.readLine(); // skips header in file, if there is one there

                        while ((line = bufReader.readLine()) != null) {
                                //  we need to split up employee data into individual fields

                                String[] tokens = line.split("\\|");

                                //storing employee information
                                int employeeID = Integer.parseInt(tokens[0]);
                                String name = tokens[1];
                                double hoursWorked = Double.parseDouble(tokens[2]);
                                double payRate = Double.parseDouble(tokens[3]);

                                // now we create the new employee object
                                Employee employee = new Employee(employeeID, name, hoursWorked, payRate);

                                // now display employee information
                                System.out.printf("ID: %d | Name: %s | Gross Pay: $%.2f%n",
                                        employee.getEmployeeID(),
                                        employee.getName(),
                                        employee.getGrossPay());


                        }


                                //close file
                        bufReader.close();

                } catch (IOException e) {
                        System.out.println("Error reading file: " + e.getMessage());
                }
        }
}