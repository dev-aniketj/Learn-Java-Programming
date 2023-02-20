package com.aniket.java.iostreams;

import java.io.File;
import java.io.FilenameFilter;

class JavaFileFilter implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".java");
    }
}

class FileUtils {
    public static void display(File[] files) {
        for (File f : files) {
            System.out.println(f.getName());
        }
    }
}

public class IOStreamEx2 {
    public static void main(String[] args) {
        File baseDir = new File("/Users/Aniket Jain/IdeaProjects/JavaCourse/demo_folder");

        System.out.println("All Files : ");
        File[] files = baseDir.listFiles();
        FileUtils.display(files);

        System.out.println("Only Java Files : ");
        File[] javaFiles = baseDir.listFiles(new JavaFileFilter());
        FileUtils.display(javaFiles);
    }
}
