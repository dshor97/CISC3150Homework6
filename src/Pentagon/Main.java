package Pentagon;

public class Main {
    public static void main(String[] args){
        Pentagon p = new Pentagon();
        p.changeProtected();
        System.out.println(p);
    }
}
class Pentagon extends Shape.Shape{

    public void changeProtected(){
        sides = 5;
        name = "Pentagon";
    }

    public String toString(){
        String s = new String();
        s += this.name + " has " + sides + " sides.";
        return s;
    }
    public Pentagon(){}
}
