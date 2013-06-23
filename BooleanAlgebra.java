package BooleanAlgebra;

import java.util.Scanner;
import java.io.*;

public class BooleanAlgebra {

  public static int neg(int a){
		if(a==1){
			return 0;
		}
		else if(a==0){
			return 1;
		}
		else{
			System.out.println("logical value error");
		}
		return 0;
	}
	
	public static int union(int a, int b){
		if(a==1 && b==1){
			return 1;
		}
		else if(a==1 && b==0){
			return 1;
		}
		else if(a==0 && b==1){
			return 1;
		}
		else if(a==0 && b==0){
			return 0;
		}
		else{
			System.out.println("Logical value error !!!");
		}
		return 0;
	}
	
	public static int inters(int a, int b){
		if(a==1 && b==1){
			return 1;
		}
		else if(a==1 && b==0){
			return 0;
		}
		else if(a==0 && b==1){
			return 0;
		}
		else if(a==0 && b==0){
			return 0;
		}
		else{
			System.out.println("Logical value error !!!");
		}
		return 0;
	}
	
	public static int assocalt(int a, int b, int c){
		return union(a, union(b, c));
	}
	
	public static int assoccon(int a, int b, int c){
		return inters(a, inters(b, c));
	}
	
	public static int commutalt(int a, int b){
		return union(a, b);
	}
	
	public static int commutcon(int a, int b){
		return inters(a, b);
	}
	
	public static int absorpalt(int a, int b){
		return union(a, inters(a, b));
	}
	
	public static int absorpcon(int a, int b){
		return inters(a, union(a, b));
	}
	
	public static int distribalt(int a, int b, int c){
		return union(a, inters(b, c));
	}
	
	public static int distribcon(int a, int b, int c){
		return inters(a, union(b, c));
	}
	
	public static int complementalt(int a){
		return union(a, neg(a));
	}
	
	public static int complementcon(int a){
		return inters(a, neg(a));
	}
	
	public static int demorgan1(int a, int b){
		return neg(union(a, b));
	}
	
	public static int demorgan1a(int a, int b){
		return inters(neg(a),neg(b));
	}
	
	public static int demorgan2(int a, int b){
		return neg(inters(a, b));
	}
	
	public static int demorgan2a(int a, int b){
		return union(neg(a),neg(b));
	}
	
	public static byte setValue(StreamTokenizer strTok)
	 throws IOException{
		 while(strTok.nextToken() != StreamTokenizer.TT_NUMBER){
			 System.out.println("It's not number for given set !!!");
			 System.out.print("Enter the number for a given set : ");
		 }
		 return (byte) strTok.nval;
	 }
	
	public int logicValue(StreamTokenizer strTok1)
	 throws IOException{
		 while(strTok1.nextToken() != StreamTokenizer.TT_NUMBER){
			 System.out.println("It's not logical value");
			 System.out.print("Enter the logic value again : ");
		 }
		 return (int) strTok1.nval;
	 }
	
	public void Complement(int a, int a1, int a2,int a3, int w, int w1, int w2, int w3, int ww, int ww1, int ww2, int ww3){
		 System.out.println("Solution");
		 System.out.println("  a  | a OR NOTa | a AND NOTa ");
		 System.out.println("_____|___________|____________");
		 System.out.println("  " +a+ "  |     "+w+ "     |     "+ww);
		 System.out.println("  " +a1+ "  |     "+w1+ "     |     "+ww1);
		 System.out.println("  " +a2+ "  |     "+w2+ "     |     "+ww2);
		 System.out.println("  " +a3+ "  |     "+w3+ "     |     "+ww3);
	 }
	
