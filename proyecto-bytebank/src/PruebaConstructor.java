
public class PruebaConstructor {

	public static void main(String[] args) {
		// clase         instancia
		Cuenta cuenta1 = new Cuenta(555);
		Cuenta cuenta2 = new Cuenta (333);
		
		System.out.println(Cuenta.getTotal());
	//	System.out.println(cuenta.getAgencia());
	}
}
