package Array.Array2D;
import java.util.*;
public class Mirror
{
    int n;
    int[][] arr;
    public Mirror(int m)
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
    void mirror()
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = n-1; j >= 0; j--)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of a square matrix");
        int m = sc.nextInt();
        Mirror ob = new Mirror(m);
        ob.input();
        System.out.println("The matrix is:");
        ob.display();
        System.out.println("Mirror image of the matrix is:");
        ob.mirror();
    }
}