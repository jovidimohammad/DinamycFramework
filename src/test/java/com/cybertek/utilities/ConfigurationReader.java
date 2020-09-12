package com.cybertek.utilities;

import java.io.FileInputStream;
import java.sql.SQLOutput;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static {
        try{
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();

        }catch (Exception e){
            System.out.println("Configuration files is not located");

        }
    }

    public static String getProperty(String fileName){
        return properties.getProperty(fileName);
    }
}
