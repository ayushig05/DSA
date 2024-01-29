package Array.Array2D;
import java.util.*;
public class Reverse
{
    int n;
    int[][] arr;
    public Reverse(int m)
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
    int reverse(int x)
    {
        int rev=0,d;
        while(x!=0)
        {
            d = x % 10;
            rev = rev * 10 + d;
            x = x / 10;
        }
        return rev;
    }
    void revMatrix()
    {
        int[][] reversedMatrix = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                reversedMatrix[i][j]=reverse(arr[i][j]);
            }
        }
        arr = reversedMatrix;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of a square matrix");
        int m = sc.nextInt();
        Reverse ob = new Reverse(m);
        ob.input();
        System.out.println("The matrix is:");
        ob.display();
        System.out.println("Reversed each element of the matrix is:");
        ob.revMatrix();
        ob.display();
    }
}