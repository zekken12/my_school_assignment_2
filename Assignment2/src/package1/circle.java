package package1;

public class circle extends shape{

private final double radius;
final double pi = Math.PI;

public circle() {
	radius=1;
}
public circle(double r){
	this.radius=r;
	}
@Override
public double area() {
	return pi * Math.pow(radius, 2);
	}
public double diameter(){
	return (2*this.radius);
	}
@Override
public double perimeter() {
	return 2 * pi * radius;
	}
  
  
}

