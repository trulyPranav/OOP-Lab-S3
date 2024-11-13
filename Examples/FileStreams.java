package Examples;

import java.io.*;

class FileStreams {
    public static void main(String[] args) throws IOException {
        FileReader input = null;
        FileWriter output = null;
        BufferedReader reader = null;
        try{
            input = new FileReader("eg6.txt");
            output = new FileWriter("eg7.txt");
            reader = new BufferedReader(input); // => .readLine();
            String ch;
            do{
                ch = reader.readLine();
                if (ch != null) {
                    output.write(ch);
                }
            } while(ch!=null);
        } catch(FileNotFoundException xe){
            System.out.println("Handled");
        } finally{
            input.close();
            output.close();
            reader.close();
        }
    }
}
