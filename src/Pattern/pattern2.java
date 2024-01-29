package Pattern;
public class pattern2
{
    void p2()
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        pattern2 ob=new pattern2();
        ob.p2();
    }
}

/*
Output:
 *
 **
 ***
 ****
 *****
*/