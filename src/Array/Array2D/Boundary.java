package Array.Array2D;
import java.util.*;
public class Boundary
{
    int n;
    int[][] arr;
    public Boundary(int m)
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
    void boundary()
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if(i==0 || j==0 || i==n-1 || j==n-1)
                {
                    System.out.print(arr[i][j]+" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of a square matrix");
        int m = sc.nextInt();
        Boundary ob = new Boundary(m);
        ob.input();
        System.out.println("The matrix is:");
        ob.display();
        System.out.println("Boundary elements of the matrix is:");
        ob.boundary();
    }
}