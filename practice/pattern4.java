package practice;
public class pattern4 {
    public static void main(String[] args) {
        int i,j;
	int k=5;
	for(i=5; i>=1; i--)
	{
		for(j=1; j<=k; j++)
		{
			if(j>=i)
				System.out.print("1");
			else
            System.out.print(" ");
		}
		k++;
	System.out.println();
	}

    }
    
}
