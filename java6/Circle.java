
public class Circle extends Shape{
    protected Point p;
    private int r;

    public Circle(Point a, int r){
        this.p = a;
        this.r = r;
    }

    public void move(int dx, int dy){
        p.x += dx;
        p.y += dy;
    }

    public void print(){
        super.print();
        System.out.print("(" + p.x + ", " + p.y + ") radius = " + r);
    }
}
