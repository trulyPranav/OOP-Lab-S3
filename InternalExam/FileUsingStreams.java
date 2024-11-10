// Write a JAVA program that read from a file and write to file by handling all file related exceptions.
// (use FileInputStream and FileOutputStream classes)  



package InternalExam;
import java.io.*;
//import java.util.*;

class FileUsingStreams {
    public static void main(String[] args) throws IOException {
        //Scanner src = new Scanner(System.in);
        // String source = src.nextLine();
        FileInputStream input = new FileInputStream("eg.txt");
        FileOutputStream output = new FileOutputStream("eg2.txt");
        int ch;
        try{
            do{
                ch = input.read();
                if (ch != -1) {
                    output.write((char)ch); 
                    System.out.println((char)ch);
                }
            } while(ch!=-1);
        } catch(FileNotFoundException fn){
            System.out.println("Handled");
        }
        finally{
            input.close();
            output.close();
        }
    }
}
