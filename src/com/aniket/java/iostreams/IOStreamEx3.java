package com.aniket.java.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamEx3 {
    public static void main(String[] args) throws IOException {
        File basePath = new File("/Users/Aniket Jain/IdeaProjects/JavaCourse/demo_folder");
        File srcFile = new File(basePath, "src.txt");
        File destFile = new File(basePath, "dest.txt");

        FileInputStream fileIn = new FileInputStream(srcFile);
        FileOutputStream fileOut = new FileOutputStream(destFile);

        int value;
        while ((value = fileIn.read()) != -1) {
            fileOut.write(value);
        }

        fileIn.close();
        fileOut.close();

    }
}
