package Interface;

import Interface.Car;

public class Bmw implements Car { //ulter+enter = impliment override method

    @Override
    public void start() {
        System.out.println("strat");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void refuel() {
        System.out.println("refuel");
    }

    public  void threadsefty()
    {
        System.out.println("threadsefty");
    }

}
