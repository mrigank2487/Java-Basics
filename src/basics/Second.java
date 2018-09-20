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
public class Second 
{
    public static void main(String args[])
    {
        int A,B,sum;
        DataInputStream d=new DataInputStream(System.in);
        
        try
        {
            System.out.println("Enter first value");
            A=Integer.parseInt(d.readLine());
            System.out.println("Enter Second Value");
            B=Integer.parseInt(d.readLine());
            sum=A+B;
            System.out.println("The sum of "+A+" and "+B+" = "+sum);
            
        }
        
        catch(Exception e)
        {
        }
     }
}

