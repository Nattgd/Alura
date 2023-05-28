// entidad Cuenta:
public abstract class Cuenta {
	
	protected double saldo;
	private int agencia =1 ;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total = 0;

	
	//Metodo constructor
	public Cuenta(int agencia, int numero) {
		
		if(agencia <= 0) {
			System.out.println("No se permite ese valor");
			this.agencia = 1;
			this.numero = numero ;
		}else {
			this.agencia = agencia;
		}
		Cuenta.total ++;
		System.out.println("Se van creando: " + total + "cuentas");
	}
	
	//no retorna valor
	public abstract void depositar(double valor);
	
	//retorna valor
	public boolean retirar(double valor){
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}		
	}
	
	public boolean transferir(double valor, Cuenta cuenta){
		if (this.saldo >= valor) {
			this.retirar(valor);
			cuenta.depositar(valor);
			return true;			
		} else {
			return false;
		}
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	//public void setAgencia(int agencia) {
	//	if(agencia > 0) {
	//	this.agencia = agencia;
	//    }else {System.out.println("No estan permitidos numeros negativos");
	//    }
	//    }
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Cuenta.total;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}