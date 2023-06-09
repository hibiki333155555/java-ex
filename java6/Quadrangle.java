
public class Quadrangle extends Shape{ 
    public Point[] P;
    public Quadrangle(Point p1, Point p2, Point p3, Point p4){
        P = new Point[]{p1,p2,p3,p4};
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