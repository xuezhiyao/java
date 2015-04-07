
public class YH {
	
		 public static void main(String[]args){
		  int a[][]=new int[5][5];
		  for (int i=0;i<a.length ;i++ )
		  {
		   for (int j=0;j<a[i].length ;j++ )
		   {
		    if (j==0||i==j)
		    {
		       a[i][j]=1;
		    }
		     else{
		      if (i>j)
		      {
		       a[i][j]=a[i-1][j]+a[i-1][j-1];
		      }
		       }
		      }
		  }
		  for (int i=0;i<a.length ;i++ )
		  {
		   for (int j=0;j<a[i].length ;j++ )
		   {
		     if (i>=j)
		     {
		       System.out.print(a[i][j]+"\t");
		     }
		   }
		             System.out.println();
		  }
		}
		}



