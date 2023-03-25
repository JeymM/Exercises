package punto2;

public abstract  class Matriculas {
	
	String nombreMateria;
	int idEstudiante;
	
 public Matriculas(String nombreMateria, int idEstudiante) {
		super();
		this.nombreMateria = nombreMateria;
		this.idEstudiante = idEstudiante;
	}

public abstract void ConsultarMaterias(int id);
}
