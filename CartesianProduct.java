import java.util.Scanner;

public class CartesianProduct {

  
  public static void main(String[] args) {
		byte a, b, c, d, e, f, g, h;
		byte z;
		Scanner kart = new Scanner(System.in);
		Scanner zbior = new Scanner(System.in);
		System.out.print("Ile zbiorow : ");
		z=zbior.nextByte();
		System.out.println();
		switch(z){
		case 2:
			System.out.println("for set A");
  		System.out.print("Enter the first number : ");
			a=kart.nextByte();
			System.out.print("Enter the last number : ");
			b=kart.nextByte();
			System.out.println();
			System.out.println("for set B");
			System.out.print("Enter the first number : ");
			c=kart.nextByte();
			System.out.print("Enter the last number : ");
			d=kart.nextByte();
			System.out.println();
			System.out.print("A x B = { ");
			for(int i=a;i<=b;i++){
				for(int j=c;j<=d;j++){
					System.out.print("(" + i + "," + j+ ")");

			        if (i < b || j < d) System.out.print(", ");
				}
			}
			System.out.print(" } ");
			break;
		case 3:
			System.out.println("for set A");
			System.out.print("Enter the first number : ");
			a=kart.nextByte();
			System.out.print("Enter the last number : ");
			b=kart.nextByte();
			System.out.println();
			System.out.println("for set B");
			System.out.print("Enter the first number : ");
			c=kart.nextByte();
			System.out.print("Enter the last number : ");
			d=kart.nextByte();
			System.out.println();
			System.out.println("for set C");
			System.out.print("Enter the first number : ");
			e=kart.nextByte();
			System.out.print("Enter the last number : ");
			f=kart.nextByte();
			System.out.println();
			System.out.print("A x B x C = { ");
			for(int i=a;i<=b;i++){
				for(int j=c;j<=d;j++){
					for(int k=e;k<=f;k++){
						System.out.print("(" + i + "," + j+ "," + k + ")");

				        if (i < b || j < d || k < f) System.out.print(", ");
					}

				}
			}
			System.out.print(" } ");
			break;	
		case 4:
			System.out.println("for set A");
  		System.out.print("Enter the first number : ");
			a=kart.nextByte();
			System.out.print("Enter the last number : ");
			b=kart.nextByte();
			System.out.println();
			System.out.println("for set B");
			System.out.print("Enter the first number : ");
			c=kart.nextByte();
			System.out.print("Enter the last number : ");
			d=kart.nextByte();
			System.out.println();
			System.out.println("for set C");
			System.out.print("Enter the first number : ");
			e=kart.nextByte();
			System.out.print("Enter the last number : ");
			f=kart.nextByte();
			System.out.println();
			System.out.println("for set D");
			System.out.print("Enter the first number : ");
			g=kart.nextByte();
			System.out.print("Enter the last number : ");
			h=kart.nextByte();
			System.out.println();
			System.out.print("A x B x C x D = { ");
			for(int i=a;i<=b;i++){
				for(int j=c;j<=d;j++){
					for(int k=e;k<=f;k++){
						for (int l=g;l<=h;l++){
						System.out.print("(" + i + "," + j+ "," + k + "," + l + ")");

				        if (i < b || j < d || k < f || l < h) System.out.print(", ");
						}
					}

				}
			}
			System.out.print(" } ");
			break;
		default:
			System.out.println("ERROR");
			break;
		}

	}

}
