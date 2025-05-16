  int rev = 0;
    while(n>0){
        int r = n%2;
        rev = rev*10+r;
        n/=2;
    }

    System.out.println(rev);
    int rev1=0;
    while (rev>0) {
        int r1= rev%10;
        rev1= rev1*10+r1;
        rev/=10;
        
    }
    System.out.println(rev1);
    