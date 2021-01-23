class Account{
int acc_no;
String names;
float amount;
void InsertRecord(int n,String s,float amt){
acc_no=n;
names=s;
amount=amt;
}
//To deposit
void DepositMoney(float amt){
amount=amount+amt;
System.out.println("The amount deposited is: " +amt);
System.out.println(  "   "    );
}
void WithdrawMoney(float amt){
if(amount<amt){
System.out.println("Insufficient Balance!");
}
else{
amount=amount-amt;
System.out.println("The Amount Withdrawn is: " +amt);
System.out.println(  "   "    );
}}
void CheckBalance(){
System.out.println("Your Balance is: " +amount);
System.out.println(  "   "    );
}
void PrintResult(){
System.out.println("Your Account_No is: " +acc_no);
System.out.println(  "   "    );
System.out.println("Your Names is: " + names);
System.out.println(  "   "    );
System.out.println("Your Amount is: " + amount);
System.out.println(  "   "    );
}
}
class TestAccount{
public static void main(String[] args) {
Account bb=new Account();
bb.InsertRecord(832345,"NDAGIJIMANA D'AMOUR",500000);  
bb.PrintResult();  
bb.CheckBalance();  
bb.DepositMoney(40000);  
bb.CheckBalance();  
bb.WithdrawMoney(300000);  
bb.CheckBalance();
}
}