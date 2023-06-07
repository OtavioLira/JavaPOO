package tokio.aulas;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		/* sizes
		 * byte -128 to 127
		 * short -32768 to 32767
		 * int -2147483648 to 2147483647
		 * long -9223372036854775808 to 9223372036854775807
		 * boolean True e False
		 * char caracteres
		 * float 1.40239846e-45f to 3.40282347e+38f
		 * double 4.94065645841246544e-324 to 1.79769313486231570e+308
		 */
		byte numeroByte = -128;
		short numeroShort = -32768;
		int numeroInt = -2147483648;
		long numeroLong = -92233720;
		boolean bool = true;
		char c = 'a';
		float numeroFloat = 12.5f;
		double numeroDouble = 10.0f;
		System.out.print(numeroByte);
		System.out.print(numeroShort);
		System.out.print(numeroInt);
		System.out.print(numeroLong);
		System.out.print(bool);
		System.out.print(c);
		System.out.print(numeroFloat);
		System.out.print(numeroDouble);
		

	}

}
