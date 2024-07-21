package com.academy.OOPexam.Employee;

import com.academy.OOPexam.resources.CsvReader;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAccessor {
    public List<Employee> convertStringToEmployee(List<String[]> list) {
        CsvReader reader = new CsvReader();
        List<Employee> employeeList = new ArrayList<>();
        for (String[] row : list) {
            int id = Integer.parseInt(row[0]);
            String name = row[1];
            String department = row[2];
            String role = row[3];
            double salary = Double.parseDouble(row[4]);

            Employee employee = new Employee(id, name, department, role, salary);
            employeeList.add(employee);
        }
        return employeeList;
    }

}
