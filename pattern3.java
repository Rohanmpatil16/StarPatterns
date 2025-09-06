public class pattern3 {
public static void main(String[] args) {
    int n=5;
    for(int i=0;i<5;i++)
    {
        for(int j=n;j>i;j--)
        {
            System.out.print("\t");
        }

        for(int j=0;j<i;j++)
        {
            System.out.print("*\t");
        }

        for(int j=1;j<i;j++)
        {
            System.out.print("*\t");
        }
        System.out.println();
    }

}    
}
