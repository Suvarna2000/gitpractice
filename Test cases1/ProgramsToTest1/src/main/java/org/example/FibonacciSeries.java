package org.example;

/*Write a program that prints a fibonaci series that is a sequence of numbers
like0 1 1 2 3 5 8.You can vary the number of elements to be printed meaning
you can print 10 numbers or 15 or 20 or any desired number. */

public class FibonacciSeries {

    public static void main(String[] args) {

        FibonacciSeries f = new FibonacciSeries();
        f.fibonacci(10);
    }
        // TODO Auto-generated method stub

    public String fibonacci(int a){
        int count = 10; //loop count for fibonacci series
        int num = 0;
        int num1 = 1;
        int num2;
        String series1 = " ";

        System.out.print("Fibonnaci Series : ");
        System.out.print(num);
        System.out.print(" ");
        System.out.print(num1);
        System.out.print(" ");
        series1 = num + " " + num1 + " ";

        String series2 = " ";
        for(int i=0; i<=count; i++)
        {
            num2 = num + num1;
            series2 = series2+num2 + " ";
            num = num1;
            num1 = num2;
        }

        String series = series1 + series2;
        return(series);
    }

}

/*output:
	Fibonnaci Series : 0 1 1 2 3 5 8 13 21 34 55 89 144   */