class ExampleofConstructorOverloading{
	int no;
	String name;
	int age;
ExampleofConstructorOverloading(int n,String m){
no=n;
name=m;
}
ExampleofConstructorOverloading(int n,String m,int g){
no=n;
name=m;
age=g;
}
void PrintResult(){
System.out.println(no + "  " + name + "  " + age);
}
public static void main(String[] args) {
ExampleofConstructorOverloading a1=new ExampleofConstructorOverloading(001,"MUHOZA",19);	

ExampleofConstructorOverloading a2=new ExampleofConstructorOverloading(002,"MUTONI",20);
a1.PrintResult();
a2.PrintResult();
}
}