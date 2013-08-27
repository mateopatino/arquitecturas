package tuto;

public class metododelcesar {
 

		public static final char[] abc = {'A','B','C','D','E','F','G','H', 'I',
			'J','K','L','M', 'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		protected char[] encriptar = new char[abc.length];	// Arreglo encriptamiento
		protected char[] descifrar = new char[abc.length];	// Arreglo desciframiento

		/** Constructor que inicializa los arreglos de encriptamiento y
		 * desciframiento */
		public metododelcesar() {
			for (int i=0; i<abc.length; i++) 
				encriptar[i] = abc[(i + 3) % abc.length]; // rotar alfabeto 3 lugares
			for (int i=0; i<abc.length; i++) 
				descifrar[encriptar[i]-'A'] = abc[i]; // descifrar inverso a encriptar
		}

		/** Método de encriptamiento */
		public String encriptar(String secreto) {
			char[] mensj = secreto.toCharArray(); // arreglo mensaje
			for (int i=0; i<mensj.length; i++)    // ciclo de encriptamiento
				if (Character.isUpperCase(mensj[i])) // se tiene que cambiar letra
					mensj[i] = encriptar[mensj[i] - 'A']; // usar letra como índice
			return new String(mensj);
		}

		/** Método de desciframiento */
		public String descifrar(String secreto) {
			char[] mensj = secreto.toCharArray();		 // arreglo mensaje
			for (int i=0; i<mensj.length; i++)			 // ciclo desciframiento
				if (Character.isUpperCase(mensj[i]))	 // se tiene letra a cambiar
					mensj[i] = descifrar[mensj[i] - 'A'];	 // usar letra como índice
			return new String(mensj);
		}

		/** Metodo main para probar el cifrador de César */
		public static void main(String[] args) {
			metododelcesar cifrador = new metododelcesar(); // Crear un objeto cifrado de César
			System.out.println("Orden de Encriptamiento = " + 
				new String(cifrador.encriptar));
			System.out.println("Orden de Descifrado = " +
				new String(cifrador.descifrar));
			String secreto = "JEISON; IVAN COY HERRERA.";
			secreto = cifrador.encriptar(secreto);
			System.out.println(secreto);				 // el texto cifrado
			secreto = cifrador.descifrar(secreto);
			System.out.println(secreto);				 // debería ser texto plano
		}
	}

