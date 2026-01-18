package Interface;

public class Circle implements TwoDShape {

	double r=10; 
	
	Circle(double r){
		this.r = r;
	}
	
	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double area() {
		
		return Math.PI*r*r;
	}

	@Override
	public double parimeter() {
		
		return 2*Math.PI*r ;
	}

	
	
	
	
}
