package com.aniket.java.iostreams;

import java.io.*;

/**
 * Buffer IO
 */

public class IOStreamEx6 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOut = new FileOutputStream("s.txt");
        BufferedOutputStream bufferedOut = new BufferedOutputStream(fileOut);
        bufferedOut.write(10);
        bufferedOut.write(20);
        bufferedOut.flush();
        fileOut.close();

        FileInputStream fileIn = new FileInputStream("s.txt");
        BufferedInputStream bufferedIn = new BufferedInputStream(fileIn);
        System.out.println(bufferedIn.read());
        System.out.println(bufferedIn.read());
        fileIn.close();
    }
}
