package cipherbrute;

import java.io.*;

public class Runner {

    public static void main(String[] args) throws IOException {
        try {
            InputStream intStr = new FileInputStream("input.txt");
            OutputStream outStr = new FileOutputStream("out.txt");
            CaesarCipher caesar = new CaesarCipher(5);
            caesar.encrypt(intStr,outStr);
            intStr.close();
            outStr.close();
        }catch (IOException e){
            System.out.println("Error" + e);
        }

    }
}






