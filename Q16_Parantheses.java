/*Remove unbalanced parentheses in a given expression.

                Eg.) Input  : ((abc)((de))
                    Output : ((abc)(de))

                Input  : (((ab)
                Output : (ab)*/

import java.util.ArrayList;

class parenthese {
    public static void main(String[] args) {
        String s = "((abc)((de))";
        ArrayList<Character> a = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            a.add(s.charAt(i));
        }
        int temp=a.size()-1;
        System.out.println(a);
        for(int i=0;i<a.size();i++){
            if(a.get(i)<47 && a.get(temp)>97){
                a.remove(i);
            } else if (a.get(i)>97 && a.get(temp)<47) {
                a.remove(temp);
            }
            temp--;
        }
        System.out.println(a);
    }
}
