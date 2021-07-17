package GeometricShapeCalculator;

public class Pentagon extends Figure {
	private int p;
	private int a;
	
	public Pentagon(String name, int p, int a) {
		super(name);
		this.a=a;
		this.p=p;
	}
	@Override
    public void calculateArea() {
        double area = 5*((p*a ) / 2.0);
  
        System.out.println(getName() + "'s area : " + area );
    }

}