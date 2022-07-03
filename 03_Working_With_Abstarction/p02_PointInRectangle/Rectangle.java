package p03_Working_With_Abstarction.p02_PointInRectangle;

public class Rectangle {
    private Point A;
    private Point C;

    public Rectangle(Point A, Point C) {
        this.A = A;
        this.C = C;
    }

    public boolean contains (Point point){
        return point.getX() >= A.getX() && point.getY() >= A.getY()
                && point.getX() <= C.getX() && point.getY() <= C.getY();
    }
}
