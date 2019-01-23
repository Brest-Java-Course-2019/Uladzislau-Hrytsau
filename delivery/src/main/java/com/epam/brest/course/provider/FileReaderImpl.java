package com.epam.brest.course.provider;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * The type File reader.
 */
public class FileReaderImpl implements FileReader {

    @Override
    public Properties read(FileModel model) {
        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = getClass().getClassLoader().getResourceAsStream(model.getFileName());
            if (input == null) {
                System.out.println("Sorry, unable to find " + model.getFileName());
                return null;
            }
            prop.load(input);
            return prop;
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
