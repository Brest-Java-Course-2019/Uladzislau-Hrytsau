package com.epam.brest.course.provider.model;

/**
 * The type File model.
 */
public class FileModel {

    private String fileName;

    /**
     * Instantiates a new File model.
     */
    public FileModel() {
    }

    /**
     * Instantiates a new File model.
     *
     * @param fileName the file name
     */
    public FileModel(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Gets file name.
     *
     * @return the file name
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets file name.
     *
     * @param fileName the file name
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
