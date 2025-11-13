import javax.sound.sampled.*;
import java.io.File;
import java.util.Scanner;

public class bank{
    static double bal=0.0;
    static long acc;
    @SuppressWarnings("static-access")
    public static void main(String[] args){
    boolean running=true;
    boolean run=false;
    Scanner sc=new Scanner(System.in);   
    while(running){
        System.out.print("|             **WELCOME USER**            |\n|     **LETS CREATE YOUR ACCOUNT!!!**     |\n\nRegister your name:");
        String name=sc.nextLine();
        System.out.println("Hello "+name+" Please create a 4 digit pin for your new account:");
        int p=sc.nextInt();
        if(p>9999||p<1000){
            System.out.println("WRONG PLEASE TRY AGAIN");
        }
        else{
            rand ran=new rand();
            acc=ran.random();
            System.out.println("Your account number is:"+acc);
            System.out.println("PIN CREATED SUCCESSFULLY!!\nselect services:-");
            running=false;
            run=true;
        }
        while(run){
            System.out.println("        [1] check balance\n        [2] add amount\n        [3] withdraw amount\n        [4] change pin\n        [5] exit");
            int c=sc.nextInt();
            switch(c){
                case 1->{
                    playSound();
                    System.out.print("Enter your pin:");
                    int a=sc.nextInt();
                    if(p==a){
                        checkBalance obj=new checkBalance(bal);
                        obj.balance=bal;
                        obj.display();}
                    else{
                        System.out.println("WRONG PIN\nTRY AGAIN");
                    }
                    break;
                }
                case 2->{
                    playSound();
                    System.out.print("Enter your pin:");
                    int a=sc.nextInt();
                    if(p==a){
                        System.out.print("Enter amount(minimum:$2000|maximum:$1000000):");
                        double amt=sc.nextDouble();
                        credit abj=new credit(amt);
                        abj.display();
                    }
                    else{
                        System.out.println("WRONG PIN\nTRY AGAIN");
                    }
                    break;
                }
                case 3->{
                    playSound();
                    System.out.print("Enter your pin:");
                    int a=sc.nextInt();
                    if(p==a){
                        System.out.print("Enter amount:");
                        double am=sc.nextDouble();
                        if(am<=bal){
                            substract lol=new substract(am);
                            lol.dis();
                        }
                        else{
                            System.out.println("YOUR BANK HAS INSUFFICIENT BALANCE!!!");
                        }
                    }
                    else{
                        System.out.println("WRONG PIN\nTRY AGAIN");
                    }
                    break;
                }
                case 4->{
                    playSound();
                    System.out.print("Enter your previous pin:");
                    int a=sc.nextInt();
                    if(p==a){
                        System.out.print("Enter your new pin:");
                        int pin=sc.nextInt();
                        p=pin;
                    }
                    else{
                        System.out.println("WRONG PIN\nTRY AGAIN");
                    }
                    break;
                }
                case 5->{
                    playSound();
                    System.out.println("X----------------------THANKYOU FOR VISITING "+name+"--------------------X");
                    run=false;
                }
                default->{System.out.print("WRONG OPTION.");}
            }}
        

    }}
    

    
    @SuppressWarnings("UseSpecificCatch")
     private static void playSound() {
        try {
            File file = new File("C:\\Users\\lenovo\\Downloads\\beeping-robot-or-machine-102595.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception e) {
            System.out.println("Sound error: " + e.getMessage());
        }
    }}
