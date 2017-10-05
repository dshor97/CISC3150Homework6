package Shape;

public class Shape {
    protected int sides = 5;

    public Shape(){}

    public String toString(){
        String s = new String();
        s += sides;
        return s;
    }
}
