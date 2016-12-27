package com.lewis73.playpen.try_with_resources;

import java.io.Closeable;
import java.io.IOException;

class MyAutoCloseable implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("MyAutoCloseable");
        throw new Exception("from MyAutoCloseable");
    }
}

class MyCloseable implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("MyCloseable");
        throw new IOException("from MyCloseable");
    }
}

public class CloseableVsAutoCloseable {
    public static void main(String[] args) {
        try (MyCloseable myCloseable = new MyCloseable();
             MyAutoCloseable myAutoCloseable = new MyAutoCloseable()) {
            System.out.println("in try block");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            System.out.println("finally");
        }
    }
}
