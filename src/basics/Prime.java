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
//import java.io.*;
public class Prime 
{
    
    public static void main(String args[])
    {
        
        for(int i=0; i<=100; i++)
        {
            int c=0;
            for (int j=1; j<=i; j++)
            {
            if(i%j==0)
               c++;
            
            }
            if(c==2)
                System.out.println(i);
            
        }
        
        
    }
    
}

