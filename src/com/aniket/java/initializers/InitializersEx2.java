package com.aniket.java.initializers;

import java.util.Properties;

class Config {
    static Properties properties;

    static {
        System.out.println("Loading the properties from configuration file");
        properties = new Properties();
    }
}

class DatabaseDriver {
    static {
        System.out.println("register with DriverManager...");
    }
}

public class InitializersEx2 {
    public static void main(String[] args) {
        new Config();
        new DatabaseDriver();
    }
}
