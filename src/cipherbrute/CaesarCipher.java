package cipherbrute;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CaesarCipher {
    private int key;

    public CaesarCipher(int givenKey){
        key = givenKey;
    }
    public void encrypt(InputStream intStr, OutputStream outStr) throws IOException{
        boolean done = false;
        while (!done){
            int next = intStr.read();
            if (next == -1){
                done = true;
            }else{
                byte b = (byte)next;
                byte c = (byte) (b + key);
                outStr.write(c);
            }
        }
    }
}
