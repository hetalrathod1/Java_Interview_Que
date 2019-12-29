package AbstractionInterface;

public class TestBank {
    public static void main(String[] args) {
        HdfcBank h=new HdfcBank();
        h.loan();//abstract overriden method which is in bank class
        h.credit();//hdfc class method
        h.funds();// data hiding , means u cannot use funds method in b.funds,
        // so tht method is hdfc private method


       Bank b= new HdfcBank();// run time polymorphism
       b.credit();
       b.loan();

    }


}
