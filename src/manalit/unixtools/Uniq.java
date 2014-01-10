package manalit.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Uniq {
    public static void main(String args[])throws IOException {
        String currentLine,text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            while ((currentLine = br.readLine()) != null) {
                text += "\r\n"+currentLine;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        UniqLib findCount = new UniqLib();
        findCount.uniqData(text);
    }
}