package dao;

import java.util.List;


public interface CentroDAO<Centro> {
	
	List<Centro> getCentros();
	Centro getCentros(int codCentro);
	int eliminarCentro(int codCentro);
}
