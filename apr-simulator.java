public class MyClass {
    
    public static double interestSimulator(double principalBalance, double rate, double monthlyPayment, int month){
            if(principalBalance < 1){ return 0;}
            if(month%12==0){
                principalBalance = (principalBalance + (principalBalance * rate)) - monthlyPayment;
            }else{
                principalBalance = principalBalance - monthlyPayment;
            }
            System.out.println("After "+month+"month(s) your new balance is "+principalBalance);
            month = month + 1;
            return interestSimulator(principalBalance, rate, monthlyPayment, month);
    }
    
    public static void main(String args[]) {
    
        interestSimulator(8000, 0.1079, 179, 1);
    }
}
