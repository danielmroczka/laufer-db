package com.labs.dm.lauferdb.core.storage;

import java.io.File;
import java.io.IOException;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author daniel
 */
public class FileStorageTest {

    @Test
    public void shouldInitIfFileMissing() throws IOException {
        FileStorage storage = new FileStorage("target/test.db");
        assertTrue(new File("target/test.db").exists());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAcceptEmptyFileName() throws IOException {
        FileStorage fileStorage = new FileStorage("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAcceptNullFileName() throws IOException {
        FileStorage fileStorage = new FileStorage(null);
    }
}
