import java.util.Scanner;
class Palindrome{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Type here: ");
        String string = in.next();
        StringBuilder ne = new StringBuilder();
        int len = string.length()-1;
        for(int i=len;i>=0;i--){
            ne.append(string.charAt(i));
        }
        if(ne.toString().equals(string)){
            System.out.println(string+" is a palindrome series");
        }
        else{
            System.out.println("It is not palindrome");
        }

    }
}
