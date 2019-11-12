// main method for a bank account

public class Main {

    public static void main(String[] args) {
	// write your code here

        bankACC account = new bankACC();
        account.setcustomeName("Ronan O Brien");
        System.out.println("Account belonging to : " + account.getcustomeName());
        account.setemail("ronan@ronnisgreat.com");
        System.out.println("Email address: " + account.getemail());
        account.setaccountNumber(5678902);
        System.out.println("Account number is : " + account.getaccountNumber());
        account.setBalance(5000.00);
        System.out.println("Your balance is " + account.getBalance());
        account.setPhoneNo("42527834734");
        System.out.println("phone number : " + account.getPhoneNo());
        account.deposit(200.00);
        account.deposit(500.00);
        System.out.println("New balance is : " + account.getBalance());
        account.withdrawal(200.00);
        account.withdrawal(5000.00);
        System.out.println("New balance is : " + account.getBalance());
    account.withdrawal(700);
        System.out.println("New balance is : " + account.getBalance());

    }
}

// bank account class

public class bankACC {

    private int accountNumber;
    private double balance;
    private String customeName;
    private String email;
    private String phoneNo;
    private double deposit;
    private double withdrawal;
    //setter account number

    public void setaccountNumber(int accountNumber){

        this.accountNumber = accountNumber;
    }
    //getter account number
    public int getaccountNumber()
    {
        return this.accountNumber;
    }
    // setter balance
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    //getter balance
    public double getBalance(){
        return this.balance;
    }
    //setter Customer name
    public void setcustomeName(String customeName){
        this.customeName = customeName;
    }
    //getter customer name
    public String getcustomeName(){
        return this.customeName;
    }
    //setter email
    public void setemail(String email) {
        this.email = email;
    }
    //getter email
    public String getemail(){
        return this.email;
    }

    //setter phone
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
    //getter phone
    public String getPhoneNo(){
        return this.phoneNo;
    }
    // deposit
    public void deposit(double deposit){
        this.deposit = deposit;
        balance = balance + deposit;
    }
    public void withdrawal(double withdrawal){
        this.withdrawal = withdrawal;
        if(balance > withdrawal){
            balance = balance - withdrawal;
            System.out.println("withdrawal of: " + withdrawal);
        }
        else
            System.out.println("Not enough money ya deadbeat");


    }
}


// next consturcters video

//can call stuff without setter eg,
this.number = number; 
this.balance = balance; 
this.customerName = customerName; 

// nother way of doing constructer


