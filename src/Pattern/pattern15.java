package Pattern;
public class pattern15
{
    void p15()
    {
        for (int i = 1; i <= 5; i++)
        {
            char ch = (char)('A'+i-1);
            for (int j = 1; j <= i; j++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        pattern15 ob=new pattern15();
        ob.p15();
    }
}


/*
Output:
 A
 B B
 C C C
 D D D D
 E E E E E
*/