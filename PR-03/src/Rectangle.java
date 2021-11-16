class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){

    }
    public Rectangle(double width, double length){

    }

    public Rectangle(double width, double length, String color, boolean filled){

    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea(){
        return 0;
    }

    @Override
    public double getPerimeter(){
        return 0;
    }

    @Override
    public String toString(){
        return "a";
    }

    @Override
    public boolean getSide() {
        return false;
    }
}
