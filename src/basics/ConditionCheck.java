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
public class ConditionCheck 
{
    public static void main(String args[])
    {
        int A,B,C;
        DataInputStream d=new DataInputStream(System.in);
        
        try
        {
            System.out.println("Enter first value: ");
            A=Integer.parseInt(d.readLine());
            System.out.println("Enter Second Value: ");
            B=Integer.parseInt(d.readLine());
            System.out.println("Enter Second Value: ");
            C=Integer.parseInt(d.readLine());
            if((A>B)&&(A>C))
                System.out.println("The greater of "+A+", "+B+" and "+C+" is "+A);
            else if ((B>A)&&(B>C))
                System.out.println("The greater of "+A+", "+B+" and "+C+" is "+B);
            else if (((A>B)&&(C>A))||((B>A)&&(C>B)))
                System.out.println("The greater of "+A+", "+B+" and "+C+" is "+C);   
        }
        
        catch(Exception e)
        {
        }
        
        }
    }
