public class Project {
    public static void main(String[] cmdArgs) {
        if (cmdArgs.length != 1) {
            System.out.println("Please enter an employee id");
            return;
        }

        int employeeId = Integer.parseInt(cmdArgs[0]);

        // Employee data
        int[] employeeNumbers = { 1001, 1002, 1003, 1004, 1005, 1006, 1007 };
        String[] employeeNames = { "Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay" };
        String[] joiningDates = { "01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000",
                "12/06/2006" };
        char[] positionCodes = { 'e', 'c', 'k', 'r', 'm', 'e', 'c' };
        String[] departments = { "R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM" };
        int[] basicSalary = { 20000, 30000, 10000, 12000, 50000, 23000, 29000 };
        int[] houseRentAllowance = { 8000, 12000, 8000, 6000, 20000, 9000, 12000 };
        int[] incomeTax = { 3000, 9000, 1000, 2000, 20000, 4400, 10000 };

        boolean isFound = false;

        for (int index = 0; index < employeeNumbers.length; index++) {
            if (employeeNumbers[index] == employeeId) {
                isFound = true;
                String jobTitle = "";
                int dearnessAllowance = 0;

                // Determine designation and DA using switch-case
                switch (positionCodes[index]) {
                    case 'e':
                        jobTitle = "Engineer";
                        dearnessAllowance = 20000;
                        break;
                    case 'c':
                        jobTitle = "Consultant";
                        dearnessAllowance = 32000;
                        break;
                    case 'k':
                        jobTitle = "Clerk";
                        dearnessAllowance = 12000;
                        break;
                    case 'r':
                        jobTitle = "Receptionist";
                        dearnessAllowance = 15000;
                        break;
                    case 'm':
                        jobTitle = "Manager";
                        dearnessAllowance = 40000;
                        break;
                }

                int totalSalary = basicSalary[index] + houseRentAllowance[index] + dearnessAllowance - incomeTax[index];

                // Print output
                System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
                System.out.println(
                        employeeNumbers[index] + "\t" + employeeNames[index] + "\t\t" + departments[index] + "\t\t" + jobTitle + "\t" + totalSalary);
                break;
            }
        }

        if (!isFound) {
            System.out.println("There is no employee with empid : " + employeeId);
        }
    }
}
