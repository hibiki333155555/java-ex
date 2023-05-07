
class Square extends Shape{
    public Point[] P = new Point[4];

    public Square(Point p1,int w){
        P[0] = p1;
        P[1] = new Point(p1.x + w, p1.y);
        P[2] = new Point(p1.x + w, p1.y + w);
        P[3] = new Point(p1.x, p1.y + w);
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