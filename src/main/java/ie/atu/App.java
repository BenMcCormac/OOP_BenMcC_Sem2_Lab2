package ie.atu;

public class App
{
    public static void main(String[] args)
    {
        //Create an array or list of MenuItem objects
        MenuItem[] menuItems = new MenuItem[]{
                new Burger("Classic Burger", 8.99, "Beef patty, lettuce, tomato, cheese"),
                new Pizza("Margherita Pizza", 12.99, "Tomato sauce, mozzarella, basil"),
                new Salad("Caesar Salad", 6.99, "Romaine Lettuce, croutons, Caesar dressing"),
                new Dessert("Apple Pie", 9.99, "Apple in a pie")
        };

        //Display details of each menu Item
        for (MenuItem menuItem : menuItems)
        {
            System.out.println("Name: " + menuItem.getName());
            System.out.println("Description: " + menuItem.getDescription());
            System.out.println("Price: " + menuItem.getPrice());
        }

        //Calculate and display the total cost of the order
        double totalCost = 0;
        for (MenuItem menuItem : menuItems)
        {
            totalCost += menuItem.getPrice();
        }
        System.out.println("Total Cost: €" + totalCost);
    }
}
