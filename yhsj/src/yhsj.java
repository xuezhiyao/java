

import java.util.*;//����

public class yhsj//����

{

public static void main(String[] args)//����һ�������������ã�ʵ�ֿ���̨�����������Ϊ��������ַ�������a.show���ö����ʱ��ǿ��ת��һ�¡�

{

YangHui a = new YangHui();

Scanner s = new Scanner(System.in);  

         System.out.println("������һ�����ִ���������");   

         String str = s.nextLine();   

    a.show(Integer.valueOf(str));

}

}

class YangHui//�����������

{

  public void show(int n)

  {

int[][] s = new int[n+1][n+1];//�����ά���飬��Ϊ��n�У����Զ���n+1����ֹ�����ѭ����1��ʼ��

for (int x=1;x<=n ;x++ )//�˴�ѭ�����ڿ�������

{

for (int z=1;z<=n+1-x ;z++ )//��Сѭ�����ڿ���ÿ��ǰ��Ŀո�����Խ����Խ�����룬�Լ�����һ��

{

System.out.print(" ");

}

for (int y=1;y<=x ;y++ )//��ѭ�����ڿ���ÿ�и���

{

if (y==1)//�̶�ÿ�е�һ������ֵ���������ά���飬����ӡ

{

System.out.print(y+" ");

s[x][y]=1;

}

else if(y==x)//�̶�ÿ�����һ������ֵ���������ά���飬����ӡ

{

System.out.print(1+" ");

s[x][y]=1;

}

else//���ڴ�ӡ������ÿ�е�һ�������һ�����м���ֵ���������ά����

{

System.out.print(s[x-1][y-1]+s[x-1][y]+" ");//ÿһ�е��м���ֵ����������һ�е�s[x-1][y-1]+s[x-1][y]��Ӷ��õ�,�������ά����

s[x][y]=s[x-1][y-1]+s[x-1][y];

}

}

System.out.println();//����

}

  }

}