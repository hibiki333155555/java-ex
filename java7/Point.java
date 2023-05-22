class Point implements Relatable{
    private int x;
    private int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    public boolean isSmallerThan(Relatable other){
        Point p=(Point)other;
        return (x == p.getX()) ? (y < p.getY()) : (x < p.getX());
    }

    void print(){
        System.out.println("("+x+", "+y+")");
    }

}