package Pattern;
public class pattern11
{
    void p11()
    {
        for (int i = 5; i >= 1; i--)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        pattern11 ob=new pattern11();
        ob.p11();
    }
}

/*
Output:
 5 4 3 2 1
 4 3 2 1
 3 2 1
 2 1
 1
*/