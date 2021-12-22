package es.redmetro.dam2.dao;


public interface IHibernate <T> {

	public  void modificar(T Elementos);
	public  T 	consulta (int codigo );
	public 	T   consultasentencia(String consulta);
	public  void alta(T Elementos);
	public  void baja(T Elementos);
}
