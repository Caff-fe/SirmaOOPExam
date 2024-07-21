package com.academy.OOPexam.Employee;

import com.academy.OOPexam.resources.CsvReader;
import com.academy.OOPexam.resources.CsvWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeService {
    CsvReader reader = new CsvReader();
    EmployeeAccessor employeeAccessor = new EmployeeAccessor();
//    List<String> employees = reader.readLines();
    public void editEmployee(int id) {
        //this method is not suitable for my current writer
        //since it overwrites the entire file
        //need to find a better solution, will skip for now
    }

    public void fireEmployee(int id) {
        //this method is not suitable for my current writer
        //since it overwrites the entire file
        //need to find a better solution, will skip for now
    }

    public void findEmployeebyId(int id) {
        List<Employee> employeeList = employeeAccessor.convertStringToEmployee(reader.readLines());
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                System.out.println(employee);
            }
        }

    }

}


