
public class pruebaMetodos {

	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		miCuenta= 300;
		miCuenta.depositar(200);		
		System.out.println(miCuenta.obtenerSaldo());
		
		miCuenta.retirar(100);
		System.out.println(miCuenta.obtenerSaldo());
		
		Cuenta cuentaDeJimena = new Cuenta();
		cuentaDeJimena.depositar(1000);
		boolean puedeTransferir = cuentaDeJimena.transferir(400, miCuenta);
		
		if(puedeTransferir) {
			System.out.println("Transferencia exitosa");
		}else {
			System.out.println("No es posible transferir");
		}
		System.out.println(cuentaDeJimena.obtenerSaldo());
		System.out.println(miCuenta.obtenerSaldo());
		
	}
}
