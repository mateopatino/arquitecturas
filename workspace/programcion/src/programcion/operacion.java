package programcion;

public class operacion {
	
	
	int x,y;
	
	public static void main (String m[]){
		
	
		
		operacion n=new operacion();
		
		n.multiplicacion(2,3);
		n.suma(2,3);
		
		
	}
	
	public void multiplicacion(int x,int y){
	int n;
	n= x*y;
	System.out.println("la multiplicacion es"+ n);
	}
	
	public void suma(int x,int y){
		int n;
		n= x+y;
		System.out.println("la suma es"+ n);
		}
		
}
