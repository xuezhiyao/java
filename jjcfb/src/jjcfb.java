
import java.util.Scanner;
public class jjcfb{
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		jjcfb f = new jjcfb();
		for(int i=1; i<=n; i++)
			{if(i%2==0&&i%3==0)
			{
			System.out.printf("%d ", i);	
			}
			}
		
	}

}