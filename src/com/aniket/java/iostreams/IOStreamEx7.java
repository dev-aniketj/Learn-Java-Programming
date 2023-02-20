package com.aniket.java.iostreams;

import java.io.*;

public class IOStreamEx7 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOut = new FileOutputStream("s.dat");
        DataOutputStream dataOut = new DataOutputStream(fileOut);
        int a = 9870;
        float b = 10.2f;
        dataOut.write(a);
        dataOut.write(a);
        fileOut.close();


        FileInputStream fileIn = new FileInputStream("s.dat");
        DataInputStream dataIn = new DataInputStream(fileIn);
        a = dataIn.readInt();
        b = dataIn.readFloat();
        System.out.println(a);
        System.out.println(b);

    }
}
