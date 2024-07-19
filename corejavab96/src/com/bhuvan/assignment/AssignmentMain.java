package com.bhuvan.assignment;

import com.bhuvan.assignment.employees.Manager;
import com.bhuvan.assignment.employees.Developer;
import com.bhuvan.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Bhuvan K N", 012, 80000, "HR");
        Developer developer = new Developer("Sandeep", 013, 60000, "Java");
        EmployeeUtilities.increaseSalary(manager, 15); // Increase manager's salary by 15%
        EmployeeUtilities.assignDepartment(manager, "Finance"); // Assign manager to Finance department
        EmployeeUtilities.increaseSalary(developer, 10); // Increase developer's salary by 10%
        EmployeeUtilities.changeProgrammingLanguage(developer, "Python"); // Change developer's programming language
        System.out.println("Manager details:");
        System.out.println("Name: " + manager.getName());
        System.out.println("Employee ID: " + manager.getEmployeeId());
        System.out.println("Salary: ₹" + manager.getSalary());
        System.out.println("Department: " + manager.getDepartment());
        System.out.println("\nDeveloper details:");
        System.out.println("Name: " + developer.getName());
        System.out.println("Employee ID: " + developer.getEmployeeId());
        System.out.println("Salary: ₹" + developer.getSalary());
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
    }
}