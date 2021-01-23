class MethodTest{ //class creation.
String names; //instance variables.
String reg_No;
String dept;
void InsertRecord(String r,String n,String d){
reg_No=r;
names=n;
dept=d;
}
void displayStudentInfo(){
System.out.println("The Student Reg_No is: " +reg_No);
System.out.println("The Student names is : " +names);
System.out.println("The Student is coming from: " +dept);
System.out.println("--------------------------------------");
}}
class MethodPrint{
//The line bellow is the creation of main method.
public static void main(String[] args) {
//we are going to create an object method.
MethodTest S1=new MethodTest();
MethodTest S2=new MethodTest();
S1.reg_No="18Rp01442";
S1.names="NDAGIJIMANA";
S1.dept="IT";
S2.reg_No="18Rp04445";
S2.names="MURAGE HONORE";
S2.dept="IT";
S1.displayStudentInfo();
S2.displayStudentInfo();
}}
