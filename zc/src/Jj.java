
public class Jj {
	 static String  strs[][]={{"一一得一"},{"一二得二","二二得四"},{"一三得三","二三得六","三三得九"},{"一四得四","二四得八","三四十二","四四十六"}};
	public static void main(String[] args)
	{
	for(int i=0;i<=3;i++)
	{
		for(int j=0;j<=i;j++)
		{
			
		System.out.printf("%s  ",strs[i][j]);	
			
		}
		System.out.println();
		
	}
		}
}
