import java.util.Scanner;
public class PrimeNumberCheck{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int Number = in.nextInt();
        if(Number%2==0 || Number%3==0 || Number%5==0 || Number%7==0){
            System.out.println("The given Number is Not a 'Prime number'!!");
        }
        else{
            System.out.println("It is PRIME NUMBER");
        }
    }
}
