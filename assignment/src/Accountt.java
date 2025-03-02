
public class Accountt {
 
private int ID;
private double Balance;

public void account(int I,double B){
ID=I;
if(Balance> 0 ){
Balance=B;
} else {
    System.out.println("");
    Balance=0.0;
}}
public int getId(){
return ID;}

public double getBalance(){
return Balance;}

public void setDeposit(double amount){
if (amount>0){
Balance += amount;
} else{
    System.out.println("");
}}

public void setDebit(double amount){
if(amount> Balance){
    System.out.println("Debit amount exceeded account balance.");
} else{
    System.out.println(Balance -= amount);}}}
