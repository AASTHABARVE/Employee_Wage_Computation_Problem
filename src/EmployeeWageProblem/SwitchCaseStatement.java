package EmployeeWageProblem;

public class SwitchCaseStatement {
    public static void main(String args[])
    {
        int PART_TIME = 2;
        int FULL_TIME = 1;
        int WAGE_PER_HR = 20;
        int empType = (int) (Math.random() * 100) % 3;
        int workingHours =0;
        switch (empType)
        {
            case 1:
                System.out.println("Employee is Present Full time");
                workingHours = 8;
                break;
            case 2:
                System.out.println("Employee is Present Part time");
                workingHours = 4;
                break;
            default:
                System.out.println("Employee is Absent");
        }
        int wage = workingHours * WAGE_PER_HR;
        System.out.println("Employee Daily Wage is " + wage);
        }


    }




