package EmployeeWageProblem;

public class CalculateDailyEmployeeWage {
    public static void main(String args[]){
         int FullTime = 1;
         int WagePerHr = 20;
        int empType = (int) (Math.random() * 100) % 2;
        int workingHours =0;
        if (empType == FullTime)
        {
            System.out.println("Employee is Present");
            workingHours = 8;
        } else
        {
            System.out.println("Employee is Absent");
        }
        int wage = workingHours * WagePerHr;
        System.out.println("Employee Daily Wage is " + wage);

    }
}
