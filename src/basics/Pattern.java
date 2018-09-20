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
public class Pattern 
{
    public static void main(String args[]) throws IOException
    {
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=i; j++)
                System.out.print(j);
            System.out.println();
            
        }
    }
}


