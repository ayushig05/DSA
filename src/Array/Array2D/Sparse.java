package Array.Array2D;
import java.util.*;
public class Sparse
{
    int n;
    int[][] arr;
    public Sparse(int m)
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
    void sparse()
    {
        int c=0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if(arr[i][j] == 0)
                {
                    ++c;
                }
            }
        }
        if (c > ((n*n)/2))
        {
            System.out.println("The given matrix is sparse matrix");
        }
        else
        {
            System.out.println("The given matrix is not a sparse matrix");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of a square matrix");
        int m = sc.nextInt();
        Sparse ob = new Sparse(m);
        ob.input();
        System.out.println("The matrix is:");
        ob.display();
        ob.sparse();
    }
}