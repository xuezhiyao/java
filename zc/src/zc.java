import java.util.Scanner;
public class zc {
	public int shu(int i)
	{
		
	return i%2 ;
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		zc f = new zc();
		for(int i=1; i<=n; i++)
			{if(f.shu(i)==0)
			{
			System.out.printf("%d ", i);	
			}
			}
		
	}

}
