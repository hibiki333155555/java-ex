class Rectangle implements Relatable{
    private Point p1, p3;

    public Rectangle(Point p1, Point p3){
        this.p1 = p1;
        this.p3 = p3;
    }

    public boolean isSmallerThan(Relatable r){
        Rectangle rec = (Rectangle)r;
        return (this.getArea()<rec.getArea());
    }

    public int getArea(){
        return (p3.getX()-p1.getX())*(p3.getY()-p1.getY());
    }
}