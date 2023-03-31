package EmployeeWageProblem;

public class AttendanceCheck {
    public static void main(String asrgs[]){
        int isPresent = (int) (Math.random() * 10 % 2);
        System.out.println(isPresent);
        if (isPresent == 1)
            System.out.println("Employee is Present!");
        else
            System.out.println("Employee is Absent!");
    }
}
