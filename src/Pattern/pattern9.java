package Pattern;
public class pattern9
{
    void p9()
    {
        int n = 5;
        int m = n;
        n = 2 * n;
        for (int i = 0; i <= n; i++)
        {
            for (int j = 0; j <= n; j++)
            {
                int val_at_ind=m-Math.min(Math.min(i,j), Math.min(n-i,n-j));
                System.out.print(val_at_ind+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        pattern9 ob=new pattern9();
        ob.p9();
    }
}

/*
Output:
 5 5 5 5 5 5 5 5 5 5 5
 5 4 4 4 4 4 4 4 4 4 5
 5 4 3 3 3 3 3 3 3 4 5
 5 4 3 2 2 2 2 2 3 4 5
 5 4 3 2 1 1 1 2 3 4 5
 5 4 3 2 1 0 1 2 3 4 5
 5 4 3 2 1 1 1 2 3 4 5
 5 4 3 2 2 2 2 2 3 4 5
 5 4 3 3 3 3 3 3 3 4 5
 5 4 4 4 4 4 4 4 4 4 5
 5 5 5 5 5 5 5 5 5 5 5
*/