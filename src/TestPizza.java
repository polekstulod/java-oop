import javax.swing.JOptionPane;

public class TestPizza {
    public static void main(String[] args) {
        String toppings;
        int diameter;
        double price;

        Pizza filipinoPizza = new Pizza();
        filipinoPizza.setToppings("durian");
        filipinoPizza.setDiameter(23);
        filipinoPizza.setPrice(69.99);

        toppings = filipinoPizza.getToppings();
        diameter = filipinoPizza.getDiameter();
        price = filipinoPizza.getPrice();

        String text = String.format("Pizza\nToppings: %s\nDiameter in inches: %d\nPrice: %.2f", toppings, diameter, price);
        JOptionPane.showMessageDialog(null, text);
    }
}
