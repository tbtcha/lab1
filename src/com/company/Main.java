package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public int[] sumZero(int n) {
        int j = 0;
        List<Integer> res = new ArrayList<>();
        if (n%2==0){
            for (int i = -1*(n/2); i < n/2+1 ; i++, j++) {
                if(i!=0){
                    res.add(i);
                }
            }
        }
        else {
            for (int i = -1*(n/2); i < n/2+1 ; i++, j++) {
                res.add(i);
            }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }

    public int sumOddLengthSubarrays(int[] arr) {
        int res = 0;
        int i = 0,k = 0;
        while (i<arr.length){
            while (k<arr.length){
                for (int j = i; j <=k ; j++) {
                    res+=arr[j];
                }
                k+=2;
            }
            i++;
            k=i;
        }
        return res;
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s2 = String.join("", word2);
        String s1 = String.join("", word1);
        return s1.equals(s2);
    }

    public int numberOfSteps(int num) {
        int cnt = 0;
        while(num!=0){
            cnt++;
            if(num%2==0){
                num=num/2;
            }
            else{
                num-=1;
            }
        }
        return cnt;
    }

    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String s = String.valueOf(x);
        char[] c = s.toCharArray();
        char[] c1 = new char[s.length()];
        int j =s.length()-1;
        for (int i = 0; i < s.length(); i++) {
            c1[j] = c[i];
            j--;
        }
        String q = new String(c);
        String q1 = new String(c1);
        if(q.equals(q1)){
            return true;
        }
        return false;
    }

    public String restoreString(String s, int[] indices) {
        char[] k = s.toCharArray();
        char[] c = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            c[indices[i]] = k[i];
        }
        String b = new String(c);
        return b;
    }

    public static void main(String[] args) {

    }
}
