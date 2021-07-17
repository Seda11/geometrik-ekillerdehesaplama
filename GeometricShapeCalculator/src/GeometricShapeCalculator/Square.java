package GeometricShapeCalculator;

public class Square extends Figure{
    private int x;

    public Square(String name,int edge) {
        super(name);
        this.x = edge;
        
    }

    @Override
    public  void calculateArea() {

        System.out.println(getName() + "'s area : " + (x * x));
        
    }

}
