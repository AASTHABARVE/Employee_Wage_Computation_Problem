package EmployeeWageProblem;

public class AddPartEmpAndWage {
public static void main(String args[]){
    int partTime = 1;
    int fullTime = 2;
    int WagePerHour = 20;
    int empType = (int) (Math.random() * 100) % 3;
    int workingHours = 0;
    if (empType == fullTime)
    {
        System.out.println("Employee is Present Full time");
        workingHours = 8;
    } else if (empType == partTime)
    {
        System.out.println("Employee is Present Part time");
        workingHours = 4;
    } else
    {
        System.out.println("Employee is Absent");
    }
    int wage = workingHours * WagePerHour;
    System.out.println("Employee Daily Wage is " + wage);
}
}

