class Point{
    public int x;  
    public int y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    void print(){
        System.out.println("("+ x + ", "+ y + ")");
    }

    double getDistance(Point p2){
        int dx = p2.x - this.x;
        int dy = p2.y - this.y;

        return Math.sqrt(dx*dx + dy*dy);
    }


}