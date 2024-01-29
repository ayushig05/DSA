package Array.Searching;
public class linear_search
{
    void display(int[] arr, int n)
    {
        for (int i = 0; i < n ; i++)
        {
            System.out.println(arr[i]);
        }
    }
    void linearSearch(int[] arr, int n, int target)
    {
        for (int i = 0; i < n; i++)
        {
            if(arr[i]==target)
            {
                System.out.println("The element "+target+" was found at "+i);
                break;
            }
            else
            {
                System.out.println("The element "+target+" was not found");
            }
        }
    }
    public static void main(String[] args)
    {
        linear_search ob=new linear_search();
        int[] arr={2,8,34,74,93,47,16,83,92,48};
        int size=10;
        System.out.println("Array");
        ob.display(arr,size);
        System.out.println("Linear Search");
        ob.linearSearch(arr,size,93);
    }
}