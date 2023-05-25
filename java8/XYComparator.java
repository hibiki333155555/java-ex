class XYComparator implements PointComparator{
    public int compare(Point p1, Point p2){
        if(p1.getX()<p2.getX()){
            return -1;
        } else if(p1.getX()==p2.getX()){
            return (p1.getY()<p2.getY() ? -1 : 1);
        } else return 1;
    }
}