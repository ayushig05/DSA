package Pattern;
public class pattern6
{
    void p6()
    {
        for (int i = 1; i <= 2*5-1; i++)
        {
            int tot_col_in_row=i>5 ? 2*5-i : i;
            int space=5-tot_col_in_row;
            for (int k = 1; k <= space; k++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= tot_col_in_row; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        pattern6 ob=new pattern6();
        ob.p6();
    }
}

/*
Output:
     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
*/