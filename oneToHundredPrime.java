class oneToHundredPrime{
    public static void main(String[] args){
        int num = 100;
        // 1 is not prime number (1 is natural number)
        for(int i=1;i<=num;i++) {
        int temp=0;
        /*Prime number has the rule which that the given number is to be
          divided only by one and by its self so here I create temp variable to
          check the number is only dividable by two numbers. */
        for(int j=1;j<=i;j++){
            if(i%j==0){
                temp++;
            }
        }
        if(temp==2){
            System.out.print(i+", ");
        }
        }

    }
}
