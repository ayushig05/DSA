package Pattern;
public class pattern5
{
    void p5()
    {
        for (int i = 1; i <= 2*5-1; i++)
        {
            int tot_col_in_row= i>5 ? 2*5-i : i;
            for (int j = 1; j <= tot_col_in_row; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        pattern5 ob=new pattern5();
        ob.p5();
    }
}

/*
Output:
  *
  *  *
  *  *  *
  *  *  *  *
  *  *  *  *  *
  *  *  *  *
  *  *  *
  *  *
  *
*/