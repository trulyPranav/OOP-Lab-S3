package Exceptions;

import java.util.Scanner;

class TryCatchFinally {
    public static void main(String args[]) throws ArithmeticException {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = src.nextInt();
        int b = src.nextInt();
        try{
            if(a/b == 0)
                    throw new ArithmeticException("Division by Zero Encountered");
            System.out.println("Doing a/b: " + a/b);
        }
        catch(ArithmeticException ae){
            System.out.println("Exception Caught Successfully: " + ae);
        }
        finally{
            System.out.println("Inside Finally!");
            src.close();
        }
    }
}
