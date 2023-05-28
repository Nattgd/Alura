
public class CrearCuenta {

	public static void main(String[] args) {
		// Variable          =  Valor
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.depositar(1000);
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.retirar( 500);
		System.out.println(segundaCuenta.getSaldo());
		
	}
}
