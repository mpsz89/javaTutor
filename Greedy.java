package JavaTutorials;

import java.util.Scanner;

public class Greedy {
  final static int n = 3;
	public static void greedy(double m, double w[], double c[], double x[]){
		int i;
		double z=m;
		for(i=0;i<n;i++){
			if(w[i]>z)
				break;
				x[i]=1;
				z=z-w[i];
		}
		if(i<n){
			x[i]=z/w[i];
		}
	}
	public static void main(String[] args) {
		double a1 = 0.0, b1 = 0.0, c1 = 0.0;
		double a2 = 0.0, b2 = 0.0, c2 = 0.0;
		double a3 = 0.0, b3 = 0.0, c3 = 0.0;
		double w[]={a1,b1,c1}, c[]={a2,b2,c2}, x[]={a3,b3,c3};
		double m;
		Scanner gree = new Scanner(System.in);
		System.out.print("Podaj M : ");
		m=gree.nextDouble();
		System.out.println("Dla w[i]");
		System.out.print("Podaj pierwsza wartosc : ");
		a1=gree.nextDouble();
		System.out.print("Podaj druga wartosc : ");
		b1=gree.nextDouble();
		System.out.print("Podaj trzecia wartosc : ");
		c1=gree.nextDouble();
		System.out.println(" ");
		System.out.println("Dla c[i]");
		System.out.print("Podaj pierwsza wartosc : ");
		a2=gree.nextDouble();
		System.out.print("Podaj druga wartosc : ");
		b2=gree.nextDouble();
		System.out.print("Podaj trzecia wartosc : ");
		c2=gree.nextDouble();
		System.out.println(" ");
		System.out.println("Dla x[i]");
		System.out.print("Podaj pierwsza wartosc : ");
		a3=gree.nextDouble();
		System.out.print("Podaj druga wartosc : ");
		b3=gree.nextDouble();
		System.out.print("Podaj trzecia wartosc : ");
		c3=gree.nextDouble();
		System.out.println(" ");
		greedy(m,w,c,x);
		double p=0;
		System.out.println("i     w[i]     c[i]     x[i]");
		System.out.println("____________________________");
		for(int i=0; i<n;p+=x[i]*c[i], i++){
			System.out.println(i+"     "+w[i]+"      "+c[i]+"      "+x[i]);
		}
		System.out.println(" ");
		System.out.println("Razem : "+p);
	}

}
