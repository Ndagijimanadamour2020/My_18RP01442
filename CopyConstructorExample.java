class ExampleofCopyconstructor{
int id;
String ecole;
String dept;
ExampleofCopyconstructor(int i,String e,String d){
id=i;
ecole=e;
dept=d;
}
ExampleofCopyconstructor(ExampleofCopyconstructor s){
id=s.id;
ecole=s.ecole;
dept=s.dept;
}
void Display(){
System.out.println(id + " " + ecole + "  " + dept);
}

public static void main(String[] args) {
ExampleofCopyconstructor m1=new ExampleofCopyconstructor(001,"IPRC_TUMBA","IT");
ExampleofCopyconstructor m2=new ExampleofCopyconstructor(m1);
m1.Display();
m2.Display();	
}
}