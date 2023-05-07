
class Point{
    public int x;
    public int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y; 
    }

    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        } else {
            Point that = (Point) obj;
            return (this.x == that.x) && (this.y == that.y);
        }
    }
}

/* 
class EqualPointApplication{
    public static void main(String[] args){
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1,2);
        if ( p1 == p2 ) {
            System.out.println("p1 == p2");
        } else {
            System.out.println("p1 != p2");
        }
        
        if ( p1.equals(p2) ){
            System.out.println("p1 and p2 is equal");
        } else {
            System.out.println("p1 and p2 is not equal");
        } 
    }
}
*/