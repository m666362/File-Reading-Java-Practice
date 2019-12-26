package org.richit.filereading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyClass {
    static String dot = "----------------";
    private static void startProgramme() {
        String start = "Programme started";
        System.out.println("");
        System.out.println(dot+start+dot);
        System.out.println("");
    }
    public static void endProgramme(){

        String end = "Programme ended";
        System.out.println("");
        System.out.println(dot+end+dot);
        System.out.println();
    }


    public static void main(String[] args) throws FileNotFoundException {

        startProgramme();
        String filename = "C:\\Users\\DELL\\Desktop";
        File file = new File(filename);
        endProgramme();
    }
}
