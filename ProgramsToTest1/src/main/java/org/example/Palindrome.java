package org.example;

public class Palindrome {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Palindrome p = new Palindrome();
        p.palin("ghfdsj");
    }

    public String palin(String str){

        String s = str;
        String s1 = "";

        char [] arr = s.toCharArray();


        for(int i=arr.length-1; i>=0; i--) {
            //System.out.print(arr[i]);
            s1 = s1 + arr[i];
        }
        System.out.println("Original String : "+s);
        System.out.println("Reversed String : "+s1);

        if(s.equals(s1)){
            System.out.println("It's a Palindrome");
        }
        else {
            System.out.println("It's not a palindrome");
        }

        return s1;

    }

}
