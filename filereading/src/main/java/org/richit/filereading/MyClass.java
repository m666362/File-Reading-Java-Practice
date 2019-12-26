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

        readFilefirstMethod();
        readFileSecondMethod();
        readIntfromFile();

        endProgramme();
    }

    private static void readIntfromFile() {

        String filePath = "C:\\Users\\DELL\\Desktop\\New Text Document.txt";
        File file = new File(filePath);
        try {
            Scanner scanFile = new Scanner( file );
            System.out.println("File found");
            while (scanFile.hasNextInt()){
                int fileInt = scanFile.nextInt();
                System.out.println("Found integer : " + fileInt);
                //it wont find integer 500 becasuse of Myself at 2nd line
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void readFilefirstMethod() throws FileNotFoundException {

        String filePath = "C:\\Users\\DELL\\Desktop\\New Text Document.txt";
        File file = new File(filePath);
        Scanner scanFile = new Scanner( file );
        while (scanFile.hasNextLine()){
            String line = scanFile.nextLine();
            System.out.println(line);
        }
        scanFile.close();
    }

    private static void readFileSecondMethod() throws FileNotFoundException {

        //copy the file in the root directory of project
            String filePath = "New Text Document - Copy.txt";
            File file = new File(filePath);
            Scanner scanFile = new Scanner( file );
            while (scanFile.hasNextLine()){
                String line = scanFile.nextLine();
                System.out.println(line);
            }
            scanFile.close();
    }

}