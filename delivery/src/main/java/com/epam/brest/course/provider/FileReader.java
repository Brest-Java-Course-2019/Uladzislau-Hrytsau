package com.epam.brest.course.provider;

import java.util.Properties;

/**
 * The interface File reader.
 */
public interface FileReader {

    /**
     * Read properties.
     *
     * @param model the model
     * @return the properties
     */
    Properties read(FileModel model);

}
