
import java.util.Scanner;
public class fdnaq {

	 //ʹ�õݹ鷽��
	 private int getFibo(int i) {
		 if(i==0)
			 return 0;
	  if (i == 1 || i == 2)
	  return 1;
	  else
	  return getFibo(i-1 ) + getFibo(i - 2);
	  }

	
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
	  System.out.println("쳲��������е�ǰn��Ϊ��");
	  fdnaq f = new fdnaq();
	  for (int j = 0; j <= n; j++) {
	   System.out.print(f.getFibo(j) + "\t");
	   }
	  }
	 }