package simuduck;

import simuduck.duck.Duck;
import simuduck.duck.MallardDuck;
import simuduck.duck.ModelDuck;
import simuduck.fly.FlyRocketPowered;

public class MiniDuckSimulator
{
    public static void main(String[] args)
    {
        // Mallard showcasing the basic functionality
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        // Model duck showcasing the ability to switch implementation at runtime
        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}