package es.redmetro.dam2.dao;

import java.util.List;

import es.redmetro.dam2.vo.Cochera;

public interface ICocheraDao {
	public  int crearCochera(Cochera cochera);
	public  int modificarCochera(Cochera cochera);
	public  int borrarCochera(int codigoCochera);
	public  List<Cochera> consultarCocherasContieneTextoDireccion(String texto); // Se puede poner otro nombre; conviene que sea significativo
}
