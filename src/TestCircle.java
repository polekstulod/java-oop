import java.lang.Math;
import javax.swing.JOptionPane;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(17);
        String text = String.format("Circle\nRadius: %.2f\nDiameter: %.2f\nArea: %.2f", circle1.getRadius(), circle1.computeDiameter(), circle1.computeArea());
        JOptionPane.showMessageDialog(null, text);
    }
}

class Circle{
    double radius;
    double diameter;
    double area;

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double computeDiameter(){
        this.diameter = radius * 2; 
        return this.diameter;
    }
    public double computeArea(){
        return Math.PI * this.radius * this.radius;
    }
}
