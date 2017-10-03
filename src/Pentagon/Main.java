package Pentagon;

import Shape.Shape;

public class Main {
    public static void main(String[] args){
        Shape s = new Pentagon();
        System.out.println(s.getSides());
    }
}
class Pentagon extends Shape{

    public Pentagon(){}
}
