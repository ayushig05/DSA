package Recursion.Recursion1;
public class Binary
{
    void display(int[] arr, int n)
    {
        for (int i = 0; i < n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    int binary(int[] arr, int target, int start, int end)
    {
        if(start>end)
        {
            return -1;
        }
        else
        {
            int mid=(start+end)/2;
            if (arr[mid] == target)
            {
                return mid;
            }
            if (arr[mid] < target)
            {
                return binary(arr,target,mid+1,end);
            }
            else
            {
                return binary(arr,target,start,mid-1);
            }
        }
    }
    public static void main(String[] args)
    {
        Binary ob=new Binary();
        int size = 10;
        int[] arr={2,5,8,14,19,26,32,39,47,56};
        System.out.println("Array");
        ob.display(arr,size);
        int target=14;
        int low, high;
        low = 0;
        high = size - 1;
        System.out.println("Binary Search");
        int res = ob.binary(arr,target,low,high);
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