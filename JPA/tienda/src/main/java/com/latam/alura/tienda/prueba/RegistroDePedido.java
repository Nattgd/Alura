package com.latam.alura.tienda.prueba;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.alura.tienda.dao.CategoriaDao;
import com.alura.tienda.dao.ClienteDao;
import com.alura.tienda.dao.PedidoDao;
import com.alura.tienda.dao.ProductoDao;
import com.latam.alura.tienda.modelo.Categoria;
import com.latam.alura.tienda.modelo.Cliente;
import com.latam.alura.tienda.modelo.ItemsPedido;
import com.latam.alura.tienda.modelo.Pedido;
import com.latam.alura.tienda.modelo.Producto;
import com.latam.alura.tienda.utils.JPAUtils;

public class RegistroDePedido {

	public static void main(String[] args) {
		
		registarProducto();
		
		EntityManager em = JPAUtils.getEntityManager();
		
		ProductoDao productoDao = new ProductoDao(em);
		Producto producto =	productoDao.consultaPorId(1l);
		
		ClienteDao clienteDao = new ClienteDao(em);
		PedidoDao pedidoDao = new PedidoDao(em);
		
		Cliente cliente = new Cliente("Juan","112233");
		Pedido pedido = new Pedido(cliente);
		pedido.agregarItems(new ItemsPedido(5,producto,pedido));
		
		em.getTransaction().begin();
		clienteDao.guardar(cliente);
		pedidoDao.guardar(pedido);
		em.getTransaction().commit();
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

