public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int radius, int xSpeed, int ySpeed){
        this.radius = radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public String toString(){
        return "Coordinates of the Circle center: x: " + center.x + " y: " + center.y;
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }
    public void moveUp(){
        center.moveUp();
    }
    public void moveLeft(){
        center.moveLeft();
    }
    public void moveRight(){
        center.moveRight();
    }
}
