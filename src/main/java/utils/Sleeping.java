package utils;

import java.util.concurrent.TimeUnit;

public class Sleeping {
    public static void sleep(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (Exception e) {
            System.out.println("Ooops...");
        }
    }
}
