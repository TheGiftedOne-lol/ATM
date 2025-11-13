public class credit extends bank{
    double amount;
    public credit(double amount){
        this.amount=amount;
    }
    public void display(){
        bal=bal+amount;
        System.out.println("YOUR AMOUNT WAS ADDED TO YOUR ACCOUNT SUCCESSFULLY!!!");
    }
}