package com.company;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by student1 on 30.01.17.
 */
public class Situation {
    public String s;
    public int num;

    Situation(int num) throws IOException {
        s = "";
        FileReader reader = new FileReader("c:\\Users\\Yan\\Downloads\\Telegram Desktop\\Programs\\MyProgramme\\situations\\situation"+Integer.toString(num)+".txt");
        int c;
        while ((c = reader.read()) !=-1) {
            s = s + ((char) c);
        }
    }

}
