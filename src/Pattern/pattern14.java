package Pattern;
public class pattern14
{
    void p14()
    {
        for (int i = 1; i <= 5; i++)
        {
            char ch = 'A';
            for (int j = 1; j <= i; j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        pattern14 ob=new pattern14();
        ob.p14();
    }
}


/*
Output:
 A
 A B
 A B C
 A B C D
 A B C D E
*/