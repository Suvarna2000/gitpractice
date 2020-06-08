package org.example;

public class ReverseAString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ReverseAString r = new ReverseAString();
        r.reverseString("abc");

    }

    public String reverseString(String str){
        String s = str;
        String s1 = "";

        char [] arr = s.toCharArray();


        for(int i=arr.length-1; i>=0; i--) {
            //System.out.print(arr[i]);
            s1 = s1 + arr[i];
        }
        System.out.print(s1);
        return s1;
    }

}

