package com.academy.OOPexam.resources;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CsvWriter {
    private String path = "src/java/com/academy/OOPexam/resources/MockDatabase.csv";

    public CsvWriter () {
    }

    //Writer class optimised to either overwrite or append to file
    public void writeToCsv (String[] data, boolean append) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, append))){
            if (!append) {
                writer.write("ID,Name,Industry,Contact Person,Revenue");
                writer.newLine();
            }
            writeData(writer, data);
            System.out.println("success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeData(BufferedWriter writer, String[] data) throws IOException {
        writer.write(String.join(",", data));
        writer.newLine();
    }
}
