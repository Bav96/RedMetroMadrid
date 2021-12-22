package es.redmetro.dam2;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.redmetro.dam2.dao.ICocheraDao;
import es.redmetro.dam2.dao.jdbc.CocheraJdbcDao;
import es.redmetro.dam2.procesos.ProcesoFicheros;
import es.redmetro.dam2.utilidades.UtilidadHibernate;
import es.redmetro.dam2.vo.Cochera;

public class AppRedMetro {
	public static void main(String[] args) {
		ProcesoFicheros procesador = new ProcesoFicheros();

		Session session = UtilidadHibernate.getSession();
		   
		   Cochera cochera = null;
		   
		   // Se inicia una transacción; en esa transacción se realizarán operaciones que actualizan la base de datos
		  Transaction tx = session.beginTransaction();

		   // Creación
		  // cochera = new Cochera();
		   //cochera.setCodigoCochera(50);
		   //cochera.setNombre("Depósito de 4 caminos");
		  // cochera.setDireccion("Bravo Murillo -Cuatro Caminos");
		  // cochera.setDeposito(0);
		   
		 
		  // session.save(cochera);

		   // Se confirma las operaciones de la transacción
		 //  tx.commit();

		/*    
		   
		   // Se inicia una transacción; en esa transacción se realizarán operaciones que actualizan la base de datos
		   tx = session.beginTransaction();

		   // Actualización
		   cochera.setNombre("Depósito de Plaza Castilla");
		   cochera.setDireccion("Bravo Murillo -Plaza Castilla");

		   session.update(cochera);
		   // Se confirma las operaciones de la transacción
		   tx.commit();

		   
		   
		   // Se inicia una transacción; en esa transacción se realizarán operaciones que actualizan la base de datos
		   tx = session.beginTransaction();

		   // Borrado
		   session.delete(cochera);

		   // Se confirma las operaciones de la transacción
		   tx.commit();
		*/
		   // Consulta cochera
		  // int codigoCochera = 11;
		   //cochera = session.get(Cochera.class,codigoCochera);
		   //System.out.println("Nombre Cochera: " + cochera.getDireccion());
		   
		   // Consulta cocheras
		   //List<Cochera> cocheras=null;
		   //cocheras = session.createNativeQuery("SELECT * FROM T_COCHERA", Cochera.class ).list();
		   //System.out.println(cocheras.size());
		   
		   //session.close();
		   //UtilidadHibernate.shutdown();
	}
	}
		
		
			
		
		
		
		
	
		


