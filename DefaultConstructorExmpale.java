class DefConstructorExample{
	int id;
	String name;
void display(){
System.out.println(id + " " + name);
System.out.println(  "    "  );
}
public static void main(String[] args) {
DefConstructorExample b1=new DefConstructorExample();
DefConstructorExample b2=new DefConstructorExample();
DefConstructorExample b3=new DefConstructorExample();
b1.id=0001;
b1.name="NDAGIJIMANA D'AMOUR";
b1.display();
b2.id=0002;
b2.name="NIBAZE FLORA";
b2.display();
b3.id=0003;
b3.name="UFITIMANA PACIFIC";
b3.display();	
	}}