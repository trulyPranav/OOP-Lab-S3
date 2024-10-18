// File handling using reader/writer Classes
// Write a file handling program in Java with reader/writer.


package InternalExam;
import java.io.*;
//import java.util.*;

class FileUsingReaderWriter {
    public static void main(String[] args) throws IOException {
        //Scanner src = new Scanner(System.in);
        // String source = src.nextLine();
        FileReader input = new FileReader("eg.txt");
        FileWriter output = new FileWriter("eg2.txt");
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
