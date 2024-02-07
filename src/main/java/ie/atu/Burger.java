package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Burger implements MenuItem
{
    private String name;
    private String descrip;
    private double price;

    public Burger(String name, double price, String descrip)
    {
        this.name = name;
        this.price = price;
        this.descrip = descrip;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getDescription() {
        return null;
    }
}