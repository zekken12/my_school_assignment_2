package package2;

public class Rational implements Operations

{

private int num;

private int den;


Rational(int n, int d)

{

num = n;

den = d;

if(num < 0 && den < 0 || num >= 0 && den < 0)

{

num = -num;

den = -den;

}

int g = gcd(Math.abs(num), Math.abs(den));

num = num/g;

den = den/g;

}

public Rational(int n)

{

num = n;

den = 1;

}

public int getNum()

{

return this.num;

}

public int getDen()

{

return this.den;

}

private int gcd(int a, int b)

{

if(b == 0) return a;

else return gcd(b, a%b);

}

@Override

public Rational add(Rational q)

{

Rational result = new Rational(this.getNum()*q.getDen() + q.getNum()*this.getDen(), this.getDen()*q.getDen());

return result;

}

@Override

public Rational sub(Rational q)

{

Rational result = new Rational(this.getNum()*q.getDen() - q.getNum()*this.getDen(), this.getDen()*q.getDen());

return result;

}

@Override

public Rational mult(Rational q)

{

Rational result = new Rational(this.num*q.getNum(), this.den*q.getDen());

return result;

}

@Override

public Rational multBy(int k)

{

Rational result = new Rational(this.num*k, this.den);

return result;

}

@Override

public Rational div(Rational q)

{

Rational result = new Rational(this.num*q.getDen(), this.den*q.getNum());

return result;

}

@Override

public Rational divBy(int k)

{

Rational result = new Rational(this.num, this.den*k);

return result;

}

@Override

public boolean eq(Rational q)

{

return (this.getNum() == q.getNum() && this.getDen() == q.getDen());

}

public String toString()

{

return "Numerator = " + getNum() + "\tDenominator = " + getDen();

}

}

