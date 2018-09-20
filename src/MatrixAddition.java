
import java.io.DataInputStream;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sandeep
 */
public class MatrixAddition 
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        int x[][]= new int[3][3];
        int y[][]= new int[3][3];
        int z[][]= new int[3][3];
        
        for (int r=0; r<3; r++)
        {
            for (int c=0; c<3;c++)
            {
            System.out.println("Enter a value in first array: ");
            x[r][c]=Integer.parseInt(d.readLine());
            }
        }
        
        for (int r=0; r<3; r++)
        {
            for (int c=0; c<3;c++)
            {
            System.out.println("Enter a value in second array: ");
            y[r][c]=Integer.parseInt(d.readLine());
            }
        }
        
        for (int r=0; r<3; r++)
        {
            for (int c=0; c<3;c++)
            {
                
                
                 z[r][c]=x[r][c]+y[r][c];
                
            }
        }
        
        System.out.println("The Array in forward order is: ");
        for (int r=0; r<3; r++)
        {
            for (int c=0; c<3; c++)
            {
                System.out.print(z[r][c]);
                System.out.print(" ");
            }
            System.out.println();
        }
              
            
        }
       
        
   
    }




    

