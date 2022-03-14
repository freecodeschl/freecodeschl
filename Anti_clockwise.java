/*
Anti clockwise
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an N*N matrix. Print the elements of the matrix in anticlockwise order (see the sample for better understanding).
Input
First line contains N.
N lines follow each containing N space seperated integers.

Constraints:-
2 <= N <= 500
1 <= Mat[i][j] <= 1000
Output
Output N*N integers in a single line separated by spaces, which are the elements of the matrix in anti-clockwise order.
Example
Sample Input
4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

Sample output
1 5 9 13 14 15 16 12 8 4 3 2 6 10 11 7

Sample Input
3
1 2 3
4 5 6
7 8 9

Sample output
1 4 7 8 9 6 3 2 5

*/



import java.io.*; 
import java.util.*;
class Main {
     public static void anti_spiral_print(int [][] a , int n)
     {
          int r_start=0,c_start=0,c_end=n,r_end=n,i=0;
          while(r_start<r_end && c_start<c_end)
          {

               for(i=r_start; i<r_end; i++) //0 1 2
               {
                    System.out.print(a[i][c_start]+" ");   //row,coloum
               }
               c_start++;
               for(i=c_start; i<c_end; i++)
               {
                     System.out.print(a[r_end-1][i]+" ");
               }
               r_end--;
               if(c_start<c_end)
               {
                    for(i=r_end-1; i>=r_start; --i)
                    {
                         System.out.print(a[i][c_end-1]+ " ");
                    }
                    c_end--;
               }
               if(r_start<r_end)
               {
                    for(i=c_end-1; i>=c_start; i--)
                    {
                         System.out.print(a[r_start][i]+ " ");
                    }
                    r_start++;
               }

          }

     }
	public static void main (String[] args) {
          Scanner sc = new Scanner(System.in);
          int n=sc.nextInt();
          int [][] arr = new int[n][n];
          for(int i=0; i<n; i++)
          {
               for(int j=0; j<n; j++)
               {
                    arr[i][j]=sc.nextInt();
               }
          }
          anti_spiral_print(arr,n);
	}
}
