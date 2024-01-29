package Array.Array2D;
import java.util.*;
public class RotateAntiClockwise
{
    int n;
    int[][] arr;
    public RotateAntiClockwise(int m)
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
    void rotateAntiClockwise()
    {
        for (int i = n-1; i >= 0; i--)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of a square matrix");
        int m = sc.nextInt();
        RotateAntiClockwise ob = new RotateAntiClockwise(m);
        ob.input();
        System.out.println("The matrix is:");
        ob.display();
        System.out.println("Rotated 90 degree clockwise matrix is:");
        ob.rotateAntiClockwise();
    }
}