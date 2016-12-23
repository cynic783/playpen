package com.lewis73.playpen;

import java.util.concurrent.Executors;

/**
 * http://stackoverflow.com/questions/41307308/run-a-method-while-another-one-is-running
 */
public class StackOverflow41307308 {
    public static void main(String[] args) {

    }

    public void fuehreAus(){
        Executors.newSingleThreadExecutor().submit(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    // arbeit
                }
            }
        });
    }
}
