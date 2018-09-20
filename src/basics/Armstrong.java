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
public class Armstrong 
{
    public static void main(String args[])
    {
     int i,n,r,q,sum;
     for (i=1;i<=1000;i++)
      {
       n=i;
       sum=0;
        {
         while (n!=0)
          {
           r=n%10;
           n=n/10;
           sum=sum+(r*r*r);
          }
         if (sum==i)
          {
           System.out.println(i);
          }
         }
       }
    }
}
