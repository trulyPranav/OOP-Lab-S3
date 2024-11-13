package Examples;

import java.util.*;

class StringToken {
    public static void main(String[] args) {
        String s = "HEllo My nname is prnv";
        StringTokenizer stz = new StringTokenizer(s, " ", false);
        do{
            System.out.print(
                stz.nextToken()
            );
        } while(stz.hasMoreTokens());
    }
}
