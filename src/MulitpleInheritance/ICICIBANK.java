package MulitpleInheritance;

import MulitpleInheritance.UsBank;

public class ICICIBANK implements UsBank,BrazilBank {// icici can implement 2 interface usbank,brazilbank
    public void mutulfund()
    {
        System.out.println("mutualfund");
    }

public void credit()
{
    System.out.println("credit");
}
public void debit(){
    System.out.println("debit");

}
public void transfermoney()
{
    System.out.println("transfermoney");
}
public void loan()
{
    System.out.println("loan");
}
}
