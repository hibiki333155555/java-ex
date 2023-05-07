
class Rectangle extends Shape{
    public Point[] P = new Point[4];

    public Rectangle(Point p1, Point p3){
        P[0] = p1;
        P[1] = new Point(p3.x, p1.y);
        P[2] = p3;
        P[3] = new Point(p1.x, p3.y);
    }

    public void print(){
        super.print();
        for(int i = 0;i<4;i++){
            if (i != 0) System.out.print("-");
            System.out.print("(" + P[i].x + ", " + P[i].y + ")");
        }
    }

    public void move(int dx, int dy){
         for(int i = 0;i<4;i++){
            P[i].x += dx;
            P[i].y += dy;
        }
    }
}
    