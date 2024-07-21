package com.academy.OOPexam.resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvReader {

    private String path = "src/java/com/academy/OOPexam/resources/MockDatabase.csv";
    public CsvReader () {
    }

    public List<String[]> readLines() {
        List<String[]> employees = new ArrayList<>();
        boolean isFirstLine = true;

        try (BufferedReader csvReader = new BufferedReader(new FileReader(path))) {
            String line;

            while (( line = csvReader.readLine()) != null) {
                if(isFirstLine){
                    isFirstLine = false;
                    continue;
                }
                String[] values = line.split(",");
                employees.add(values);
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return employees;
    }

}
