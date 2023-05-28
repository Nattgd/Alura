
public class testReferencia {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 200;
		
		Cuenta segundaCuenta = primeraCuenta;
		segundaCuenta.saldo = 100;
		System.out.println("saldo primera cuenta: " + primeraCuenta.saldo);
		System.out.println("saldo segunda cuenta: " + segundaCuenta.saldo);
		
		segundaCuenta.saldo += 400;
		System.out.println("saldo primera cuenta: " + primeraCuenta.saldo);

	}

}
