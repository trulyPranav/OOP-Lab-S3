package Examples;

import java.io.*;
import java.util.*;
// Using STREAMS
class FileHandling {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = null;
        FileInputStream input = null;
        FileOutputStream output = null;
        Scanner src = null;
        try{
            src = new Scanner(System.in);
            String s = src.nextLine();
            byte[] buffer = s.getBytes();

            out = new FileOutputStream("eg3.txt");
            System.out.println("Opened");
            // .read(); ==> Returns Interger value ==> EOF => Returns -1
            out.write(buffer);

            input = new FileInputStream("eg3.txt");
            output = new FileOutputStream("eg4.txt", true);
            int ch = 0;
            do{
                ch = input.read();
                output.write((char)ch);
            }while(ch!=-1);
        } catch(FileNotFoundException ex) {
            System.out.println("HAndled");
        } finally{
            out.close();
            input.close();
            output.close();
            src.close();
        }
    }
}
