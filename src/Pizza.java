public class Pizza {
    String toppings;
    int diameter;
    double price;

    public void setToppings(String toppings){
        this.toppings = toppings;
    }
    public void setDiameter(int diameter){
        this.diameter = diameter;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getToppings(){
        return toppings;
    }
    public int getDiameter(){
        return diameter;
    }
    public double getPrice(){
        return price;
    }
}
