
import java.util.*;//导包

class Demo//主类

{

public static void main(String[] args)//创建一个对象用来调用，实现控制台输入输出，因为输入的是字符，所以a.show调用对象的时候强调转换一下。

{

YangHui a = new YangHui();

Scanner s = new Scanner(System.in);  

         System.out.println("请输入一个数字代表行数：");   

         String str = s.nextLine();   

    a.show(Integer.valueOf(str));

}

}

class YangHui//对象调用类名

{

  public void show(int n)

  {

int[][] s = new int[n+1][n+1];//定义二维数组，因为是n行，所以定义n+1，防止溢出（循环从1开始）

for (int x=1;x<=n ;x++ )//此大循环用于控制行数

{

for (int z=1;z<=n+1-x ;z++ )//此小循环用于控制每行前面的空格数，越往后越不对齐，自己调整一下

{

System.out.print(" ");

}

for (int y=1;y<=x ;y++ )//此循环用于控制每行个数

{

if (y==1)//固定每行第一个数的值，并赋予二维数组，并打印

{

System.out.print(y+" ");

s[x][y]=1;

}

else if(y==x)//固定每行最后一个数的值，并赋予二维数组，并打印

{

System.out.print(1+" ");

s[x][y]=1;

}

else//用于打印出除开每行第一个与最后一个的中间数值，并赋予二维数组

{

System.out.print(s[x-1][y-1]+s[x-1][y]+" ");//每一行的中间数值，都是由上一行的s[x-1][y-1]+s[x-1][y]相加而得到,并赋予二维数组

s[x][y]=s[x-1][y-1]+s[x-1][y];

}

}

System.out.println();//换行

}

  }

}
