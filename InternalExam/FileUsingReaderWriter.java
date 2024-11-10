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
        BufferedReader reader = new BufferedReader(input);
        String ch;
        try{
            do{
                ch = reader.readLine();
                if (ch != null) {
                    output.write(ch); 
                    System.out.println(ch);
                }
            } while(ch!=null);
        } catch(FileNotFoundException fn){
            System.out.println("Handled");
        }
        finally{
            input.close();
            output.close();
            System.out.println("File Handled and Written Successfully!");
        }
    }
}