	public void Commutativity(int a, int b, int a1, int b1, int a2, int b2, int a3, int b3, int w, int w1, int w2, int w3, int ww, int ww1, int ww2, int ww3){
		 System.out.println("Solution");
		 System.out.println("  a  |	 b   |  a OR  b  |  a AND b  ");
		 System.out.println("_____|_______|___________|___________");
		 System.out.println("  " +a+ "  |   " +b+ "   |     "+w+ "     |    "+ww);
		 System.out.println("  " +a1+ "  |   " +b1+ "   |     "+w1+ "     |    "+ww1);
		 System.out.println("  " +a2+ "  |   " +b2+ "   |     "+w2+ "     |    "+ww2);
		 System.out.println("  " +a3+ "  |   " +b3+ "   |     "+w3+ "     |    "+ww3);
	 }
	
	public void Absorption(int a, int b, int a1, int b1, int a2, int b2, int a3, int b3, int w, int w1, int w2, int w3, int ww, int ww1, int ww2, int ww3){
		 System.out.println("Solution");
		 System.out.println("  a  |	 b   |  a OR (a AND b)  |  a AND (a OR b)  ");
		 System.out.println("_____|_______|__________________|________________");
		 System.out.println("  " +a+ "  |   " +b+ "   |        "+w+ "         |        "+ww);
		 System.out.println("  " +a1+ "  |   " +b1+ "   |        "+w1+ "         |        "+ww1);
		 System.out.println("  " +a2+ "  |   " +b2+ "   |        "+w2+ "         |        "+ww2);
		 System.out.println("  " +a3+ "  |   " +b3+ "   |        "+w3+ "         |        "+ww3);
	 }
	
	public void DeMorganFirstLaw(int a, int b, int a1, int b1, int a2, int b2, int a3, int b3, int w, int w1, int w2, int w3, int ww, int ww1, int ww2, int ww3){
		 System.out.println("Solution");
		 System.out.println("  a  |	 b   |    NOT(a OR b)   |  (NOT a) AND (NOT b) ");
		 System.out.println("_____|_______|__________________|____________________");
		 System.out.println("  " +a+ "  |   " +b+ "   |        "+w+ "         |        "+ww);
		 System.out.println("  " +a1+ "  |   " +b1+ "   |        "+w1+ "         |        "+ww1);
		 System.out.println("  " +a2+ "  |   " +b2+ "   |        "+w2+ "         |        "+ww2);
		 System.out.println("  " +a3+ "  |   " +b3+ "   |        "+w3+ "         |        "+ww3);
	 }
	
	public void DeMorganSecondLaw(int a, int b, int a1, int b1, int a2, int b2, int a3, int b3, int w, int w1, int w2, int w3, int ww, int ww1, int ww2, int ww3){
		 System.out.println("Solution");
		 System.out.println("  a  |	 b   |   NOT(a AND b)   |  (NOT a) OR (NOT b) ");
		 System.out.println("_____|_______|__________________|____________________");
		 System.out.println("  " +a+ "  |   " +b+ "   |        "+w+ "         |        "+ww);
		 System.out.println("  " +a1+ "  |   " +b1+ "   |        "+w1+ "         |        "+ww1);
		 System.out.println("  " +a2+ "  |   " +b2+ "   |        "+w2+ "         |        "+ww2);
		 System.out.println("  " +a3+ "  |   " +b3+ "   |        "+w3+ "         |        "+ww3);
	 }
	
	public void Associativity(int a, int b, int c, int a1, int b1, int c1, int a2, int b2, int c2, int a3, int b3, int c3, int a4, int b4, int c4, int a5, int b5, int c5, int a6, int b6, int c6, int a7, int b7, int c7, int w, int w1, int w2, int w3, int w4 , int w5, int w6, int w7, int ww, int ww1, int ww2, int ww3, int ww4 , int ww5, int ww6, int ww7){
		 System.out.println("Solution");
		 System.out.println("  a  |	  b   |   c   |   a OR ( b OR c ) |  a AND ( b AND c ) ");
		 System.out.println("_____|________|_______|___________________|____________________");
		 System.out.println("  " +a+   "  |    "+b+"   |   "+c+"   |         "+w+ "         |          "+ww);
		 System.out.println("  " +a1+     "  |    "+b1+"   |   "+c1+"   |         "+w1+ "         |          "+ww1);
		 System.out.println("  " +a2+     "  |    "+b2+"   |   "+c2+"   |         "+w2+ "         |          "+ww2);
		 System.out.println("  " +a3+     "  |    "+b3+"   |   "+c3+"   |         "+w3+ "         |          "+ww3);
		 System.out.println("  " +a4+     "  |    "+b4+"   |   "+c4+"   |         "+w4+ "         |          "+ww4);
		 System.out.println("  " +a5+     "  |    "+b5+"   |   "+c5+"   |         "+w5+ "         |          "+ww5);
		 System.out.println("  " +a6+     "  |    "+b6+"   |   "+c6+"   |         "+w6+ "         |          "+ww6);
		 System.out.println("  " +a7+     "  |    "+b7+"   |   "+c7+"   |         "+w7+ "         |          "+ww7);
	 }
	
