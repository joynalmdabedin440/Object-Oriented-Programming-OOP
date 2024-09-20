class OnlineShoppingCart extends ShoppingCart{
    private float shipping_cost;
    
    public OnlineShoppingCart(float shippingCost) {
        this.shipping_cost = shippingCost;
    }
    
   
    
    @Override
    public double calculate_total_price(){
        return super.calculate_total_price()+this.shipping_cost;
    }
}