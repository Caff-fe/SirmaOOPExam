package com.academy.OOPexam;

import com.academy.OOPexam.Employee.EmployeeService;
import com.academy.OOPexam.resources.CsvReader;
import com.academy.OOPexam.resources.CsvWriter;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Template for the program's end User-interface
        Welcome to application
        Select an action
        1) Add user
        2) Edit user
        3) Fire employee
        4) List all Employees
        Could not finish in time for the deadline,
        will try to at least finish what I can for tonight
        */

        String[] data = {"22", "test", "temp", "wtf", "124.00"};

        CsvReader reader = new CsvReader();
        List<String[]> employees = reader.readLines();

        for (String[] employee : employees) {
            System.out.println(Arrays.toString(employee));
        }

        EmployeeService service = new EmployeeService();
        service.findEmployeebyId(2);

//        CsvWriter writer = new CsvWriter(path);
//        writer.writeToCsv(data, true);

//        System.out.println(employees);
    }
}