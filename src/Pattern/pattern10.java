package Pattern;
public class pattern10
{
    void p10()
    {
        int n=1;
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        pattern10 ob=new pattern10();
        ob.p10();
    }
}

/*
Output:
 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15
*/