class MovingPoint extends Point{
    private int vx;
    private int vy;

    public MovingPoint(int x,int y){
        super(x,y);
    }

    void setVelocity(int x,int y){
        vx = x;
        vy = y;
    }

    void move(){
        this.x += vx;
        this.y += vy;
    }
}