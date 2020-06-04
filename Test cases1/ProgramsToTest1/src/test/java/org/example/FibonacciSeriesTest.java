package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;


    public class FibonacciSeriesTest {

        @Test
        public void FibonacciSeriesTest1(){
            //Arrange
            FibonacciSeries a = new FibonacciSeries();

            //Act
            String result = a.fibonacci(10);

            //Aseert
            Assert.assertEquals(result,"0 1 1 2 3 5 8 13 21 34 55 89 144" );
        }

        public void FibonacciSeriesTest2(){
            //Arrange
            FibonacciSeries a = new FibonacciSeries();

            //Act
            String result = a.fibonacci(5);

            //Aseert
            Assert.assertEquals(result,"0 1 1 2 3 5 8 13" );
        }

        public void FibonacciSeriesTest3(){
            //Arrange
            FibonacciSeries a = new FibonacciSeries();

            //Act
            String result = a.fibonacci(2);

            //Aseert
            Assert.assertEquals(result,"0 1 1 2 3" );
        }

        public void FibonacciSeriesTest4(){
            //Arrange
            FibonacciSeries a = new FibonacciSeries();

            //Act
            String result = a.fibonacci(-3);

            //Aseert
            Assert.assertEquals(result,"0 1" );
        }
    }

