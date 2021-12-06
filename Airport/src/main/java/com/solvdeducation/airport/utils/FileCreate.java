package com.solvdeducation.airport.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    private static final Logger log = LogManager.getLogger(FileCreate.class);
    public static {

        try {
            File file = new File("Testfile.txt");
            if (!file.exists())
                file.createNewFile();
        } catch (IOException e) {

        }
    }

}
