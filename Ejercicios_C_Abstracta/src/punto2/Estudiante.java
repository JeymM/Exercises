package punto2;

public class Estudiante  extends Matriculas{

		
	public Estudiante(String nombreMateria, int idEstudiante) {
		super(nombreMateria, idEstudiante);
		
	}

	@Override
	public void ConsultarMaterias(int id) {
		if(id==this.idEstudiante) {
			System.out.println("El estudiante esta matriculado en: "+this.nombreMateria);
		}else {
			String m=null;
			System.out.println(m);
		}
		
	}
	
	

}
