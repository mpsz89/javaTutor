import java.util.Scanner;

public class MathLogic {

  public static boolean alt(int a, int b){
		if(a==1 && b==1){
			return true;
		}
		else if(a==1 && b==0){
			return true;
		}
		else if(a==0 && b==1){
			return true;
		}
		else if(a==0 && b==0){
			return false;
		}
		else{
			System.out.println("Logical value error !!!");
		}
		return false;
	}
	
	public static boolean conj(int a, int b){
		if(a==1 && b==1){
			return true;
		}
		else if(a==1 && b==0){
			return false;
		}
		else if(a==0 && b==1){
			return false;
		}
		else if(a==0 && b==0){
			return false;
		}
		else{
			System.out.println("Logical value error !!!");
		}
		return false;
	}
	
	public static boolean cons(int a, int b){
		if(a==1 && b==1){
			return true;
		}
		else if(a==1 && b==0){
			return false;
		}
		else if(a==0 && b==1){
			return true;
		}
		else if(a==0 && b==0){
			return true;
		}
		else{
			System.out.println("Logical value error !!!");
		}
		return false;
	}
	
	public static boolean iff(int a, int b){
		if(a==1 && b==1){
			return true;
		}
		else if(a==1 && b==0){
			return false;
		}
		else if(a==0 && b==1){
			return false;
		}
		else if(a==0 && b==0){
			return true;
		}
		else{
			System.out.println("Logical value error !!!");
		}
		return false;
	}
	
	public static boolean nand(int a, int b){
		if(a==1 && b==1){
			return false;
		}
		else if(a==1 && b==0){
			return true;
		}
		else if(a==0 && b==1){
			return true;
		}
		else if(a==0 && b==0){
			return true;
		}
		else{
			System.out.println("Logical value error !!!");
		}
		return false;
	}
	
	public static boolean xor(int a, int b){
		if(a==1 && b==1){
			return false;
		}
		else if(a==1 && b==0){
			return true;
		}
		else if(a==0 && b==1){
			return true;
		}
		else if(a==0 && b==0){
			return false;
		}
		else{
			System.out.println("Logical value error !!!");
		}
		return false;
	}
	
	public static boolean nor(int a, int b){
		if(a==1 && b==1){
			return false;
		}
		else if(a==1 && b==0){
			return false;
		}
		else if(a==0 && b==1){
			return false;
		}
		else if(a==0 && b==0){
			return true;
		}
		else{
			System.out.println("Logical value error !!!");
		}
		return false;
	}
	
	public static void main(String[] args) {
	int p;
	int q;
	char l;
	Scanner log = new Scanner(System.in);
	Scanner valog = new Scanner(System.in);
	System.out.println("a - alternative, k - conjecture, i - logical consequence");
	System.out.println("f - if and only if, d - sheffer stroke (nand), x - exclusive or (xor)");
	System.out.println("b - logical NOR");
	System.out.println(" ");
	System.out.print("Choose the type of mathematical logic : ");
	l = log.next().charAt(0);
	switch(l){
	case 'a':
		System.out.println("ALTERNATIVE");
		System.out.print("enter the first logical value : ");
		p = valog.nextInt();
		System.out.print("enter the second logical value : ");
		q = valog.nextInt();
		System.out.println(alt(p,q));
		break;
	case 'k':
		System.out.println("CONJECTURE");
		System.out.print("enter the first logical value : ");
		p = valog.nextInt();
		System.out.print("enter the second logical value : ");
		q = valog.nextInt();
		System.out.println(conj(p,q));
		break;
	case 'i':
		System.out.println("LOGICAL CONSEQUENCE");
		System.out.print("enter the first logical value : ");
		p = valog.nextInt();
		System.out.print("enter the second logical value : ");
		q = valog.nextInt();
		System.out.println(cons(p,q));
		break;
	case 'f':
		System.out.println("IF AND ONLY IF");
		System.out.print("enter the first logical value : ");
		p = valog.nextInt();
		System.out.print("enter the second logical value : ");
		q = valog.nextInt();
		System.out.println(iff(p,q));
		break;
	case 'd':
		System.out.println("SHEFFER STROKE (NAND)");
		System.out.print("enter the first logical value : ");
		p = valog.nextInt();
		System.out.print("enter the second logical value : ");
		q = valog.nextInt();
		System.out.println(nand(p,q));
		break;
	case 'x':
		System.out.println("EXCLUSIVE OR (XOR)");
		System.out.print("enter the first logical value : ");
		p = valog.nextInt();
		System.out.print("enter the second logical value : ");
		q = valog.nextInt();
		System.out.println(xor(p,q));
		break;
	case 'b':
		System.out.println("LOGICAL NOR");
		System.out.print("enter the first logical value : ");
		p = valog.nextInt();
		System.out.print("enter the second logical value : ");
		q = valog.nextInt();
		System.out.println(nor(p,q));
		break;
	default:
		System.out.println("Wrong type of mathematical logic !!!");
	}
	}

}
