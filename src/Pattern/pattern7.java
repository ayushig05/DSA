package Pattern;
public class pattern7
{
    void p7()
    {
        for (int i = 1; i <= 5; i++)
        {
            int space=5-i;
            for (int k = 1; k <= space; k++)
            {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        pattern7 ob=new pattern7();
        ob.p7();
    }
}

/*
Output:
     1
    212
   32123
  4321234
 543212345
*/