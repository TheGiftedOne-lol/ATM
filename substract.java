public class substract extends bank{
    double amount;

    public substract(double amount) {
    this.amount=amount;
    }
    public void dis(){
        bal=bal-amount;
        System.out.println("AMOUNT DEBITTED SUCCESSFULLY!!!");
    }

    
}