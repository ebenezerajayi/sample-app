package com.interswitch.maven;

import com.interswitch.maven.model.Calculate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Calculate calculate = new Calculate();
        calculate.addNumbers();
        System.out.println();
        calculate.subtractNumbers();
        System.out.println();
        calculate.multiplyNumbers();
        System.out.println();
        calculate.divideNumbers();
    }
}
