package Pattern;
public class pattern12
{
    void p12()
    {
        for (int i = 5; i >= 1; i--)
        {
            for (int j = 5; j >= i; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        pattern12 ob=new pattern12();
        ob.p12();
    }
}

/*
Output:
 5
 5 4
 5 4 3
 5 4 3 2
 5 4 3 2 1
*/