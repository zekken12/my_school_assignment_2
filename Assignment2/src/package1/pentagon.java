package package1;

public class pentagon extends shape {
private final double s, h;
public pentagon()
{
s=1;
h=1;
}
public pentagon(double side,double h)
{
this.s=side;
this.h=h;
}
@Override
public double area()
{
double Area=2.5*s*h;
return Area;
}

@Override
public double perimeter() {
return (5*s);
}

  
  
}

