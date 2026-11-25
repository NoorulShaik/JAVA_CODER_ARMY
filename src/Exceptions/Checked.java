package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked {
    public static void main(String[] args) {
        try{
            readFile();
        }
        catch (FileNotFoundException e){
            System.out.println("FIle not found");
        }
    }
    private static void readFile() throws FileNotFoundException {
        FileReader fr = new FileReader("abc.txt");


    }
}
//checked exceptions -->throws