class BankTester{

public static void main(String a[]){

Bank bank=new BandanBank();
bank.provideLoans(7.5);
System.out.println(bank+"\n");

Bank bank1=new HDFCBank();
bank1.provideLoans(2.5);
System.out.println(bank1+"\n");

Bank bank2=new CorporationBank();
bank2.provideLoans(5.5);
System.out.println(bank2+"\n");

Bank bank3=new UnionBank();
bank3.provideLoans(8.5);
System.out.println(bank3+"\n");

Bank bank4=new SbiBank();
bank4.provideLoans(9.5);
System.out.println(bank4+"\n");

Bank bank5=new KarnatakaBank();
bank5.provideLoans(3.5);
System.out.println(bank5+"\n");

}


}