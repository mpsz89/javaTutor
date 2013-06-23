package Tauthology;

import java.io.*;
import java.util.Scanner;

public class Tauthology {

	public static int neg(int a){
		if(a==1){
			return 0;
		}
		else if(a==0){
			return 1;
		}
		else{
			System.out.println("Logical value error !!!");
		}
		return 0;
	}


	public static int alt(int a, int b){
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

	public static int conj(int a, int b){
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

	public static int cons(int a, int b){
		if(a==1 && b==1){
			return 1;
		}
		else if(a==1 && b==0){
			return 0;
		}
		else if(a==0 && b==1){
			return 1;
		}
		else if(a==0 && b==0){
			return 1;
		}
		else{
			System.out.println("Logical value error !!!");
		}
		return 0;
	}

	public static int iff(int a, int b){
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
			return 1;
		}
		else{
			System.out.println("Logical value error !!!");
		}
		return 0;
	}

	public static int ident(int a){
		return cons(a, a);
	}

	public static int ExclMid(int a){
		return alt(a, neg(a));
	}

	public static int DouNeg(int a){
		return iff(a, neg(neg(a)));
	}

	public static int CommConj(int a, int b){
		return iff(conj(a,b), conj(b,a));
	}

	public static int CommAlt(int a, int b){
		return iff(alt(a,b), alt(b,a));
	}

	public static int CommunConj(int a, int b, int c){
		return iff(conj(conj(a,b),c), conj(a,conj(b,c)));
	}

	public static int CommunAlt(int a, int b, int c){
		return iff(alt(alt(a,b),c), alt(a,alt(b,c)));
	}

	public static int IdeConj(int a){
		return iff(a, conj(a, a));
	}

	public static int IdeAlt(int a){
		return iff(a, alt(a, a));
	}

	public static int DistrConjAlt(int a, int b, int c){
		return iff(conj(a, alt(b, c)), alt(conj(a, b), conj(b, c)));
	}

	public static int DistrAltConj(int a, int b, int c){
		return iff(alt(a, conj(b, c)), conj(alt(a, b), alt(b, c)));
	}

	public static int Absorption1(int a, int b){
		return iff(conj(a, alt(a, b)), a);
	}

	public static int Absorption2(int a, int b){
		return iff(alt(a, conj(a, b)), a);
	}

	public static int Contrad(int a){
		return neg(conj(a, neg(a)));
	}

	public static int DeMorganI(int a, int b){
		return iff(neg(conj(a,b)), alt(neg(a), neg(b)));
	}

	public static int DeMorganII(int a, int b){
		return iff(neg(alt(a,b)), conj(neg(a), neg(b)));
	}

	public static int Clavius(int a){
		return cons(cons(neg(a),a), a);
	}

	public static int DunsScotus(int a, int b){
		return cons(neg(a), cons(a, b));
	}

	public static int Sympliq(int a, int b){
		return cons(a, cons(b, a));
	}

	public static int Sylogism(int a, int b, int c){
		return cons(conj(cons(a, b), cons(b, c)), cons(a, c));
	}

	public static int Tear(int a, int b){
		return cons(conj(cons(a,b), a), a);
	}

	public static int ElimImp(int a, int b){
		return iff(cons(a,b), alt(neg(a), b));
	}

	public static int NegImp(int a, int b){
		return iff(neg(cons(a,b)), alt(a, neg(b)));
	}

	public static int ReducAbsurd(int a, int b){
		return cons(conj(cons(a, b), cons(a, neg(b))), neg(b));
	}

	 public static int Frege(int a, int b, int c){
		 return cons(cons(a, cons(b,c)), cons(cons(a,b), cons(a,c)) );
	 }

	 public int logicValue(StreamTokenizer strTok)
	 throws IOException{
		 while(strTok.nextToken() != StreamTokenizer.TT_NUMBER){
			 System.out.println("It's not logical value");
			 System.out.print("Enter the logic value again : ");
		 }
		 return (int) strTok.nval;
	 }


	 public void MathLogic(int a, int a1, int a2,int a3, int w, int w1, int w2, int w3){
		 System.out.println("Solution");
		 System.out.println("p : " +a+ " |   results : "+w);
		 System.out.println("p : " +a1+ " |   results : "+w1);
		 System.out.println("p : " +a2+ " |   results : "+w2);
		 System.out.println("p : " +a3+ " |   results : "+w3);
	 }

	 public void MathLogic1(int a, int b, int a1, int b1, int a2, int b2, int a3, int b3, int w, int w1, int w2, int w3 ){
		 System.out.println("Solution");
		 System.out.println("p : " +a+ " |  q : "+b+ " |  results : "+w);
		 System.out.println("p : " +a1+ " |  q : "+b1+ " |  results : "+w1);
		 System.out.println("p : " +a2+ " |  q : "+b2+ " |  results : "+w2);
		 System.out.println("p : " +a3+ " |  q : "+b3+ " |  results : "+w3);
	 }

	 public void MathLogic2(int a, int b, int c, int a1, int b1, int c1, int a2, int b2, int c2, int a3, int b3, int c3, int a4, int b4, int c4, int a5, int b5, int c5, int a6, int b6, int c6, int a7, int b7, int c7, int w, int w1, int w2, int w3, int w4, int w5, int w6, int w7){
		 System.out.println("Solution");
		 System.out.println("p : " +a+ " |  q : " +b+ " |  r : "+c+ " |   results : "+w);
		 System.out.println("p : " +a1+ " |  q : "+b1+" |  r : "+c1+ " |   results : "+w1);
		 System.out.println("p : " +a2+ " |  q : "+b2+" |  r : "+c2+ " |   results : "+w2);
		 System.out.println("p : " +a3+ " |  q : "+b3+" |  r : "+c3+ " |   results : "+w3);
		 System.out.println("p : " +a4+ " |  q : " +b4+ " |  r : "+c4+ " |   results : "+w4);
		 System.out.println("p : " +a5+ " |  q : "+b5+" |  r : "+c5+ " |   results : "+w5);
		 System.out.println("p : " +a6+ " |  q : "+b6+" |  r : "+c6+ " |   results : "+w6);
		 System.out.println("p : " +a7+ " |  q : "+b7+" |  r : "+c7+ " |   results : "+w7);
	 }

	 public void isTau(int a, int b, int c, int d){
		 int taut = (a + b + c + d) / 4;
		 if (taut == 1){
			 System.out.println("It's tauthology");
		 }
		 else if(taut < 1){
			 System.out.println("Is not tauthology");
		 }
		 else if(taut == 0){
			 System.out.println("Is not tauthology");
		 }
		 else{
			 System.out.println("Predicate error");
		 }

	 }

	 public void isTau1(int a, int b, int c, int d, int e, int f, int g, int h){
		 int taut = (a + b + c + d + e + f + g + h) / 8;
		 if (taut == 1){
			 System.out.println("It's tauthology");
		 }
		 else if(taut < 1){
			 System.out.println("Is not tauthology");
		 }
		 else if(taut == 0){
			 System.out.println("Is not tauthology");
		 }
		 else{
			 System.out.println("Predicate error");
		 }

	 }

	 public void start(){
		 StreamTokenizer strTok = new StreamTokenizer( new BufferedReader(new InputStreamReader(System.in)));
		 int p = 0, p1 = 0,  p2 = 0, p3 = 0, p4 = 0, p5 = 0,  p6 = 0, p7 = 0;
		 int q = 0,  q1 = 0, q2 = 0,  q3 = 0, q4 = 0,  q5 = 0, q6 = 0,  q7 = 0;
		 int r = 0, r1 = 0, r2 = 0, r3 = 0, r4 = 0, r5 = 0, r6 = 0, r7 = 0;
		 byte logic;
		 Scanner log = new Scanner(System.in);
		 System.out.println("1 - idetity of law");
		 System.out.println("2 - double negation law");
		 System.out.println("3 - commutative law of conjunction");
		 System.out.println("4 - commutative law alternative");
		 System.out.println("5 - communications law conjunctions");
		 System.out.println("6 - alternative communications law");
		 System.out.println("7 - law idempotentity conjunction");
		 System.out.println("8 - law idempotentity alternative");
		 System.out.println("9 - distributive law conjunction of the alternatives");
		 System.out.println("10 - alternative distributive law with respect to conjunction");
		 System.out.println("11 - law of the excluded middle");
		 System.out.println("12 - the law of contradiction");
		 System.out.println("13 - absorption law part 1");
		 System.out.println("14 - absorption law part 2");
		 System.out.println("15 - De Morgan's first law");
		 System.out.println("16 - De Morgan's second law");
		 System.out.println("17 - Clavius");
		 System.out.println("18 - Duns Scotus");
		 System.out.println("19 - Simplification");
		 System.out.println("20 - Sylogism");
		 System.out.println("21 - Tear");
		 System.out.println("22 - eliminate implication");
		 System.out.println("23 - denial implications");
		 System.out.println("24 - reduce absurdity");
		 System.out.println("25 - Frege");
		 System.out.println(" ");
		 System.out.print("Choose the type of mathematical logic : ");
		 logic = log.nextByte();
		 switch(logic){
		 case 1:
			 System.out.println("____IDENTITY_OF_LAW____");
			 try {
				System.out.print("enter the first logical value : ");
				p=logicValue(strTok);
				System.out.println("Second line");
				System.out.print("enter the first logical value : ");
				p1=logicValue(strTok);
				System.out.println("Third line");
				System.out.print("enter the first logical value : ");
				p2=logicValue(strTok);
				System.out.println("Last line");
				System.out.print("enter the first logical value : ");
				p3=logicValue(strTok);

			} catch (IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			MathLogic(p, p1, p2,p3,ident(p),ident(p1),ident(p2),ident(p3));
			System.out.println(" ");
			isTau(ident(p), ident(p1), ident(p2), ident(p3));
			break;
		 case 2:
			 System.out.println("____DOUBLE_NEGATION____");
			 try {
				 System.out.print("enter the first logical value : ");
				 p=logicValue(strTok);
				 System.out.println("Second line");
				 System.out.print("enter the first logical value : ");
				 p1=logicValue(strTok);
				 System.out.println("Third line");
				 System.out.print("enter the first logical value : ");
				 p2=logicValue(strTok);
				 System.out.println("Last line");
				 System.out.print("enter the first logical value : ");
				 p3=logicValue(strTok);

			} catch (IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			MathLogic(p, p1, p2,p3,DouNeg(p),DouNeg(p1),DouNeg(p2),DouNeg(p3));
			System.out.println(" ");
			isTau(DouNeg(p), DouNeg(p1), DouNeg(p2), DouNeg(p3));
			break;
		 case 3:
			 System.out.println("____COMMUTATIVE_LAW_OF_CONJUNCTION___");
			 try {
				System.out.print("enter the first logical value : ");
				p=logicValue(strTok);
				System.out.print("enter the second logical value : ");
				q=logicValue(strTok);
				System.out.println("Second line");
				System.out.print("enter the first logical value : ");
				p1=logicValue(strTok);
				System.out.print("enter the second logical value : ");
				q1=logicValue(strTok);
				System.out.println("Third line");
				System.out.print("enter the first logical value : ");
				p2=logicValue(strTok);
				System.out.print("enter the second logical value : ");
				q2=logicValue(strTok);
				System.out.println("Last line");
				System.out.print("enter the first logical value : ");
				p3=logicValue(strTok);
				System.out.print("enter the second logical value : ");
				q3=logicValue(strTok);

			} catch (IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			MathLogic1(p, q, p1, q1, p2, q2, p3, q3,CommConj(p, q),CommConj(p1, q1),CommConj(p2, q2),CommConj(p3, q3));
			System.out.println(" ");
			isTau(CommConj(p, q), CommConj(p1, q1), CommConj(p2, q2), CommConj(p3, q3));
			break;
		 case 4:
			 System.out.println("____COMMUTATIVE_LAW_ALTENATIVE___");
			 try {
				 System.out.print("enter the first logical value : ");
				 p=logicValue(strTok);
				 System.out.print("enter the second logical value : ");
				 q=logicValue(strTok);
				 System.out.println("Second line");
				 System.out.print("enter the first logical value : ");
				 p1=logicValue(strTok);
				 System.out.print("enter the second logical value : ");
				 q1=logicValue(strTok);
				 System.out.println("Third line");
				 System.out.print("enter the first logical value : ");
				 p2=logicValue(strTok);
				 System.out.print("enter the second logical value : ");
				 q2=logicValue(strTok);
				 System.out.println("Last line");
				 System.out.print("enter the first logical value : ");
				 p3=logicValue(strTok);
				 System.out.print("enter the second logical value : ");
				 q3=logicValue(strTok);

			} catch (IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			MathLogic1(p, q, p1, q1, p2, q2, p3, q3, CommAlt(p, q), CommAlt(p1, q1), CommAlt(p2, q2), CommAlt(p3, q3));
			System.out.println(" ");
			isTau(CommAlt(p, q), CommAlt(p1, q1), CommAlt(p2, q2), CommAlt(p3, q3));
			break;
		 case 5:
			 System.out.println("____COMMUNICATION_LAW_CONJUNCTION___");
			 try {
				 System.out.print("enter the first logical value : ");
					p=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q=logicValue(strTok);
					System.out.print("enter the thirdd logical value : ");
					r=logicValue(strTok);
					System.out.println("Second line");
					System.out.print("enter the first logical value : ");
					p1=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q1=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r1=logicValue(strTok);
					System.out.println("Third line");
					System.out.print("enter the first logical value : ");
					p2=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q2=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r2=logicValue(strTok);
					System.out.println("Fourth line");
					System.out.print("enter the first logical value : ");
					p3=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q3=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r3=logicValue(strTok);
					System.out.println("Fifth line");
					System.out.print("enter the first logical value : ");
					p4=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q4=logicValue(strTok);
					System.out.print("enter the thirdd logical value : ");
					r4=logicValue(strTok);
					System.out.println("Sixth line");
					System.out.print("enter the first logical value : ");
					p5=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q5=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r5=logicValue(strTok);
					System.out.println("Seventh line");
					System.out.print("enter the first logical value : ");
					p6=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q6=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r6=logicValue(strTok);
					System.out.println("Last line");
					System.out.print("enter the first logical value : ");
					p7=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q7=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r7=logicValue(strTok);

			} catch (IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			MathLogic2(p, q, r, p1, q1, r1, p2, q2, r2, p3, q3, r3, p4, q4, r4, p5, q5, r5, p6, q6, r6, p7, q7, r7, CommunConj(p, q, r), CommunConj(p1, q1, r1), CommunConj(p2, q2, r2), CommunConj(p3, q3, r3), CommunConj(p4, q4, r4), CommunConj(p5, q5, r5), CommunConj(p6, q6, r6), CommunConj(p7, q7, r7));
			System.out.println(" ");
			isTau1(CommunConj(p, q, r), CommunConj(p1, q1, r1), CommunConj(p2, q2, r2), CommunConj(p3, q3, r3), CommunConj(p4, q4, r4), CommunConj(p5, q5, r5), CommunConj(p6, q6, r6), CommunConj(p7, q7, r7));
			break;
		 case 6:
			 System.out.println("____COMMUNICATION_LAW_ALTERNATIVE___");
			 try {
				 System.out.print("enter the first logical value : ");
					p=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q=logicValue(strTok);
					System.out.print("enter the thirdd logical value : ");
					r=logicValue(strTok);
					System.out.println("Second line");
					System.out.print("enter the first logical value : ");
					p1=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q1=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r1=logicValue(strTok);
					System.out.println("Third line");
					System.out.print("enter the first logical value : ");
					p2=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q2=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r2=logicValue(strTok);
					System.out.println("Fourth line");
					System.out.print("enter the first logical value : ");
					p3=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q3=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r3=logicValue(strTok);
					System.out.println("Fifth line");
					System.out.print("enter the first logical value : ");
					p4=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q4=logicValue(strTok);
					System.out.print("enter the thirdd logical value : ");
					r4=logicValue(strTok);
					System.out.println("Sixth line");
					System.out.print("enter the first logical value : ");
					p5=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q5=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r5=logicValue(strTok);
					System.out.println("Seventh line");
					System.out.print("enter the first logical value : ");
					p6=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q6=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r6=logicValue(strTok);
					System.out.println("Last line");
					System.out.print("enter the first logical value : ");
					p7=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q7=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r7=logicValue(strTok);

			} catch (IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			MathLogic2(p, q, r, p1, q1, r1, p2, q2, r2, p3, q3, r3, p4, q4, r4, p5, q5, r5, p6, q6, r6, p7, q7, r7, CommunAlt(p, q, r), CommunAlt(p1, q1, r1), CommunAlt(p2, q2, r2), CommunAlt(p3, q3, r3), CommunAlt(p4, q4, r4), CommunAlt(p5, q5, r5), CommunAlt(p6, q6, r6), CommunAlt(p7, q7, r7));
			System.out.println(" ");
			isTau1(CommunAlt(p, q, r), CommunAlt(p1, q1, r1), CommunAlt(p2, q2, r2), CommunAlt(p3, q3, r3), CommunAlt(p4, q4, r4), CommunAlt(p5, q5, r5), CommunAlt(p6, q6, r6), CommunAlt(p7, q7, r7));
			break;
		 case 7:
			 System.out.println("____LAW_IDEMPOTENTITY_CONCJUCTION____");
			 try {
				System.out.print("enter the first logical value : ");
				p=logicValue(strTok);
				System.out.println("Second line");
				System.out.print("enter the first logical value : ");
				p1=logicValue(strTok);
				System.out.println("Third line");
				System.out.print("enter the first logical value : ");
				p2=logicValue(strTok);
				System.out.println("Last line");
				System.out.print("enter the first logical value : ");
				p3=logicValue(strTok);

			} catch (IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			MathLogic(p, p1, p2,p3,IdeConj(p),IdeConj(p1),IdeConj(p2),IdeConj(p3));
			System.out.println(" ");
			isTau(IdeConj(p), IdeConj(p1), IdeConj(p2), IdeConj(p3));
			break;
		 case 8:
			 System.out.println("____LAW_IDEMPOTENTITY_ALTERNATIVE____");
			 try {
				System.out.print("enter the first logical value : ");
				p=logicValue(strTok);
				System.out.println("Second line");
				System.out.print("enter the first logical value : ");
				p1=logicValue(strTok);
				System.out.println("Third line");
				System.out.print("enter the first logical value : ");
				p2=logicValue(strTok);
				System.out.println("Last line");
				System.out.print("enter the first logical value : ");
				p3=logicValue(strTok);

			} catch (IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			MathLogic(p, p1, p2,p3,IdeAlt(p),IdeAlt(p1),IdeAlt(p2),IdeAlt(p3));
			System.out.println(" ");
			isTau(IdeAlt(p), IdeAlt(p1), IdeAlt(p2), IdeAlt(p3));
			break;
		 case 9:
			 System.out.println("____DISTRIBUTIVE_LAW_CONJUNCTION_OF_THE_ALTERNATIVE___");
			 try {
				 System.out.print("enter the first logical value : ");
					p=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q=logicValue(strTok);
					System.out.print("enter the thirdd logical value : ");
					r=logicValue(strTok);
					System.out.println("Second line");
					System.out.print("enter the first logical value : ");
					p1=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q1=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r1=logicValue(strTok);
					System.out.println("Third line");
					System.out.print("enter the first logical value : ");
					p2=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q2=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r2=logicValue(strTok);
					System.out.println("Fourth line");
					System.out.print("enter the first logical value : ");
					p3=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q3=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r3=logicValue(strTok);
					System.out.println("Fifth line");
					System.out.print("enter the first logical value : ");
					p4=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q4=logicValue(strTok);
					System.out.print("enter the thirdd logical value : ");
					r4=logicValue(strTok);
					System.out.println("Sixth line");
					System.out.print("enter the first logical value : ");
					p5=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q5=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r5=logicValue(strTok);
					System.out.println("Seventh line");
					System.out.print("enter the first logical value : ");
					p6=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q6=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r6=logicValue(strTok);
					System.out.println("Last line");
					System.out.print("enter the first logical value : ");
					p7=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q7=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r7=logicValue(strTok);

			} catch (IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			MathLogic2(p, q, r, p1, q1, r1, p2, q2, r2, p3, q3, r3, p4, q4, r4, p5, q5, r5, p6, q6, r6, p7, q7, r7,  DistrConjAlt(p, q, r), DistrConjAlt(p1, q1, r1), DistrConjAlt(p2, q2, r2), DistrConjAlt(p3, q3, r3), DistrConjAlt(p4, q4, r4), DistrConjAlt(p5, q5, r5), DistrConjAlt(p6, q6, r6), DistrConjAlt(p7, q7, r7));
			System.out.println(" ");
			isTau1(DistrConjAlt(p, q, r), DistrConjAlt(p1, q1, r1), DistrConjAlt(p2, q2, r2), DistrConjAlt(p3, q3, r3), DistrConjAlt(p4, q4, r4), DistrConjAlt(p5, q5, r5), DistrConjAlt(p6, q6, r6), DistrConjAlt(p7, q7, r7));
			break;
		 case 10:
			 System.out.println("____ALERNATIVE_DISTRIBUTE_LAW_WITH RESPECT_TO_CONJUNCTION___");
			 try {
				 System.out.print("enter the first logical value : ");
					p=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q=logicValue(strTok);
					System.out.print("enter the thirdd logical value : ");
					r=logicValue(strTok);
					System.out.println("Second line");
					System.out.print("enter the first logical value : ");
					p1=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q1=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r1=logicValue(strTok);
					System.out.println("Third line");
					System.out.print("enter the first logical value : ");
					p2=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q2=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r2=logicValue(strTok);
					System.out.println("Fourth line");
					System.out.print("enter the first logical value : ");
					p3=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q3=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r3=logicValue(strTok);
					System.out.println("Fifth line");
					System.out.print("enter the first logical value : ");
					p4=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q4=logicValue(strTok);
					System.out.print("enter the thirdd logical value : ");
					r4=logicValue(strTok);
					System.out.println("Sixth line");
					System.out.print("enter the first logical value : ");
					p5=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q5=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r5=logicValue(strTok);
					System.out.println("Seventh line");
					System.out.print("enter the first logical value : ");
					p6=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q6=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r6=logicValue(strTok);
					System.out.println("Last line");
					System.out.print("enter the first logical value : ");
					p7=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q7=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r7=logicValue(strTok);

			} catch (IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			MathLogic2(p, q, r, p1, q1, r1, p2, q2, r2, p3, q3, r3, p4, q4, r4, p5, q5, r5, p6, q6, r6, p7, q7, r7,  DistrAltConj(p, q, r), DistrAltConj(p1, q1, r1), DistrAltConj(p2, q2, r2), DistrAltConj(p3, q3, r3), DistrAltConj(p4, q4, r4), DistrAltConj(p5, q5, r5), DistrAltConj(p6, q6, r6), DistrAltConj(p7, q7, r7));
			System.out.println(" ");
			isTau1(DistrAltConj(p, q, r), DistrAltConj(p1, q1, r1), DistrAltConj(p2, q2, r2), DistrAltConj(p3, q3, r3),DistrAltConj(p4, q4, r4), DistrAltConj(p5, q5, r5), DistrAltConj(p6, q6, r6), DistrAltConj(p7, q7, r7));
			break;
		 case 11:
			 System.out.println("____LAW_OF_THE_EXCLUDED_MIDDLE____");
			 try {
				System.out.print("enter the first logical value : ");
				p=logicValue(strTok);
				System.out.println("Second line");
				System.out.print("enter the first logical value : ");
				p1=logicValue(strTok);
				System.out.println("Third line");
				System.out.print("enter the first logical value : ");
				p2=logicValue(strTok);
				System.out.println("Last line");
				System.out.print("enter the first logical value : ");
				p3=logicValue(strTok);

			} catch (IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			MathLogic(p, p1, p2,p3,ExclMid(p),ExclMid(p1),ExclMid(p2),ExclMid(p3));
			System.out.println(" ");
			isTau(ExclMid(p), ExclMid(p1), ExclMid(p2), ExclMid(p3));
			break;
		 case 12:
			 System.out.println("____THE_LAW_OF_CONTRADICTION____");
			 try {
				System.out.print("enter the first logical value : ");
				p=logicValue(strTok);
				System.out.println("Second line");
				System.out.print("enter the first logical value : ");
				p1=logicValue(strTok);
				System.out.println("Third line");
				System.out.print("enter the first logical value : ");
				p2=logicValue(strTok);
				System.out.println("Last line");
				System.out.print("enter the first logical value : ");
				p3=logicValue(strTok);

			} catch (IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			MathLogic(p, p1, p2,p3,Contrad(p),Contrad(p1),Contrad(p2),Contrad(p3));
			System.out.println(" ");
			isTau(Contrad(p),Contrad(p1),Contrad(p2),Contrad(p3));
			break;
		 case 13:
			 System.out.println("____ABSORPTION_PT_1___");
			 try {
				System.out.print("enter the first logical value : ");
				p=logicValue(strTok);
				System.out.print("enter the second logical value : ");
				q=logicValue(strTok);
				System.out.println("Second line");
				System.out.print("enter the first logical value : ");
				p1=logicValue(strTok);
				System.out.print("enter the second logical value : ");
				q1=logicValue(strTok);
				System.out.println("Third line");
				System.out.print("enter the first logical value : ");
				p2=logicValue(strTok);
				System.out.print("enter the second logical value : ");
				q2=logicValue(strTok);
				System.out.println("Last line");
				System.out.print("enter the first logical value : ");
				p3=logicValue(strTok);
				System.out.print("enter the second logical value : ");
				q3=logicValue(strTok);

			} catch (IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			MathLogic1(p, q, p1, q1, p2, q2, p3, q3, Absorption1(p, q), Absorption1(p1, q1), Absorption1(p2, q2), Absorption1(p3, q3));
			System.out.println(" ");
			isTau(Absorption1(p, q), Absorption1(p1, q1), Absorption1(p2, q2), Absorption1(p3, q3));
			break;
		 case 14:
			 System.out.println("____ABSORPTION_PT_2___");
			 try {
				 System.out.print("enter the first logical value : ");
					p=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q=logicValue(strTok);
					System.out.println("Second line");
					System.out.print("enter the first logical value : ");
					p1=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q1=logicValue(strTok);
					System.out.println("Third line");
					System.out.print("enter the first logical value : ");
					p2=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q2=logicValue(strTok);
					System.out.println("Last line");
					System.out.print("enter the first logical value : ");
					p3=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q3=logicValue(strTok);

			} catch (IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			MathLogic1(p, q, p1, q1, p2, q2, p3, q3, Absorption2(p, q), Absorption2(p1, q1), Absorption2(p2, q2), Absorption2(p3, q3));
			System.out.println(" ");
			isTau(Absorption2(p, q), Absorption2(p1, q1), Absorption2(p2, q2), Absorption2(p3, q3));
			break;
		 case 15:
			 System.out.println("____De_MORGAN'S_FIRST_LAW___");
			 try {
				 System.out.print("enter the first logical value : ");
					p=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q=logicValue(strTok);
					System.out.println("Second line");
					System.out.print("enter the first logical value : ");
					p1=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q1=logicValue(strTok);
					System.out.println("Third line");
					System.out.print("enter the first logical value : ");
					p2=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q2=logicValue(strTok);
					System.out.println("Last line");
					System.out.print("enter the first logical value : ");
					p3=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q3=logicValue(strTok);

			} catch (IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			MathLogic1(p, q, p1, q1, p2, q2, p3, q3, DeMorganI(p, q), DeMorganI(p1, q1), DeMorganI(p2, q2), DeMorganI(p3, q3));
			System.out.println(" ");
			isTau(DeMorganI(p, q), DeMorganI(p1, q1), DeMorganI(p2, q2), DeMorganI(p3, q3));
			break;
		 case 16:
			 System.out.println("____De_MORGAN'S_SECOND_LAW___");
			 try {
				 System.out.print("enter the first logical value : ");
					p=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q=logicValue(strTok);
					System.out.println("Second line");
					System.out.print("enter the first logical value : ");
					p1=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q1=logicValue(strTok);
					System.out.println("Third line");
					System.out.print("enter the first logical value : ");
					p2=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q2=logicValue(strTok);
					System.out.println("Last line");
					System.out.print("enter the first logical value : ");
					p3=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q3=logicValue(strTok);

			} catch (IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			MathLogic1(p, q, p1, q1, p2, q2, p3, q3, DeMorganII(p, q), DeMorganII(p1, q1), DeMorganII(p2, q2), DeMorganII(p3, q3));
			System.out.println(" ");
			isTau(DeMorganII(p, q), DeMorganII(p1, q1), DeMorganII(p2, q2), DeMorganII(p3, q3));
			break;
		 case 17:
			 System.out.println("____CLAVIUS____");
			 try {
				System.out.print("enter the first logical value : ");
				p=logicValue(strTok);
				System.out.println("Second line");
				System.out.print("enter the first logical value : ");
				p1=logicValue(strTok);
				System.out.println("Third line");
				System.out.print("enter the first logical value : ");
				p2=logicValue(strTok);
				System.out.println("Last line");
				System.out.print("enter the first logical value : ");
				p3=logicValue(strTok);

			} catch (IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			MathLogic(p, p1, p2,p3,Clavius(p),Clavius(p1),Clavius(p2),Clavius(p3));
			System.out.println(" ");
			isTau(Clavius(p),Clavius(p1),Clavius(p2),Clavius(p3));
			break;
		 case 18:
			 System.out.println("____DUNS_SCOTUS___");
			 try {
				 System.out.print("enter the first logical value : ");
					p=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q=logicValue(strTok);
					System.out.println("Second line");
					System.out.print("enter the first logical value : ");
					p1=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q1=logicValue(strTok);
					System.out.println("Third line");
					System.out.print("enter the first logical value : ");
					p2=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q2=logicValue(strTok);
					System.out.println("Last line");
					System.out.print("enter the first logical value : ");
					p3=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q3=logicValue(strTok);

			} catch (IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			MathLogic1(p, q, p1, q1, p2, q2, p3, q3, DunsScotus(p, q), DunsScotus(p1, q1), DunsScotus(p2, q2), DunsScotus(p3, q3));
			System.out.println(" ");
			isTau(DunsScotus(p, q), DunsScotus(p1, q1), DunsScotus(p2, q2), DunsScotus(p3, q3));
			break;
		 case 19:
			 System.out.println("____SIMPLIFICATION___");
			 try {
				 System.out.print("enter the first logical value : ");
					p=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q=logicValue(strTok);
					System.out.println("Second line");
					System.out.print("enter the first logical value : ");
					p1=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q1=logicValue(strTok);
					System.out.println("Third line");
					System.out.print("enter the first logical value : ");
					p2=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q2=logicValue(strTok);
					System.out.println("Last line");
					System.out.print("enter the first logical value : ");
					p3=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q3=logicValue(strTok);

			} catch (IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			MathLogic1(p, q, p1, q1, p2, q2, p3, q3, Sympliq(p, q), Sympliq(p1, q1), Sympliq(p2, q2), Sympliq(p3, q3));
			System.out.println(" ");
			isTau(Sympliq(p, q), Sympliq(p1, q1), Sympliq(p2, q2), Sympliq(p3, q3));
			break;
		 case 20:
			 System.out.println("____SYLOGISM___");
			 try {
				 System.out.print("enter the first logical value : ");
					p=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q=logicValue(strTok);
					System.out.print("enter the thirdd logical value : ");
					r=logicValue(strTok);
					System.out.println("Second line");
					System.out.print("enter the first logical value : ");
					p1=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q1=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r1=logicValue(strTok);
					System.out.println("Third line");
					System.out.print("enter the first logical value : ");
					p2=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q2=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r2=logicValue(strTok);
					System.out.println("Fourth line");
					System.out.print("enter the first logical value : ");
					p3=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q3=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r3=logicValue(strTok);
					System.out.println("Fifth line");
					System.out.print("enter the first logical value : ");
					p4=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q4=logicValue(strTok);
					System.out.print("enter the thirdd logical value : ");
					r4=logicValue(strTok);
					System.out.println("Sixth line");
					System.out.print("enter the first logical value : ");
					p5=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q5=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r5=logicValue(strTok);
					System.out.println("Seventh line");
					System.out.print("enter the first logical value : ");
					p6=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q6=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r6=logicValue(strTok);
					System.out.println("Last line");
					System.out.print("enter the first logical value : ");
					p7=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q7=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r7=logicValue(strTok);
			} catch (IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			MathLogic2(p, q, r, p1, q1, r1, p2, q2, r2, p3, q3, r3, p4, q4, r4, p5, q5, r5, p6, q6, r6, p7, q7, r7, Sylogism(p, q, r), Sylogism(p1, q1, r1),Sylogism(p2, q2, r2), Sylogism(p3, q3, r3), Sylogism(p4, q4, r4), Sylogism(p5, q5, r5),Sylogism(p6, q6, r6), Sylogism(p7, q7, r7));
			System.out.println(" ");
			isTau1(Sylogism(p, q, r), Sylogism(p1, q1, r1),Sylogism(p2, q2, r2), Sylogism(p3, q3, r3), Sylogism(p4, q4, r4), Sylogism(p5, q5, r5), Sylogism(p6, q6, r6), Sylogism(p7, q7, r7));
			break;
		 case 21:
			 System.out.println("____TEAR___");
			 try {
				 System.out.print("enter the first logical value : ");
					p=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q=logicValue(strTok);
					System.out.println("Second line");
					System.out.print("enter the first logical value : ");
					p1=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q1=logicValue(strTok);
					System.out.println("Third line");
					System.out.print("enter the first logical value : ");
					p2=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q2=logicValue(strTok);
					System.out.println("Last line");
					System.out.print("enter the first logical value : ");
					p3=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q3=logicValue(strTok);

			} catch (IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			MathLogic1(p, q, p1, q1, p2, q2, p3, q3, Tear(p, q), Tear(p1, q1), Tear(p2, q2), Tear(p3, q3));
			System.out.println(" ");
			isTau(Tear(p, q), Tear(p1, q1), Tear(p2, q2), Tear(p3, q3));
			break;
		 case 22:
			 System.out.println("____ELIMINATE_IMPLICATION___");
			 try {
				 System.out.print("enter the first logical value : ");
					p=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q=logicValue(strTok);
					System.out.println("Second line");
					System.out.print("enter the first logical value : ");
					p1=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q1=logicValue(strTok);
					System.out.println("Third line");
					System.out.print("enter the first logical value : ");
					p2=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q2=logicValue(strTok);
					System.out.println("Last line");
					System.out.print("enter the first logical value : ");
					p3=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q3=logicValue(strTok);

			} catch (IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			MathLogic1(p, q, p1, q1, p2, q2, p3, q3, ElimImp(p, q), ElimImp(p1, q1), ElimImp(p2, q2), ElimImp(p3, q3));
			System.out.println(" ");
			isTau(ElimImp(p, q), ElimImp(p1, q1), ElimImp(p2, q2), ElimImp(p3, q3));
			break;
		 case 23:
			 System.out.println("____DENIAL_IMPLICATION___");
			 try {
				 System.out.print("enter the first logical value : ");
					p=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q=logicValue(strTok);
					System.out.println("Second line");
					System.out.print("enter the first logical value : ");
					p1=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q1=logicValue(strTok);
					System.out.println("Third line");
					System.out.print("enter the first logical value : ");
					p2=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q2=logicValue(strTok);
					System.out.println("Last line");
					System.out.print("enter the first logical value : ");
					p3=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q3=logicValue(strTok);

			} catch (IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			MathLogic1(p, q, p1, q1, p2, q2, p3, q3, NegImp(p, q), NegImp(p1, q1), NegImp(p2, q2), NegImp(p3, q3));
			System.out.println(" ");
			isTau(NegImp(p, q), NegImp(p1, q1), NegImp(p2, q2), NegImp(p3, q3));
			break;
		 case 24:
			 System.out.println("____REDUCE_ABSURDITY___");
			 try {
				 System.out.print("enter the first logical value : ");
					p=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q=logicValue(strTok);
					System.out.println("Second line");
					System.out.print("enter the first logical value : ");
					p1=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q1=logicValue(strTok);
					System.out.println("Third line");
					System.out.print("enter the first logical value : ");
					p2=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q2=logicValue(strTok);
					System.out.println("Last line");
					System.out.print("enter the first logical value : ");
					p3=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q3=logicValue(strTok);

			} catch (IOException e) {
				System.out.println("LogicalValueException");
				return;
			}
			System.out.println(" ");
			MathLogic1(p, q, p1, q1, p2, q2, p3, q3, ReducAbsurd(p, q), ReducAbsurd(p1, q1), ReducAbsurd(p2, q2), ReducAbsurd(p3, q3));
			System.out.println(" ");
			isTau(ReducAbsurd(p, q), ReducAbsurd(p1, q1), ReducAbsurd(p2, q2), ReducAbsurd(p3, q3));
			break;
		 case 25:
			 System.out.println("____FREGE___");
			 try {
				 System.out.print("enter the first logical value : ");
					p=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q=logicValue(strTok);
					System.out.print("enter the thirdd logical value : ");
					r=logicValue(strTok);
					System.out.println("Second line");
					System.out.print("enter the first logical value : ");
					p1=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q1=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r1=logicValue(strTok);
					System.out.println("Third line");
					System.out.print("enter the first logical value : ");
					p2=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q2=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r2=logicValue(strTok);
					System.out.println("Fourth line");
					System.out.print("enter the first logical value : ");
					p3=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q3=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r3=logicValue(strTok);
					System.out.println("Fifth line");
					System.out.print("enter the first logical value : ");
					p4=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q4=logicValue(strTok);
					System.out.print("enter the thirdd logical value : ");
					r4=logicValue(strTok);
					System.out.println("Sixth line");
					System.out.print("enter the first logical value : ");
					p5=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q5=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r5=logicValue(strTok);
					System.out.println("Seventh line");
					System.out.print("enter the first logical value : ");
					p6=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q6=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r6=logicValue(strTok);
					System.out.println("Last line");
					System.out.print("enter the first logical value : ");
					p7=logicValue(strTok);
					System.out.print("enter the second logical value : ");
					q7=logicValue(strTok);
					System.out.print("enter the third logical value : ");
					r7=logicValue(strTok);

				} catch (IOException e) {
					System.out.println("LogicalValueException");
					return;
			}
			System.out.println(" ");
			MathLogic2(p, q, r, p1, q1, r1, p2, q2, r2, p3, q3, r3, p4, q4, r4, p5, q5, r5, p6, q6, r6, p7, q7, r7, Frege(p, q, r), Frege(p1, q1, r1), Frege(p2, q2, r2), Frege(p3, q3, r3), Frege(p4, q4, r4), Frege(p5, q5, r5), Frege(p6, q6, r6), Frege(p7, q7, r7));
			System.out.println(" ");
			isTau1(Frege(p, q, r), Frege(p1, q1, r1), Frege(p2, q2, r2), Frege(p3, q3, r3), Frege(p4, q4, r4), Frege(p5, q5, r5), Frege(p6, q6, r6), Frege(p7, q7, r7));
			break;
		default:
			System.out.println("Wrong type of mathematical logic !!!");
		 }

	 }


	public static void main(String[] args) {
		System.out.println("AUTHOR : Micha\u0142 Piotr Szmigiel");
		System.out.println("PROGRAM : Tauthology in Java");
		System.out.println("Copyright (C) 2013 all rights reserved");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		char res;
		Scanner r = new Scanner(System.in);
		Tauthology tau = new Tauthology();
		do{
		tau.start();
		System.out.println(" ");
		System.out.println("If you press n or N key - the end of program");
		System.out.println("otherwise, if you press any other key - the continuation of the program");
		System.out.println(" ");
		System.out.print("Do you want to calculate again ? {N/n} : ");
		res = r.next().charAt(0);
		}while((res!='N')&&(res!='n'));
	}

}
