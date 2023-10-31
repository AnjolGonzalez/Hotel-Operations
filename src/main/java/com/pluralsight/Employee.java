package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Employee {
    static Scanner prompt = new Scanner(System.in);
    static LocalDateTime time = LocalDateTime.now();
    static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String employeeId;
    String name;
    String department;
    double payRate;
    float hoursWorked;
    double totalPay;
    double regularHours;
    double overtimeHours;
    double punchIn;
    double punchOut;

    public Employee(String employeeId, String name, String department, double payRate, float hoursWorked, double totalPay, double regularHours, double overtimeHours, double punchIn, double punchOut) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.totalPay = totalPay;
        this.regularHours = regularHours;
        this.overtimeHours = overtimeHours;
        this.punchIn = punchIn;
        this.punchOut = punchOut;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {

        if (overtimeHours < 0) {
            return regularHours * payRate;
        } else {
            return  (regularHours * payRate) + (overtimeHours * payRate) *1.5;
        }

    }
    public void setTotalPay() {
        this.totalPay = totalPay;
    }

    public double getRegularHours() {
        return regularHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }
    public static void punchCardTime() {
        System.out.println("\nWelcome\n" +
                "What would you like to do?:\n" +
                "1) Check in\n" +
                "2) Check out\n" +
                "");
        String userPrompt = prompt.nextLine();

        switch (userPrompt) {
            case "1":
                System.out.println("Welcome " + timeFormatter.format(time));
            break;
            case "2":
                System.out.println("Goodbye!\n" +
                        "Have a great day!\n" +
                        "Thank you for visting\n" + timeFormatter.format(time));
            default:
                System.out.print("What would you like to do?: ");
        }
    }

}
