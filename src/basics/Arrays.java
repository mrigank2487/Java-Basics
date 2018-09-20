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
public class Arrays 
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        int x[]= new int[10];
        
        for (int i=0; i<10; i++)
        {
            System.out.println("Enter a value: ");
            x[i]=Integer.parseInt(d.readLine());
        }
        
        System.out.println("The Array in forward order is: ");
        for (int i=0; i<10; i++)
            System.out.println(x[i]); 
        System.out.println("The Array in reverse order is: ");
        for (int j=9; j>=0; j--)
            System.out.println(x[j]);
    }
}

