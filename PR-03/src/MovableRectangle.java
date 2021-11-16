
public class MovableRectangle extends Rectangle implements Movable{
    protected MovablePoint upperLeft;
    protected MovablePoint lowerRight;

    MovableRectangle(MovablePoint u, MovablePoint l) throws Exception{
            if (u.xSpeed == l.xSpeed && u.ySpeed == l.ySpeed){
                upperLeft = u;
                lowerRight = l;
            }
            else{
                 throw new Exception("Data error!");
            }
    }

    @Override
    public void moveUp() {
        upperLeft.moveUp();
        lowerRight.moveUp();
    }

    @Override
    public void moveDown() {
        upperLeft.moveDown();
        lowerRight.moveDown();

    }

    @Override
    public void moveLeft() {
        upperLeft.moveLeft();
        lowerRight.moveLeft();

    }

    @Override
    public void moveRight() {
        upperLeft.moveRight();
        lowerRight.moveRight();

    }

}
