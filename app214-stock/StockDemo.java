import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Jamie Cane
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;
    private Random random;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
    {
        this.stock = stock;
        this.random = new Random();
        
        // Tried setting IDs as 01-10 but cant as numbers starting with 0
        // are considered octal numbers and they can only range  from 0 to 7
        // so followed the name ID format as what was there originally
        
            stock.add(new Product(101, "Xbox One: Red Dead Redemption 2"));
            stock.add(new Product(102, "PS4: Fifa 22"));
            stock.add(new Product(103, "Nintendo Wii: Wii Sports"));
            stock.add(new Product(104, "Nintendo Switch: Mario Kart 8"));
            stock.add(new Product(105, "PS5: Call Of Duty - Vanguard"));
            stock.add(new Product(106, "Xbox Series S: Halo Infinite"));
            stock.add(new Product(107, "PS4: FarCry 6"));
            stock.add(new Product(108, "Nintendo Switch: Metroid Dread"));
            stock.add(new Product(109, "Xbox 360: Fallout New Vegas"));
            stock.add(new Product(110, "Xbox One: Crash Team Racing - Remastered")); 

    }
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    
    /**
     * method prints stock being bought and sold
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    /**
     * method to buy products from stock
     */
    private void buyProducts()
    {
        // randomises the amount of items bought
        for (int gamesID = 101; gamesID <=110; gamesID++)
        stock.buyProduct(gamesID, random.nextInt(11));
    }
    /**
     * method to sell products from stock
     */
    private void sellProducts()
    {
        // randomises the amount of items sold
       for (int gamesID = 101; gamesID <=110; gamesID++)
        stock.sellProduct(gamesID, random.nextInt(11));
    }    
}