package com.mofizur.rahman;

/**
 * Created by Mofizur on 4/8/2016.
 */
public class UglyNumbers {
    public int maxDivide(int n, int d){
        while(n%d==0){
            n/=d;
        }
        return n;
    }
    public boolean isUgly(int n){
        n = maxDivide(n, 2);
        n = maxDivide(n, 3);
        n = maxDivide(n, 5);

        return n==1;
    }

    public int findNthUgly(int n){
        int count = 1;
        int i = 1;
        System.out.print(1+" ");
        while(count<n){
            i++;
            if(isUgly(i)) {
                System.out.print(i+" ");
                count++;
            }
        }

        System.out.println();
        return i;
    }
}
