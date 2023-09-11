package poo1.u1.esqueleto;

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

		
		
	}
	
	/**
	 * Cambia el estado de la matricula del estudiante. 
	 * El estudiante sigue existiendo como estudiante pero se anula su matrícula.
	 * El estudiante debe existir para poderle cambiar el estado a retirado.
	 * No se debe ejecutar el retiro si el estudiante ya fue retirado.
	 * @param idEstudiante
	 */
	public void retirarEstudiante(int idEstudiante) {
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
