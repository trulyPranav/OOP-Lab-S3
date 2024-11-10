package Files;
import java.util.*;
import java.io.*;

public class PalindromicSubstring {
    static boolean isPalindrome(String s){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=s.charAt((s.length())-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        Scanner src = new Scanner(System.in);
        String mainSrc = src.nextLine();
        src.close();
        StringTokenizer srz = new StringTokenizer(mainSrc, " ", false);
        String longestString = "";
        while(srz.hasMoreTokens()){
            String token = srz.nextToken();
            if(isPalindrome(token) && token.length()>longestString.length()){
                longestString = token;
            }
        }
        FileWriter fOut = new FileWriter("eg2.txt", true);
        //System.out.println(longestString);
        try{
            char buffer[] = new char[longestString.length()];
            longestString.getChars(0, longestString.length(), buffer, 0);
            fOut.write(buffer);
            if(longestString.length()%2!=0){
                throw new IllegalAccessException("ODD Palindrome");
            }else throw new IllegalAccessException("EVEN Palindrome");
        } catch(FileNotFoundException fn){
            System.out.println("Exception Handled");}
        catch(IllegalAccessException iAE){
            System.out.println(iAE);
            System.out.println("Exception Handled");
        } finally{
            fOut.close();
        }
    }
}
