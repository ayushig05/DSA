package Pattern;
public class pattern8
{
    void p8()
    {
        for (int i = 1; i <= 2*5; i++)
        {
            int col=i>5 ? 2*5-i : i;
            int space=5-col;
            for (int k = 1; k <= space; k++)
            {
                System.out.print(" ");
            }
            for (int j = col; j >= 1; j--)
            {
                System.out.print(j);
            }
            for (int j = 2; j <= col; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        pattern8 ob=new pattern8();
        ob.p8();
    }
}

/*
Output:
     1
    212
   32123
  4321234
 543212345
  4321234
   32123
    212
     1
*/