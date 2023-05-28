package com.latam.alura.tienda.prueba;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.alura.tienda.dao.CategoriaDao;
import com.alura.tienda.dao.ProductoDao;
import com.latam.alura.tienda.modelo.Categoria;
import com.latam.alura.tienda.modelo.Producto;
import com.latam.alura.tienda.utils.JPAUtils;

public class RegistroDeProducto {

	public static void main(String[] args) {
		
		registarProducto();
		EntityManager em = JPAUtils.getEntityManager();
		ProductoDao productoDao = new ProductoDao(em);
		Producto producto = productoDao.consultaPorId(1l);
		System.out.println(producto.getNombre());
		
		//List<Producto> productos = productoDao.consultarTodos();
		//List<Producto> productos = productoDao.consultaPorNombre("Samsung");
		//List<Producto> productos = productoDao.consultaPorNombreDeCategoria("CELULARES");
		//productos.forEach(prod->System.out.println(prod.getDescripcion()));
		BigDecimal precio = productoDao.consultarPrecioporNombreDeproducto("Xiaomi");
		System.out.println(precio);
		
		
		
	}

	private static void registarProducto() {
		Categoria celulares = new Categoria("CELULARES");
		
		Producto celular = new Producto("Xiaomi","Teléfono usado",new BigDecimal("1000"),celulares);
				
		EntityManager em = JPAUtils.getEntityManager();
		ProductoDao productoDao = new ProductoDao(em);
		CategoriaDao categoriaDao = new CategoriaDao(em);
		
		em.getTransaction().begin();
		
		categoriaDao.guardar(celulares);
		productoDao.guardar(celular);
		
		em.getTransaction().commit();
		em.close();
	}
}	
		
		
		//Se utilizó esta parte para explicar los ciclos de vida y las transiciones
		//Categoria celulares = new Categoria("CELULARES");
		//Producto celular = new Producto("Samsung","Teléfono usado",new BigDecimal("1000"),celulares);
		//EntityManager es una interfaz		
		//EntityManager em = JPAUtils.getEntityManager();
		//em.getTransaction().begin();
		//em.persist(celulares);
		//celulares.setNombre("LIBROS");
		//em.getTransaction().commit();
		//em.flush();
		//em.clear();
		//em.close();
		//celulares = em.merge(celulares);
		//celulares.setNombre("SOFTWARES");
		//em.flush();
		//em.clear();
		//celulares = em.merge(celulares);
		//em.remove(celulares);
		//em.flush();

