/*Check whether a given mathematical expression is valid.

        Eg.) Input  : (a+b)(a*b)
        Output : Valid

        Input  : (ab)(ab+)
        Output : Invalid

        Input  : ((a+b)
        Output : Invalid*/

import java.util.ArrayList;

class AsciiValues {
    public static void main(String[] args) {
        String s = "(a*b)(a+b)";
        int x=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)<=47 && s.charAt(i+1)>=90 || s.charAt(i)==41 && s.charAt(i+1)==40 ||s.charAt(i)>=90 && s.charAt(i+1)<=47){
                int xx = 0;
            }else{
                x++;
            }
        }
        if(x>0){
            System.out.println("invalid input");
        }else {
            System.out.println("valid input");
        }
    }
}
