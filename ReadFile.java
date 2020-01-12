package com.LpLearning;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class ReadFile extends BufferedReader {
    
    public ReadFile(Reader in) {
        super(in);
    }
    
    @Override
    public int read() throws IOException {
        int charValue = super.read();
        
        if (97 <= charValue && charValue <= 122) {
            charValue -= 32;
        }
        
        return charValue;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fileReader = new FileReader(“text.txt");
        ReadFile readFile = new ReadFile(fileReader);
        
        int charVal;
        
        while ((charVal = readFile.read()) != -1) {
            char intToChar = (char) charVal;
            System.out.print(intToChar);
        }
        
        readFile.close();
        fileReader.close();
    }
}
