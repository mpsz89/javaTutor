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
		double w[]={10,12,16}, c[]={60,70,80}, x[]={0,0,0};
		double m = 20;
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
