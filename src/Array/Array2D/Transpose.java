package Array.Array2D;
import java.util.*;
public class Transpose
{
    int m,n;
    int[][] arr;
    int[][] t;
    public Transpose(int r, int c)
    {
        m=r;
        n=c;
        arr = new int[m][n];
        t = new int[n][m];
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    void display()
    {
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    void transpose()
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                t[j][i] = arr[i][j];
            }
        }
    }
    void print()
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        Transpose ob = new Transpose(r,c);
        ob.input();
        System.out.println("The matrix is:");
        ob.display();
        System.out.println("Transpose elements of the matrix is:");
        ob.transpose();
        ob.print();
    }
}