
public class TestConexion {

	public static void main(String[] args) throws Exception {	
		
		//Utilizo esta estructura (Try with resources) cuando aplico AutoCloseable
		
		try(Conexion con = new Conexion()){
			con.leerDatos();
		}catch(IllegalStateException ex) {
			System.out.println("Ejecutando catch");
			ex.printStackTrace();
		}
		
		/*  OTRA FORMA DE APLICAR CON TRY FINALLY. Si no aplico AutoCloseable
	Conexion con = null;
	
	try {	
	    con = new Conexion();	
	    con.leerDatos();
	
    }catch (IllegalStateException ex) {
    	System.out.println("Recibiendo exception");
    	ex.printStackTrace();
    } 
	 finally {
    	
    	System.out.println("Ejecutando finally");
    	if(con != null){
    	con.cerrar();    
    	} 
	 }
	 */
	}
}	

	
	
