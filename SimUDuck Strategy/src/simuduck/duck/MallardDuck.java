package simuduck.duck;

import simuduck.fly.FlyWithWings;
import simuduck.quack.Quack;

public class MallardDuck extends Duck
{
    public MallardDuck()
    {
        super();
        this.flyBehaviour = new FlyWithWings();
        this.quackBehaviour = new Quack();
    }

    @Override
    public void display()
    {
        System.out.println("I'm a real Mallard duck");
    }
}
