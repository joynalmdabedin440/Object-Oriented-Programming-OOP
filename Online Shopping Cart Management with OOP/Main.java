


public class Main {
    public double calculateTotalWeight(Item[] items) {
        double total = 0.0;
        for (int i = 0; i < items.length; i++) {
            total += items[i].getWeight();
        }
        return total;
    }

    public Item itemWithHighestPrice(Item[] items) {
        Item temp = new Item("", 0, 0, false);
        double maxPrice = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].getPrice() > maxPrice) {
                maxPrice = items[i].getPrice();
                temp = items[i];
            }
        }
        return temp;
    }

    public int taxableNumber(Item[] items) {
        int x = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].isTaxable()) {
                x += 1;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        Main runner = new Main();
        Item[] items = new Item[10];
        
        
      
        
        // for (int i = 0; i < items.length; i++) {
        //     items[i] = new Item("it-" + (i+1), (i + 3) * 20, (i + 5) * 0.5, i % 2 == 0);
        // }
        // for (int i = 0; i < items.length; i++) {
        //     System.out.println(items[i]);
        // }
        
        // double total = runner.calculateTotalWeight(items);
        // int n = runner.taxableNumber(items);
        // Item maxItem = runner.itemWithHighestPrice(items);
        // System.out.println("Total Weight: " + total);
        // System.out.println("Number of taxable items: " + n);
        // System.out.println("Max Item: " + maxItem);
        
        
        
        
    ShoppingCart cart = new ShoppingCart();
    
    DiscountedItem book = new DiscountedItem("Frictional Book", 500, 1.5, true, 10.0);
    Item withoutDiscount = new Item("Shoes", 100, 1, false);
    Item withoutDiscount1 = new Item("Shoes", 1000, 5, false);
    
    cart.addItem(book);
    cart.addItem(withoutDiscount);
    cart.addItem(withoutDiscount1);
    System.out.println(cart);
    System.out.println("Total Price: " + cart.calculate_total_price());
    




    OnlineShoppingCart addShippingCharge = new OnlineShoppingCart(60.0f);
    addShippingCharge.addItem(book);
    addShippingCharge.addItem(withoutDiscount);
    System.out.println("Total price with shipping charge: " + addShippingCharge.calculate_total_price());
    
    
    
    
    
        // ShoppingCart cart = new ShoppingCart();
        // for (Item item : items) {
        //     cart.addItem(item);
        // }
       
        
        // // cart.removeItem(items,product);
        
        // DiscountedItem it_45= new DiscountedItem("item-45",45.0,40.0,false,10.0);
        // System.out.println("\n Discount price: "+it_45.getPrice()+"\n");
      
        // System.out.println(cart);

     
        // System.out.println("Total Price in Cart: $" + cart.calculate_total_price());
        // System.out.println("Tax Amount for Taxable Items in Cart: $" + cart.cartTaxAmount(0.1));
    }
}