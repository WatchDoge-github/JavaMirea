class Circle extends Shape {
    protected double radius;

    public Circle(){

    }

    public Circle(double radius){

    }

    public Circle(double radius, String color, boolean filled){

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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
