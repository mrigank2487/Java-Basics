/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basics;

/**
 *
 * @author Sandeep
 */

import java.io.*;
public class Third
{
    public static void main(String args[])
    {
        int A,B,sum,product,difference;
        float remainder;
        
        DataInputStream d=new DataInputStream(System.in);
        
        try
        {
            System.out.println("Enter first value");
            A=Integer.parseInt(d.readLine());
            System.out.println("Enter Second Value");
            B=Integer.parseInt(d.readLine());
            sum=A+B;
            product=A*B;
            difference=A-B;
            remainder=(float)A/(float)B;
            System.out.println("The sum of "+A+" and "+B+" = "+sum);
            System.out.println("The product of "+A+" and "+B+" = "+product);
            System.out.println("The difference of "+A+" and "+B+" = "+difference);
            System.out.println("The remainder of "+A+" and "+B+" = "+remainder);
            
        }
        
        catch(Exception e)
        {
        }
     }
}

