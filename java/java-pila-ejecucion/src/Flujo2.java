
public class Flujo2 {
	
	      
		   public static void main(String[] args) {
		    System.out.println("Inicio main");
		    try {
				metodo1();
			} catch (MiExcepcion e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println("Fin main");
		  }
		  
		  public static void metodo1() throws MiExcepcion{
		    System.out.println("Inicio de metodo1");
		    //try {
		    metodo2();
		//    } catch(MiExcepcion me) {
		 //   	me.printStackTrace();
		 //  	}
		    
		    System.out.println("Fin de metodo1");
		  }
		  
		  public static void metodo2() throws MiExcepcion {
		    System.out.println("Inicio de metodo2");
		    int a= 50/0;		    
		    //for(int i =1; i<= 5; i++){
			//      System.out.println(i);
		   // System.out.println("Fin de metodo2");
		 // }
		   throw new MiExcepcion("Mi excepcion fue lanzada");
		 
		  }  
}
