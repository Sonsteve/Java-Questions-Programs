/*Find if a String2 is substring of String1.
If it is, return the index of the first occurrence. else return -1.

        Eg 1:Input:
        String 1: test123string
        String 2: 123
        Output: 4
        Eg 2: Input:
        String 1: testing12
        String 2: 1234
        Output: -1*/

import java.util.*;
class SubString{
    public static void main(String[] args) {
        String string = "testing123";
        String subString = "123";
        boolean s1 = string.contains(subString);
        if(s1==true){
            int x=string.indexOf(subString.charAt(0));
            System.out.println("Index of First occourence: "+x);
        }else {
            System.out.println("-1");
        }

    }
}
