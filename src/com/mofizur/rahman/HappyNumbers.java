package com.mofizur.rahman;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mofizur on 4/8/2016.
 */
public class HappyNumbers {
    public boolean isHappy(int n){
        Set<Integer> unique = new HashSet<Integer>();
        int value = 0;
        while(unique.add(n)){
            value=0;
            while(n>0){
                int num=n%10;
                value+= num*num;
                n/=10;
            }
            n=value;
        }

        return n==1;
    }
}
