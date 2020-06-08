package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeTest {

    @Test
    public void checkStringPalindrome1(){
        //Arrange
        Palindrome p = new Palindrome();

        //Act
        String result = p.palin("MADAM");

        //Aseert
        Assert.assertEquals(result,"MADAM");
    }

    @Test
    public void checkStringPalindrome2(){
        //Arrange
        Palindrome p = new Palindrome();

        //Act
        String result = p.palin("AMAZON");

        //Aseert
        Assert.assertEquals(result,"AMAZON");
    }

    @Test
    public void checkStringPalindrome3(){
        //Arrange
        Palindrome p = new Palindrome();

        //Act
        String result = p.palin("123454321");

        //Aseert
        Assert.assertEquals(result,"123454321");
    }

    @Test
    public void checkStringPalindrome4(){
        //Arrange
        Palindrome p = new Palindrome();

        //Act
        String result = p.palin("MALAYALAM");

        //Aseert
        Assert.assertEquals(result,"MALAYALAM");
    }

    @Test
    public void checkStringPalindrome5(){
        //Arrange
        Palindrome p = new Palindrome();

        //Act
        String result = p.palin("a0b1c1b0a");

        //Aseert
        Assert.assertEquals(result,"a0b1c1b0a");
    }

    @Test
    public void checkStringPalindrome6(){
        //Arrange
        Palindrome p = new Palindrome();

        //Act
        String result = p.palin(" ");

        //Aseert
        Assert.assertEquals(result," ");
    }
}
