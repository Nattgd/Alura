
public class testGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		//gerente.setSalario(5000);
		// Funcionario gerente = new Funcionario();
		 gerente.setSalario(6000);
		 gerente.setTipo(1);
		 gerente.setClave("AluraCursos");
		 
		 System.out.println(gerente.iniciarSesion("AluraCursos"));
		System.out.println(gerente.getBonificacion());
	}
}
