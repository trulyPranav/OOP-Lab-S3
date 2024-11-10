// Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates.


package Exceptions;
import java.util.Scanner;

class UserDefined {
    public static void main(String[] args) {
        System.out.println("Enter Integer List: ");
        int li[] = new int[5];
        Scanner src = new Scanner(System.in);
        for(int i = 0; i<5; i++)
            li[i] = src.nextInt();
        src.close();
        try{
            for(int i=0; i<li.length; i++){
                for(int j=0; j<li.length; j++){
                    if(i!=j){
                        if(li[i] == li[j])
                            throw new IllegalAccessException("Duplicate Found");
                    }
                }
            }
        } catch(Exception ae){
            System.out.println(ae);
            System.out.println("Duplicate Found");
        }

    }    
}
