package com.labs.dm.lauferdb.core.storage;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author daniel
 */
public class FileStorage {

    private final File file;

    public FileStorage(String filename) throws IOException {
        if (filename == null || filename.isEmpty()) {
            throw new IllegalArgumentException("empty file name");
        }
        file = new File(filename);
        if (!file.exists()) {
            file.createNewFile();
        }
    }

}