	public void Distributivity(int a, int b, int c, int a1, int b1, int c1, int a2, int b2, int c2, int a3, int b3, int c3, int a4, int b4, int c4, int a5, int b5, int c5, int a6, int b6, int c6, int a7, int b7, int c7, int w, int w1, int w2, int w3, int w4 , int w5, int w6, int w7, int ww, int ww1, int ww2, int ww3, int ww4 , int ww5, int ww6, int ww7){
		 System.out.println("Solution");
		 System.out.println("  a  |	  b   |   c   |  a OR ( b AND c ) |  a AND ( b OR c ) ");
		 System.out.println("_____|________|_______|___________________|____________________");
		 System.out.println("  " +a+   "  |    "+b+"   |   "+c+"   |         "+w+ "         |          "+ww);
		 System.out.println("  " +a1+     "  |    "+b1+"   |   "+c1+"   |         "+w1+ "         |          "+ww1);
		 System.out.println("  " +a2+     "  |    "+b2+"   |   "+c2+"   |         "+w2+ "         |          "+ww2);
		 System.out.println("  " +a3+     "  |    "+b3+"   |   "+c3+"   |         "+w3+ "         |          "+ww3);
		 System.out.println("  " +a4+     "  |    "+b4+"   |   "+c4+"   |         "+w4+ "         |          "+ww4);
		 System.out.println("  " +a5+     "  |    "+b5+"   |   "+c5+"   |         "+w5+ "         |          "+ww5);
		 System.out.println("  " +a6+     "  |    "+b6+"   |   "+c6+"   |         "+w6+ "         |          "+ww6);
		 System.out.println("  " +a7+     "  |    "+b7+"   |   "+c7+"   |         "+w7+ "         |          "+ww7);
	 }
	
	public void start_set1(){
		StreamTokenizer strTok1 = new StreamTokenizer( new BufferedReader(new InputStreamReader(System.in)));
		int a, a1, a2, a3;
		System.out.println("COMPLEMENT");
		try {
			System.out.print("Enter the first logical value : ");
			a=logicValue(strTok1);
			System.out.println(" ");
			System.out.println("Second line");
			System.out.print("Enter the first logical value : ");
			a1=logicValue(strTok1);
			System.out.println(" ");
			System.out.println("Third line");
			System.out.print("Enter the first logical value : ");
			a2=logicValue(strTok1);
			System.out.println(" ");
			System.out.println("Last line");
			System.out.print("Enter the first logical value : ");
			a3=logicValue(strTok1);
			System.out.println(" ");
		} catch (IOException e) {
			System.out.println("LogicalValueException");
			return;
		}
		System.out.println(" ");
		Complement(a,a1,a2,a3, complementalt(a), complementalt(a1), complementalt(a2), complementalt(a3), complementcon(a), complementcon(a1), complementcon(a2), complementcon(a3));
	}
	
