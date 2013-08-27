
public class Clase {
	static int A=7,B=15;
	public static void main (String x[]){
		int P;
		P=A;
		A=B;
		B=P;
		System.out.println (A+ " valor de A");
		System.out.println (B+ " valor de B");
		if (A>B)
			System.out.println( "Mayor A");
		else
			System.out.println( "Mayor B");
		
	}
}
