
public class Person {
	private String name ;
	private String xingbie ;	
	private int age ;
	/*public  String getname(){
		return name;
		}
	public String getXingbie(){
		return xingbie;
	}
	public int getAge(){
		return age;
	}*/
	public boolean canMarry(){
		if((xingbie=="man"&&age>=22)||(xingbie=="woman"&&age>=20))
	{
	
		return true;
	}
	else
	{
		return false;
	}
	
	}
	public Person(String name,String xingbie,int age){
	this.name=name;
	this.age=age;
	this.xingbie=xingbie;
	};
	public void print(){
		System.out.println("Name:"+this.name);
		System.out.println("xingbie :"+this.xingbie);
		System.out.println("Age :"+this.age);
		if(this.canMarry()){
			System.out.println("i can marry !");
		}else{
			System.out.println("i can not marry !");
		}
	}
	public static void main(String args[]){
		Person wang=new Person("wangg","man",20);
		wang.print();
	}
}
