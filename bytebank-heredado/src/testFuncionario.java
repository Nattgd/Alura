
public class testFuncionario {

	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setNombre("Diego");
		diego.setDocumento("444555666");
		diego.setSalario(2000);
		diego.setTipo(0);
		
			
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	}
}
