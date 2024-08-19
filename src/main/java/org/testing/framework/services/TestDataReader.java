package org.testing.framework.services;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestDataReader {

    private static Properties properties = new Properties();

    public static void setUpProperties(String propertiesFileName) {
        try (InputStream input = TestDataReader.class.getClassLoader().getResourceAsStream(propertiesFileName)) {
            if (input == null) {
                throw new FileNotFoundException("property file not found in the classpath");
            }
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String getTestData(String key) {
        return properties.getProperty(key);
    }
}

