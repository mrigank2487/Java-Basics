/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basics;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author Sandeep
 */
public class Matrix 
{
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    public static void main(String args[]) throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        int x[][]= new int[3][3];
        
        for (int r=0; r<3; r++)
        {
            for (int c=0; c<3;c++)
            {
            System.out.println("Enter a value: ");
            x[r][c]=Integer.parseInt(d.readLine());
            }
        }
        
        System.out.println("The Array in forward order is: ");
        for (int r=0; r<3; r++)
        {
            for (int c=0; c<3; c++)
            {
                System.out.print(x[r][c]);
                System.out.print(" ");
            }
            System.out.println();
        }
              
            
        }
       
        
   
    }




