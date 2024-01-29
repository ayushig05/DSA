package Array.Array2D;

import java.util.Scanner;

public class SumOfCorner
{
    int n;
    int[][] arr;
    public SumOfCorner(int m)
    {
        n=m;
        arr=new int[n][n];
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void display()
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    void sumCorner()
    {
        int sum=0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                sum=arr[0][0]+arr[0][n-1]+arr[n-1][0]+arr[n-1][n-1];
            }
        }
        System.out.println("Sum="+sum);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of a square matrix");
        int m = sc.nextInt();
        SumOfCorner ob = new SumOfCorner(m);
        ob.input();
        System.out.println("The matrix is:");
        ob.display();
        System.out.println("Sum of the corner elements of the matrix is:");
        ob.sumCorner();
    }
}
