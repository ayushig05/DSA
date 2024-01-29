package Pattern;
public class pattern13
{
    void p13()
    {
        int a = 0, b = 1,temp=1;
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(temp + " ");
                temp = a + b;
                a = b;
                b = temp;
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        pattern13 ob=new pattern13();
        ob.p13();
    }
}


/*
Output:
 1
 1 2
 3 5 8
 13 21 34 55
 89 144 233 377 610
*/