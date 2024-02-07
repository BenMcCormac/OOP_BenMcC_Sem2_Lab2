package ie.atu;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Salad implements MenuItem
{
    private String name;
    private String descrip;
    private double price;

    public Salad(String name, double price, String descrip)
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