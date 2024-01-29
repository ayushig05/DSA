package Array;
public class Reverse
{
    static void reverse(int[] arr, int n)
    {
        int i, j, t;
        for (i = 0; i < n / 2; i++)
        {
            t = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = t;
        }
        System.out.println("Reversed array is: \n");
        for (j = 0; j < n; j++)
        {
            System.out.println(arr[j]);
        }
    }
    public static void main(String[] args)
    {
        int[] arr = { 10, 20, 30, 40, 50 };
        reverse(arr, arr.length);
    }
}