package Array.Searching;
public class binary_search
{
    void display(int[] arr, int n)
    {
        for (int i = 0; i < n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    int binarySearch(int[] arr, int n, int target)
    {
        int low, mid, high;
        low = 0;
        high = n - 1;
        while (low <= high)
        {
            mid = (low + high) / 2;
            if (arr[mid] == target)
            {
                return mid;
            }
            // for ascending                       //for descending
            else if (arr[mid] < target)           //else if(arr1[mid]>target)
            {                                      //{
                low = mid + 1;                     //   low=mid-1;
            }                                      //}
            else                                   //else
            {                                      //{
                high = mid - 1;                    //   high=mid+1;
            }                                      //}
        }
        return -1;
    }
    public static void main(String[] args)
    {
        binary_search ob=new binary_search();
        int size = 10;
        int[] arr={2,5,8,14,19,26,32,39,47,56};
        System.out.println("Array");
        ob.display(arr,size);
        int target=14;
        System.out.println("Binary Search");
        int res = ob.binarySearch(arr,size,target);
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