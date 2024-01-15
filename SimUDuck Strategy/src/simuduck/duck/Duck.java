package simuduck.duck;

import simuduck.fly.FlyBehaviour;
import simuduck.quack.QuackBehaviour;

public abstract class Duck
{
    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

    protected Duck()
    {
        System.out.println("");
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour)
    {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour)
    {
        this.quackBehaviour = quackBehaviour;
    }

    public abstract void display();

    public void performFly()
    {
        this.flyBehaviour.fly();
    }

    public void performQuack()
    {
        this.quackBehaviour.quack();
    }

    public void swim()
    {
        System.out.println("All ducks float, even decoys!");
    }
}
