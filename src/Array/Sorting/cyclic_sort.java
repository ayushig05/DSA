package Array.Sorting;
public class cyclic_sort
{
    void display(int[] arr, int n)
    {
        for (int i = 0; i < n ; i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
    void cyclicSort(int[] arr)
    {
        int i=0,temp;
        while(i<arr.length)
        {
            int c=arr[i]-1;
            if(arr[i]!=arr[c])
            {
                temp=arr[i];
                arr[i]=arr[c];
                arr[c]=temp;
            }
            else
            {
                i++;
            }
        }
    }
    public static void main(String[] args)
    {
        cyclic_sort ob=new cyclic_sort();
        int[] arr={2,6,3,9,1,7,8,4,5};
        int size=9;
        System.out.println("Array");
        ob.display(arr,size);
        System.out.println("\nCyclic Sort");
        ob.cyclicSort(arr);
        ob.display(arr,size);
    }
}