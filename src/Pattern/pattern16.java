package Pattern;
public class pattern16
{
    void p16()
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        pattern16 ob=new pattern16();
        ob.p16();
    }
}


/*
Output:
 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5
*/