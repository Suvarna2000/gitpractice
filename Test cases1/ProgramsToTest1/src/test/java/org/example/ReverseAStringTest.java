package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseAStringTest {
    @Test
    public void checkStringUppercase(){
        //Arrange
        ReverseAString r = new ReverseAString();

        //Act
        String result = r.reverseString("SHADOW");

        //Aseert
        Assert.assertEquals(result,"WODAHS");
    }

    @Test
    public void checkStringLowercase(){
        //Arrange
        ReverseAString r = new ReverseAString();

        //Act
        String result = r.reverseString("market");

        //Aseert
        Assert.assertEquals(result,"tekram");
    }

    @Test
    public void checkStringMixedcase(){
        //Arrange
        ReverseAString r = new ReverseAString();

        //Act
        String result = r.reverseString("MaGiC");

        //Aseert
        Assert.assertEquals(result,"CiGaM");
    }

    @Test
    public void checkStringNumeric(){
        //Arrange
        ReverseAString r = new ReverseAString();

        //Act
        String result = r.reverseString("12345");

        //Aseert
        Assert.assertEquals(result,"54321");
    }

    @Test
    public void checkStringRandom(){
        //Arrange
        ReverseAString r = new ReverseAString();

        //Act
        String result = r.reverseString("w#K9@'la-5");

        //Aseert
        Assert.assertEquals(result,"5-al'@9K#w");
    }
}


