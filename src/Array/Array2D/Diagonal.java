package Array.Array2D;
import java.util.*;
public class Diagonal
{
    int n;
    int[][] arr;
    public Diagonal(int m)
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
    void diagonal()
    {
        int sum=0, sumL=0, sumR=0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if((i==j) || (i+j==n-1))
                {
                    System.out.print(arr[i][j]+" ");
                    sum=sum+arr[i][j];
                }
                else
                {
                    System.out.print(" ");
                }
                if(i==j)
                {
                    sumL=sumL+arr[i][j];
                }
                else if(i+j==n-1)
                {
                    sumR=sumR+arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Sum="+sum);
        System.out.println("Left Sum="+sumL);
        System.out.println("Right Sum="+sumR);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of a square matrix");
        int m = sc.nextInt();
        Diagonal ob = new Diagonal(m);
        ob.input();
        System.out.println("The matrix is:");
        ob.display();
        System.out.println("Diagonal elements of the matrix are:");
        ob.diagonal();
    }
}