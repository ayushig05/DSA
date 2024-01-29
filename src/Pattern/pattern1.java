package Pattern;
public class pattern1
{
    void p1()
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        pattern1 ob=new pattern1();
        ob.p1();
    }
}

/*
Output:
 *****
 *****
 *****
 *****
 *****
*/