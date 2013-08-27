package tuto;
	import java.util.*;

	public class vigenere {
	 
	    public static void main(String[] args){
	        Scanner in=new Scanner(System.in); 
	        String p="",c="",k="",l="abcdefghijklmnopqrstuvwxyz";
	             System.out.print("DIGITE EL TEXTO"); 
	            p=in.nextLine();
	            System.out.print("DIGITE LA LLAVE");
	        k=in.nextLine();
	            int ky=k.length();
	            int pln=p.length();
	        String  y =k;
	        int m = pln%ky;         
	        for( int i=1; i<pln/ky ; i++){
	                 k=k+y;
	       }
	 
	        k=k+k.substring(0,m);   
	        for (int j=0; j<pln; j++ ){
	            c=c + l.charAt((l.indexOf(k.charAt(j)) + l.indexOf(p.charAt(j)))%26);
	        }
	        c=c.toUpperCase();
	        System.out.println("ENCRIPTACION DE TEXTO: "+c);
	        c = c.toLowerCase();
	        String pl = "";
	        for (int r=0; r<pln; r++ ){
	            pl=pl + l.charAt(((l.indexOf(c.charAt(r)) - l.indexOf(k.charAt(r))) +26 )%26);
	        }  
	        System.out.println("DESENCRIPTACION DE TEXTO: "+p);
	           
	      

	    }

	}