/*Write a program to odd position as Descending and ascending order of the given elements
  Example: Input: {13,2,4,15,12,10,5}
           Output: {15,2,13,4,12,5,10}*/

import java.util.*;
class getValues{
    int [] a= {13,2,4,15,12,10,5};
    int [] b = new int[a.length];
    void result(){
        Arrays.sort(a);
        int x = a.length-1;
        int y=0;
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                b[i]=a[x];
                x--;
            }else {
                b[i]=a[y];
                y++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
class BigAndSmall {
    public static void main(String[] args) {
        getValues ob = new getValues();
        ob.result();
    }
}
