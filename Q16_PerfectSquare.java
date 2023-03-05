/*
Given two numbers a and b both < 200 we have to find the perfect square numbers which lie between a and b(inclusive)
eg) i/p a = 20;b = 100;
      o/p 25,36,49,64,81,100
*/

import java.util.*;
class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Starting number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Ending number: ");
        int num2 = sc.nextInt();
        int x,y;
        if(num1>num2){
            x=num1;
            y=num2;
        }else {
            x=num2;
            y=num1;
        }
        for(int i=y;i<=x;i++){
            for (int j=1;j<=x/10;j++){
                if(i==(j*j)){
                    System.out.print(i+", ");
                }
            }
        }
    }
}
