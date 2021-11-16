import javax.print.DocFlavor;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){

    }

    public Shape(String color, boolean filled){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea(){
        return 0;
    }

    public abstract double getPerimeter();

    @Override
    public abstract String toString();

    public abstract boolean getSide();
}
