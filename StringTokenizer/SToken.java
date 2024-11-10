// Write a Java program that reads a line of integers, 
// and then displays each integer, and the sum of all the integers (use StringTokenizer class of java.util)

package StringTokenizer;
import java.util.Scanner;
import java.util.StringTokenizer;

class SToken {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String source = src.nextLine();
        StringTokenizer stz = new StringTokenizer(source," ", false);
        System.out.println("Individual:");
        int sum = 0;
        src.close();
        while(stz.hasMoreTokens()){
            String token = stz.nextToken();
            int no = Integer.parseInt(token);
            System.out.println(token);
            sum += no;
        }
        System.out.println("Sum is: " + sum);
    }
}
