import java.util.ArrayList;
import java.util.Random;
/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Jamie Cane
 * @version (14.11.21)
 */
public class StockList
{
    // A list of the products.
    private ArrayList<Product> stock;
    private Random generator = new Random();
    
    /**
     * Initialise the stock manager.
     */
    public StockList()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.
     * @param item The product item to be added.
     */
    public void add(Product item)
    {
        stock.add(item);
    }
    /**
     * removes a product from the list
     */
    public void remove(int productID)
    {
        Product product = findProduct(productID);
        if(product != null) {
            stock.remove(product);
        }
    }
    /**
     * A method to buy a single quantity of the product
     */
    public void buyProduct(int productID)
    {
        buyProduct(productID, 1);
    }
    
    /**
     * Buy a quantity of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void buyProduct(int productID, int amount)
    {
        Product product = findProduct(productID);
    
        if(product == null)
        {
            System.out.println(product + " NOT FOUND ");
        }
        else
        {
            product.increaseQuantity(amount);
            System.out.println("Bought " + amount + " " + product);
            
        }
    }
    
    /**
     * Find a product to match the product id,
     * if not found return null
     */
    public Product findProduct(int productID)
    {
        for(Product product : stock)
        {
            if(product.getID() == productID)
                return product;
        }
        
        return null;
    }

   /**
    * sells one of the products from the stock by finding by ID.
    */
    
    public void sellProduct(int productID, int sellQuantity)
    {
        System.out.println("Selling Quanitities of Stock\n");
        
        Product product = findProduct(productID);
        int stockQuantity = product.getQuantity();
        
        if(product != null) 
        {
            if(stockQuantity > 0)
            {
                if(stockQuantity > sellQuantity)
                {
                    product.decreaseQuantity(sellQuantity);
                    System.out.println("Selling " + sellQuantity + " " + product.getID());
                    
                }
                else
                {
                    System.out.println("All stock is sold!!");
                    System.out.println("Selling " + stockQuantity + " " + product.getID());
                    product.decreaseQuantity(stockQuantity);
                }   
            }
            else
            {
                System.out.println("Selling none of " + product.getID());
            }
        }
        else
        {
            // printout message
        }
    }    
    /**
     * Method to search for products containing the phrase
     * "Xbox One"
     */
    public void search(String phrase)
    {
        if(phrase.contains("Xbox One"))
        {
            System.out.println(stock);
        }
    }
    
    /**
     * returns 0 for the number in stock
     */
    public int numberInStock(int productID)
    {
        return 0;
    }

    /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printProduct(int productID)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void print()
    {
        printHeading();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }
        /**
     * Method to print the List of available products in
     * the stock list.
     */
    public void printHeading()
    {
        System.out.println();
        System.out.println(" Jamie's Stock List");
        System.out.println(" ====================");
        System.out.println();
    }
}