package MulitpleInheritance;

public class TestBank {
    public static void main(String[] args) {

        System.out.println(UsBank.min_bal);// u can acess usbank variable value
        // by defining class name.variable name

        ICICIBANK i = new ICICIBANK();
        i.credit();
        i.debit();
        i.loan(); // u cannot acess this method in u.transfermoney
        i.transfermoney();

        //dynamic polymorphism
       UsBank u= new ICICIBANK();
       u.credit();
       u.debit();
       u.transfermoney();


    }
}
