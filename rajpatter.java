public class rajpatter {
    public static void main(String[] args) {
        

        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=5;k>=i;k--)
            {
                if(i==2 && k==3)
                {
                    System.out.print("R");
                }
                else if(i==2 && k==2)
                {
                    System.out.print("A");
                }
                else
                System.out.print("*");
            }
            for(int p=5;p>i;p--)
            {
                if(i==2 && p==5)
                {
                    System.out.print("J");
                }
                else
                {
                System.out.print("*");
                }

            }
            System.out.println();
        }
    }
    
}
