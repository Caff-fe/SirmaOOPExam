package com.academy.OOPexam;

import com.academy.OOPexam.resources.CsvReader;
import com.academy.OOPexam.resources.CsvWriter;

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
        */

        String path = "src/java/com/academy/OOPexam/resources/MockDatabase.csv";

        String[] data = {"22", "test", "temp", "wtf", "124.00"};

        CsvReader reader = new CsvReader(path);
        List<String> employees = reader.readLines();

        System.out.println(employees);

//        CsvWriter writer = new CsvWriter(path);
//        writer.writeToCsv(data, true);

//        System.out.println(employees);
    }
}