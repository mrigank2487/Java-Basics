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
public class BubbleSorts 
{

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String args[]) throws IOException
  {
      DataInputStream d= new DataInputStream(System.in);
      int x[]= new int[5];
      int a,i,temp;
     for (i=0;i<5;i++)
      {
        System.out.println("Enter a value");
        x[i]=Integer.parseInt(d.readLine());
      }
     for (int j=0;j<4;j++)
      {
        for (a=0;a<4;a++)
        {
            if (x[a]>x[a+1])
            {
                temp=x[a];
                x[a]=x[a+1];
                x[a+1]=temp;
            }
        }
      }
    for (i=0;i<5;i++)
    {
        System.out.println(x[i]);
    }
  }
}
