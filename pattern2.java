public class pattern2
{
    public static void main(String args[])
    {
        for(int i=0;i<5;i++)
        {
            for(int j=-1;j<i;j++)
            {
                System.out.print("*\t");
            }
            

             for(int k=4;k>i;k--)
             {
                 System.out.print(" \t\t");
             }

            

             for(int m=-1;m<i;m++)
             {
                System.out.print("*\t");
             }
            System.out.println();

        }
    }
}