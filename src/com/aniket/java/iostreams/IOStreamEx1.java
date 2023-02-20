package com.aniket.java.iostreams;


import java.io.File;
import java.io.IOException;

public class IOStreamEx1 {
    public static void main(String[] args) throws IOException {

        File basePath = new File("/Users/Aniket Jain/IdeaProjects/JavaCourse/demo_folder");

        File f1 = new File(basePath, "a.txt");
        f1.createNewFile();

        File f2 = new File(basePath, "b.txt");
        if (f2.isFile())
            System.out.println("b.txt is already exist");
        else
            f2.createNewFile();

    }
}
