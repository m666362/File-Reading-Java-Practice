package org.richit.filereading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
        readbyBufferReader();

        endProgramme();
    }

    private static void readbyBufferReader() {

        System.out.println(dot + "Printing from readbyBufferReader and try catch method" + dot);

        BufferedReader bufferedReader;
        String fileName = "New Text Document - Copy.txt";
        File file = new File(fileName);
        try {

            FileReader fileReader = new FileReader( file );
            bufferedReader = new BufferedReader( fileReader );

            while (bufferedReader.ready()){
                System.out.println(bufferedReader.readLine());
            }

        } catch (FileNotFoundException e) {
            //.close();
            System.out.println("File not found : " + file.toString());

        } catch (IOException e) {
            System.out.println("File found but can't read : " + file.toString());

        }
        finally {
            try {
                //bufferedReader.close();
            } catch (IOException e) {
                System.out.println("File not closed : " + file.toString());
            } catch (NullPointerException e){
                System.out.println("File not opened : " + file.toString());
            }
        }


    }

    private static void readFilefirstMethod() throws FileNotFoundException {

        System.out.println(dot + "Printing from Throw and Scanner first method" + dot);
        String filePath = "C:\\Users\\DELL\\Desktop\\New Text Document.txt";
        File file = new File(filePath);
        Scanner scanFile = new Scanner( file );//FileReader does the same like Scanner for file
        while (scanFile.hasNextLine()){
            String line = scanFile.nextLine();
            System.out.println(line);
        }
        scanFile.close();
    }

    private static void readFileSecondMethod() throws FileNotFoundException {

        //copy the file in the root directory of project and change file path to file name
        System.out.println(dot + "Printing from Throws and Scanner method" + dot);
            String fileName = "New Text Document - Copy.txt";
            File file = new File(fileName);
            Scanner scanFile = new Scanner( file );
            while (scanFile.hasNextLine()){
                String line = scanFile.nextLine();
                System.out.println(line);
            }
            scanFile.close();
    }

    private static void readIntfromFile() {

        System.out.println(dot + "Printing from Try Catch and Scanner method" + dot);
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

}