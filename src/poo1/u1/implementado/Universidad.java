package poo1.u1.implementado;

public class Universidad {

	private String nombre;
	private Matricula[] matriculados;
	
	public Universidad() {
		matriculados = new Matricula[10];
	}
	
	/**
	 * Recibe la información del estudiante para incluirlo en la lista 
	 * de matriculados. Debe crear el objeto usando la información recibida.
	 * 1) Este método debe validar que no exista otro estudiante con la información 
	 * de documento y tipo documento.
	 * 2) Debe validar que el promedio sea mayor a 3.
	 * @param documento
	 * @param tipoDocumento
	 * @param nombre
	 * @param email
	 * @param promedio
	 * @return el id del estudiante. Un número generado de forma aleatoria.
	 */
	public String registrarEstudiante(int documento, String tipoDocumento, 
			String nombre, String email, double promedio, String periodo, 
			String nombreProgramaAcademico) {
		
		// Lo primero que se hace es buscar que ya exista un estudiante con esa
		// misma información.
		// Se usa una bandera (variable boolean) para establecer el resultado.
		
		boolean existe = false;
		
		// Debe recorrerse todo el arreglo, y no únicamente la primera posición
		for (int i = 0; i < matriculados.length; i++) {
			Matricula matricula = matriculados[i];
			if(matricula!=null) {
				if(matricula.existeEstudiante(documento, tipoDocumento)) {
					existe = true;
					break;
				}
			}
		}
		
		// Variable temporal donde se guardará el id de la matricula
		String idMatricula = "";
		
		// Si no existe, se procede a recorrer el arreglo y encontrar una posición vacía
		// para registrarlo.
		if(!existe) {
			for (int i = 0; i < matriculados.length; i++) {
				Matricula matricula = matriculados[i];
				if(matricula==null) {
					Matricula m = new Matricula();
					m.setPeriodo(periodo);
					m.setNombreProgramaAcademico(nombreProgramaAcademico);
					
					int idEstudiante = m.registrarEstudiante(documento, tipoDocumento, nombreProgramaAcademico, email, promedio);
					idMatricula = idEstudiante + periodo;
					
					m.setIdMatricula(idMatricula);
					
					return m.getIdMatricula();
				}
			}
		}
		
		return "";
	}
	

	/**
	 * Actualiza la información del estudiante. Recibe el identificador
	 * único del estudiante y modifica la información solicitada.
	 * Si la información llega nula, quiere decir que no se solicitó cambio.
	 * @param idEstudiante
	 * @param nombre
	 * @param email
	 * @param promedio
	 */
	public void actualizarEstudiante(int idEstudiante, String nombre, 
			String email, double promedio) {

		// Busca en todas las posiciones hasta encontrar la matricula que 
		// tenga el id de estudiante buscado.
		for (int i = 0; i < matriculados.length; i++) {
			Matricula matricula = matriculados[i];
			if(matricula!=null) {
				if(matricula.existeEstudiante(idEstudiante)) {
					matricula.actualizarEstudiante(nombre, email, promedio);
					break;
				}
			}
		}
		
	}
	
	/**
	 * Cambia el estado de la matricula del estudiante. 
	 * El estudiante sigue existiendo como estudiante pero se anula su matrícula.
	 * El estudiante debe existir para poderle cambiar el estado a retirado.
	 * No se debe ejecutar el retiro si el estudiante ya fue retirado.
	 * @param idEstudiante
	 */
	public void retirarEstudiante(int idEstudiante) {
		// Busca en todas las posiciones hasta encontrar la matricula que 
		// tenga el id de estudiante buscado.
		for (int i = 0; i < matriculados.length; i++) {
			Matricula matricula = matriculados[i];
			if(matricula!=null) {
				if(matricula.existeEstudiante(idEstudiante)) {
					matricula.retirarEstudiante();
					break;
				}
			}
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
