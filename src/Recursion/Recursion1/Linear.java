package Recursion.Recursion1;
public class Linear
{
    void display(int[] arr, int n)
    {
        for (int i = 0; i < n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    int linear(int[] arr,int n, int target)
    {
        if (n == 0)
        {
            return -1;
        }
        else if(arr[n-1] == target)
        {
            return n-1;
        }
        return linear(arr,n-1,target);
    }
    public static void main(String[] args)
    {
        Linear ob=new Linear();
        int[] arr={2,8,34,74,93,47,16,83,92,48};
        int size=10;
        System.out.println("Array");
        ob.display(arr,size);
        int target = 93;
        System.out.println("\nLinear Search");
        int res = ob.linear(arr,size,target);
        if (res == -1)
        {
            System.out.println("The element "+target+" was not found");
        }
        else
        {
            System.out.println("The element "+target+" was found at index "+res);
        }
    }
}