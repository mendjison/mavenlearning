package controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello Maven");
        Properties properties = new Properties();
        InputStream inputStream = null;
        try {
            inputStream = Test.class.getResourceAsStream("/info.properties");
            properties.load(inputStream);
        }finally {
            if(inputStream != null)
                inputStream.close();
        }
        System.out.println("la version Java untilisee est: "
                + properties.getProperty("java.version","?"));
    }
}
