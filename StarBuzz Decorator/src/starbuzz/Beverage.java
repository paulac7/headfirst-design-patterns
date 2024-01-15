package starbuzz;

public abstract class Beverage
{
    protected String description = "Unknown beverage";
    private BeverageSize size = BeverageSize.GRANDE;

    public String getDescription()
    {
        return description;
    }

    public BeverageSize getSize()
    {
        return size;
    }

    public void setSize(BeverageSize size)
    {
        this.size = size;
    }

    public abstract double cost();
}
