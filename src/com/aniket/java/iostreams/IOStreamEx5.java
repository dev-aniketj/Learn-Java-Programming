package com.aniket.java.iostreams;

import java.io.*;

class IOUtils {
    public static void copy(OutputStream out, InputStream in) throws IOException {
        byte[] buffer = new byte[1024];
        int n;
        while ((n = in.read(buffer)) > 0) {
            out.write(buffer, 0, n);
        }
    }
}

public class IOStreamEx5 {
    public static void main(String[] args) throws IOException {
        File basePath = new File("/Users/Aniket Jain/IdeaProjects/JavaCourse/demo_folder");
        File srcFile = new File(basePath, "src.txt");
        File destFile = new File(basePath, "dest.txt");

        //try with resource block
        try (FileInputStream fileIn = new FileInputStream(srcFile);
             FileOutputStream fileOut = new FileOutputStream(destFile)) {
            //extra Ex5
            IOUtils.copy(fileOut, fileIn);
            System.out.println("copied...");
        }


    }
}
