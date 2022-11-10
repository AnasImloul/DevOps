public class Point<T> {
    private T x;
    private T y;

    public Point(T x, T y){
        this.x = x;
        this.y = y;
    }

    public Point(){
        // initialize x and y to their default values
        this.x = null;
        this.y = null;
    }

    @Override
    public boolean equals(Object other){
        if (! (other instanceof Point<?>)) {return false;}
        return (((Point<?>) other).x == this.x) && (((Point<?>) other).y == this.y);
    }

    @Override
    public String toString(){
        return "Point(" + this.x + ", " + y + ")";
    }
}
