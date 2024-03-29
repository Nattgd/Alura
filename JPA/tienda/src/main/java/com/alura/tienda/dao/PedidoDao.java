package com.alura.tienda.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.latam.alura.tienda.modelo.Pedido;

public class PedidoDao {
	
	private EntityManager em;

	public PedidoDao(EntityManager em) {
		this.em = em;
	}
	
	public void guardar(Pedido pedido) {
		this.em.persist(pedido);
	}
	
	public Pedido consultaPorId(Long id) {
		return em.find(Pedido.class, id);
	}

	public List<Pedido> consultarTodos(){
		String jpql = "SELECT P FROM Pedido AS P";
		return em.createQuery(jpql,Pedido.class).getResultList();
	}
	
	public List<Pedido> consultaPorNombre(String nombre){
		String jpql = "SELECT P FROM Pedido AS P WHERE P.nombre=:nombre";
		return em.createQuery(jpql,Pedido.class).setParameter("nombre", nombre).getResultList();
	}
	
	public List<Pedido> consultaPorNombreDeCategoria(String nombre){
		String jpql = "SELECT P FROM Pedido AS P WHERE P.categoria.nombre=:nombre";
		return em.createQuery(jpql,Pedido.class).setParameter("nombre", nombre).getResultList();
	}
	
	public BigDecimal consultarPrecioporNombreDeproducto(String nombre) {
		String jpql = "SELECT P.precio FROM Pedido AS P WHERE P.nombre=:nombre";
		return em.createQuery(jpql,BigDecimal.class).setParameter("nombre",nombre).getSingleResult();
	}
}
