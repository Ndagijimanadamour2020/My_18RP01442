class ExampleOfParamerisedConstructor{
int num;
String name;
String email;
ExampleOfParamerisedConstructor(int n,String m,String e){
num=n;
email=e;
name=m;
}
void Display(){
System.out.println(num + " " + name + "  " + email);
}

public static void main(String[] args) {
ExampleOfParamerisedConstructor m1=new ExampleOfParamerisedConstructor(001,"NIZEYIMANA DANIEL","danielnizeyimana1@gmail.com");
ExampleOfParamerisedConstructor m2=new ExampleOfParamerisedConstructor(002,"NSENGIYUMVA EGIDE","egidensenga@gmail.com");
m1.Display();
m2.Display();	
}}