	public void start_set2(){
		StreamTokenizer strTok2 = new StreamTokenizer( new BufferedReader(new InputStreamReader(System.in)));
		Scanner boolalg1 = new Scanner(System.in);
		int a, a1, a2, a3, b, b1, b2, b3;
		byte choicebool;
		System.out.println("1 - absorption");
		System.out.println("2 - commutativity");
		System.out.println("3 - de morgan's first law");
		System.out.println("4 - de morgan's second law");
		System.out.print("Choose the type of mathematical logic : ");
		choicebool = boolalg1.nextByte();
		switch(choicebool){
		case 1:
			System.out.println("ABSORPTION");
			try{
				System.out.print("Enter the first logical value : ");
				a=logicValue(strTok2);
				System.out.print("Enter the second logical value : ");
				b=logicValue(strTok2);
				System.out.println(" ");
				System.out.println("Second line");
				System.out.print("Enter the first logical value : ");
				a1=logicValue(strTok2);
				System.out.print("Enter the second logical value : ");
				b1=logicValue(strTok2);
				System.out.println(" ");
				System.out.println("Third line");
				System.out.print("Enter the first logical value : ");
				a2=logicValue(strTok2);
				System.out.print("Enter the second logical value : ");
				b2=logicValue(strTok2);
				System.out.println(" ");
				System.out.println("Last line");
				System.out.print("Enter the first logical value : ");
				a3=logicValue(strTok2);
				System.out.print("Enter the second logical value : ");
				b3=logicValue(strTok2);
				System.out.println(" ");
			}catch(IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			Absorption(a, b, a1, b1, a2, b2, a3, b3, absorpalt(a, b), absorpalt(a1, b1), absorpalt(a2, b2), absorpalt(a3, b3), absorpcon(a, b), absorpcon(a1, b1), absorpcon(a2, b2), absorpcon(a3, b3));
			break;
		case 2:
			System.out.println("COMMUTATIVITY");
			try{
				System.out.print("Enter the first logical value : ");
				a=logicValue(strTok2);
				System.out.print("Enter the second logical value : ");
				b=logicValue(strTok2);
				System.out.println(" ");
				System.out.println("Second line");
				System.out.print("Enter the first logical value : ");
				a1=logicValue(strTok2);
				System.out.print("Enter the second logical value : ");
				b1=logicValue(strTok2);
				System.out.println(" ");
				System.out.println("Third line");
				System.out.print("Enter the first logical value : ");
				a2=logicValue(strTok2);
				System.out.print("Enter the second logical value : ");
				b2=logicValue(strTok2);
				System.out.println(" ");
				System.out.println("Last line");
				System.out.print("Enter the first logical value : ");
				a3=logicValue(strTok2);
				System.out.print("Enter the second logical value : ");
				b3=logicValue(strTok2);
				System.out.println(" ");
			}catch(IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			Commutativity(a, b, a1, b1, a2, b2, a3, b3, commutalt(a, b), commutalt(a1, b1), commutalt(a2, b2), commutalt(a3, b3), commutcon(a, b), commutcon(a1, b1), commutcon(a2, b2), commutcon(a3, b3));
			break;
		case 3:
			System.out.println("De MORGAN'S FIRST LAW");
			try{
				System.out.print("Enter the first logical value : ");
				a=logicValue(strTok2);
				System.out.print("Enter the second logical value : ");
				b=logicValue(strTok2);
				System.out.println(" ");
				System.out.println("Second line");
				System.out.print("Enter the first logical value : ");
				a1=logicValue(strTok2);
				System.out.print("Enter the second logical value : ");
				b1=logicValue(strTok2);
				System.out.println(" ");
				System.out.println("Third line");
				System.out.print("Enter the first logical value : ");
				a2=logicValue(strTok2);
				System.out.print("Enter the second logical value : ");
				b2=logicValue(strTok2);
				System.out.println(" ");
				System.out.println("Last line");
				System.out.print("Enter the first logical value : ");
				a3=logicValue(strTok2);
				System.out.print("Enter the second logical value : ");
				b3=logicValue(strTok2);
				System.out.println(" ");
			}catch(IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			DeMorganFirstLaw(a, b, a1, b1, a2, b2, a3, b3, demorgan1(a, b), demorgan1(a1, b1), demorgan1(a2, b2), demorgan1(a3, b3), demorgan1a(a, b), demorgan1a(a1, b1), demorgan1a(a2, b2), demorgan1a(a3, b3));
			break;
		case 4:
			System.out.println("De MORGAN'S SECOND LAW");
			try{
				System.out.print("Enter the first logical value : ");
				a=logicValue(strTok2);
				System.out.print("Enter the second logical value : ");
				b=logicValue(strTok2);
				System.out.println(" ");
				System.out.println("Second line");
				System.out.print("Enter the first logical value : ");
				a1=logicValue(strTok2);
				System.out.print("Enter the second logical value : ");
				b1=logicValue(strTok2);
				System.out.println(" ");
				System.out.println("Third line");
				System.out.print("Enter the first logical value : ");
				a2=logicValue(strTok2);
				System.out.print("Enter the second logical value : ");
				b2=logicValue(strTok2);
				System.out.println(" ");
				System.out.println("Last line");
				System.out.print("Enter the first logical value : ");
				a3=logicValue(strTok2);
				System.out.print("Enter the second logical value : ");
				b3=logicValue(strTok2);
				System.out.println(" ");
			}catch(IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			DeMorganSecondLaw(a, b, a1, b1, a2, b2, a3, b3, demorgan2(a, b), demorgan2(a1, b1), demorgan2(a2, b2), demorgan2(a3, b3), demorgan2a(a, b), demorgan2a(a1, b1), demorgan2a(a2, b2), demorgan2a(a3, b3));
			break;
			default:
				System.out.println("Wrong type of mathematical logic !!!");
		}
	}

	public void start_set3(){
		StreamTokenizer strTok3 = new StreamTokenizer( new BufferedReader(new InputStreamReader(System.in)));
		Scanner boolalg2 = new Scanner(System.in);
		int a, a1, a2, a3, a4, a5, a6, a7, b, b1, b2, b3, b4, b5, b6, b7, c, c1, c2, c3, c4, c5, c6, c7;
		byte choicebool;
		System.out.println("1 - associativity");
		System.out.println("2 - distributivity");
		System.out.print("Choose the type of mathematical logic : ");
		choicebool = boolalg2.nextByte();
		switch(choicebool){
		case 1:
			System.out.println("ASSOCIATIVITY");
			try{
				System.out.print("Enter the first logical value : ");
				a=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				b=logicValue(strTok3);
				System.out.print("Enter the third logical value : ");
				c=logicValue(strTok3);
				System.out.println(" ");
				System.out.println("Second line");
				System.out.print("Enter the first logical value : ");
				a1=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				b1=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				c1=logicValue(strTok3);
				System.out.println(" ");
				System.out.println("Third line");
				System.out.print("Enter the first logical value : ");
				a2=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				b2=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				c2=logicValue(strTok3);
				System.out.println(" ");
				System.out.println("Fourth line");
				System.out.print("Enter the first logical value : ");
				a3=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				b3=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				c3=logicValue(strTok3);
				System.out.println(" ");
				System.out.println("Fifth line");
				System.out.print("Enter the first logical value : ");
				a4=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				b4=logicValue(strTok3);
				System.out.print("Enter the third logical value : ");
				c4=logicValue(strTok3);
				System.out.println(" ");
				System.out.println("Sixth line");
				System.out.print("Enter the first logical value : ");
				a5=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				b5=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				c5=logicValue(strTok3);
				System.out.println(" ");
				System.out.println("Seventh line");
				System.out.print("Enter the first logical value : ");
				a6=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				b6=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				c6=logicValue(strTok3);
				System.out.println(" ");
				System.out.println("Last line");
				System.out.print("Enter the first logical value : ");
				a7=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				b7=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				c7=logicValue(strTok3);
				System.out.println(" ");
			}catch(IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			Associativity(a, b, c, a1, b1, c1, a2, b2, c2, a3, b3, c3, a4, b4, c4, a5, b5, c5, a6, b6, c6, a7, b7, c7, assocalt(a, b, c), assocalt(a1, b1, c1), assocalt(a2, b2, c2), assocalt(a3, b3, c3), assocalt(a4, b4, c4), assocalt(a5, b5, c5), assocalt(a6, b6, c6), assocalt(a7, b7, c7), assoccon(a, b, c), assoccon(a1, b1, c1), assoccon(a2, b2, c2), assoccon(a3, b3, c3), assoccon(a4, b4, c4), assoccon(a5, b5, c5), assoccon(a6, b6, c6), assoccon(a7, b7, c7));
			break;
		case 2:
			System.out.println("DISTRIBUTIVITY");
			try{
				System.out.print("Enter the first logical value : ");
				a=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				b=logicValue(strTok3);
				System.out.print("Enter the third logical value : ");
				c=logicValue(strTok3);
				System.out.println(" ");
				System.out.println("Second line");
				System.out.print("Enter the first logical value : ");
				a1=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				b1=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				c1=logicValue(strTok3);
				System.out.println(" ");
				System.out.println("Third line");
				System.out.print("Enter the first logical value : ");
				a2=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				b2=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				c2=logicValue(strTok3);
				System.out.println(" ");
				System.out.println("Fourth line");
				System.out.print("Enter the first logical value : ");
				a3=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				b3=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				c3=logicValue(strTok3);
				System.out.println(" ");
				System.out.println("Fifth line");
				System.out.print("Enter the first logical value : ");
				a4=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				b4=logicValue(strTok3);
				System.out.print("Enter the third logical value : ");
				c4=logicValue(strTok3);
				System.out.println(" ");
				System.out.println("Sixth line");
				System.out.print("Enter the first logical value : ");
				a5=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				b5=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				c5=logicValue(strTok3);
				System.out.println(" ");
				System.out.println("Seventh line");
				System.out.print("Enter the first logical value : ");
				a6=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				b6=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				c6=logicValue(strTok3);
				System.out.println(" ");
				System.out.println("Last line");
				System.out.print("Enter the first logical value : ");
				a7=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				b7=logicValue(strTok3);
				System.out.print("Enter the second logical value : ");
				c7=logicValue(strTok3);
				System.out.println(" ");
			}catch(IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			Distributivity(a, b, c, a1, b1, c1, a2, b2, c2, a3, b3, c3, a4, b4, c4, a5, b5, c5, a6, b6, c6, a7, b7, c7, distribalt(a, b, c), distribalt(a1, b1, c1), distribalt(a2, b2, c2), distribalt(a3, b3, c3), distribalt(a4, b4, c4), distribalt(a5, b5, c5), distribalt(a6, b6, c6), distribalt(a7, b7, c7), distribcon(a, b, c), distribcon(a1, b1, c1), distribcon(a2, b2, c2), distribcon(a3, b3, c3), distribcon(a4, b4, c4), distribcon(a5, b5, c5), distribcon(a6, b6, c6), distribcon(a7, b7, c7));
			break;
			default:
				System.out.println("Wrong type of mathematical logic !!!");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("AUTHOR : Micha\u0142 Piotr Szmigiel");
		System.out.println("PROGRAM : Boolean algebra in Java");
		System.out.println("Copyright (C) 2013 all rights reserved");
		System.out.println(" ");
		StreamTokenizer strTok4 = new StreamTokenizer( new BufferedReader(new InputStreamReader(System.in)));
		byte set;
		char res;
		Scanner r = new Scanner(System.in);
		BooleanAlgebra booalg = new BooleanAlgebra();
		do{
			try{
			System.out.print("how much are the logical value for a given set : ");
			set=setValue(strTok4);
			switch(set){
			case 1:
				booalg.start_set1();
				break;
			case 2:
				booalg.start_set2();
				break;
			case 3:
				booalg.start_set3();
				break;
			
			default:
				System.out.println("wrong number in the set !");
			}
			}catch(IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			System.out.println("If you press n or N key - the end of program");
			System.out.println("otherwise, if you press any other key - the continuation of the program");
			System.out.println(" ");
			System.out.print("Do you want to calculate again ? {N/n} : ");
			res = r.next().charAt(0);
		}while((res!='N')&&(res!='n'));

	}

}
