
package com.lewis73.playpen.hacker_rank;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String timeIn = in.next();
        String timeOut = new TimeConversion().convert(timeIn);
        System.out.println(timeOut);
    }

    String convert(String s) {
        if (s.length() < 10) {
            return "";
        }
        DateTimeFormatter fmtIn = DateTimeFormatter.ofPattern("hh:mm:ssa");
        LocalTime parsed = LocalTime.parse(s, fmtIn);
        DateTimeFormatter fmtOut = DateTimeFormatter.ofPattern("HH:mm:ss");
        return parsed.format(fmtOut);
    }
}
