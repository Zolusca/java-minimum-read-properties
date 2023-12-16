package org.haslam.latihan;


import java.io.*;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main(String[] args) throws Exception {
        String path = "/database.properties";

            try(InputStream inputStream = Main.class.getResourceAsStream(path)){
                Properties properties = new Properties();
                properties.load(inputStream);

                String propertiesNameUser = properties.getProperty("user");
                if(propertiesNameUser==null) throw new Exception("data key tidak ditemukan ");

                System.out.println(properties.getProperty("user"));

            }catch (NullPointerException|IOException exception){
                System.out.println("data file tidak ditemukan "+exception.getMessage());
            }
    }
}
