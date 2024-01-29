package Pattern;
public class pattern3
{
    void p3()
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 5; j >= i; j--)     //for (int j = 1; j <= n+1-i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        pattern3 ob=new pattern3();
        ob.p3();
    }
}

/*
Output:
 *****
 ****
 ***
 **
 *
*/