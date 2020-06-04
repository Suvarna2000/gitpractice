package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArmstrongNumberTest {

    @Test
    public void PositiveArmstrongTest(){
        //Arrange
        ArmstrongNumber a = new ArmstrongNumber();

        //Act
        int result = a.armstrongNum(153);

        //Aseert
        Assert.assertEquals(result,153);
    }

    @Test
    public void PositiveArmstrongTest2(){
        //Arrange
        ArmstrongNumber a = new ArmstrongNumber();

        //Act
        int result = a.armstrongNum(370);

        //Aseert
        Assert.assertEquals(result,370);
    }

    @Test
    public void NegativeArmstrongTest(){
        //Arrange
        ArmstrongNumber a = new ArmstrongNumber();

        //Act
        int result = a.armstrongNum(201);

        //Aseert
        Assert.assertEquals(result,201);
    }

    @Test
    public void NegativeArmstrongTest2(){
        //Arrange
        ArmstrongNumber a = new ArmstrongNumber();

        //Act
        int result = a.armstrongNum(31);

        //Aseert
        Assert.assertEquals(result,31);
    }
}
