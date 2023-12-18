package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtil {

    private static final String PROPERTY_FILE = "database.properties"; // Name of your property file

    private PropertyUtil() {
    }

    public static String getPropertyString() {
        Properties properties = new Properties();
        try (InputStream input = PropertyUtil.class.getClassLoader().getResourceAsStream(PROPERTY_FILE)) {
            properties.load(input);
            return "jdbc:mysql://" +
                    properties.getProperty("hostname") +
                    ":" + properties.getProperty("port") +
                    "/" + properties.getProperty("dbname") +
                    "?user=" + properties.getProperty("username") +
                    "&password=" + properties.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
