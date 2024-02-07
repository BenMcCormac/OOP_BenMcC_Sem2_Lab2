package ie.atu;

public class Dessert implements MenuItem
{
    private String name;
    private String descrip;
    private double price;

    private String menuItemCode;

    public Dessert(String name, double price, String descrip)
    {
        this.name = name;
        this.price = price;
        this.descrip = descrip;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return descrip;
    }
}
