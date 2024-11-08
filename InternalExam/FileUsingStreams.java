// Write a JAVA program that read from a file and write to file by handling all file related exceptions.
// (use FileInputStream and FileOutputStream classes)  



package InternalExam;
import java.io.*;

class FileUsingReaderWriter {
    public static void main(String[] args) throws IOException {
        FileInputStream input = null;
        FileOutputStream output = null;
        int ch;
        try{
            input = new FileInputStream("eg.txt");
            output = new FileOutputStream("eg2.txt");
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
            System.out.println("Written to File Successfully!");
        }
    }
}
