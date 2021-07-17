package GeometricShapeCalculator;

public class Circle extends Figure{
	
    private int r;

    public Circle(String name,int r) {
        super(name);
        this.r = r;
        
    }
    
    
    @Override
    public void calculateArea() {
        System.out.println(getName() + "'s area : " + (Math.PI * r * r));
        

    }

}
