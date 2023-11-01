package com.pluralsight;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Employee {
    static Scanner prompt = new Scanner(System.in);
    static LocalDateTime time = LocalDateTime.now();
    static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public String employeeId;
    public String name;
    public String department;
    public double payRate;
    float hoursWorked;
    public double totalPay;
    public double regularHours;
    public double overtimeHours;
    public double punchIn;
    public double punchOut;
    public static double decimalTime = time.getHour() + time.getMinute() / 60;

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
            return  (regularHours * payRate) + (overtimeHours * payRate * 1.5);
        }
    }
    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

    public double getRegularHours() {
        return regularHours;
    }
    public void setRegularHours(double regularHours) {
        this.regularHours = regularHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }
    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
    public static void punchCardTime() {

        while (true) {
            System.out.println("\nWelcome\n" +
                    "1) Check in\n" +
                    "2) Check out\n" +
                    "3) Exit\n" +
                    "What would you like to do?: ");
            String userPrompt = prompt.nextLine();

            switch (userPrompt) {
                case "1":
                    punchIn();
                    break;
                case "2":
                    punchOut();
                    break;
                case "3":
                    System.exit(0);
                default:
                    System.out.print("Please choose one of the following: ");
            }
        }
    }
    public static void punchIn(double overtimeHours) {}
    public static void punchIn() {
        System.out.println("Thank you for clocking in at " + timeFormatter.format(time) + " " + decimalTime);
    }
    public static void punchOut(double overtimeHours) {}
    public static void punchOut() {
        System.out.println("Have a nice day!\n" +
                "Your clock out time is " + timeFormatter.format(time) + " " + decimalTime);
    }
}