package poo1.u1.esqueleto;

public class Matricula {

	private String periodo;
	// El id de la matricula se crea concatenando el id del estudiante con 
	// el periodo de la matricula.
	private String idMatricula;
	private String nombreProgramaAcademico;
	
	/**
	 * Este atributo se manipula a través de los métodos desarrollados
	 */
	private Estudiante matriculado;
	
	/**
	 * Recibe la información del estudiante para incluirlo en la lista 
	 * de matriculados. Debe crear el objeto usando la información recibida.
	 * @param documento
	 * @param tipoDocumento
	 * @param nombre
	 * @param email
	 * @param promedio
	 * @return el id del estudiante. Un número generado de forma aleatoria.
	 */
	public int registrarEstudiante(int documento, String tipoDocumento, 
			String nombre, String email, double promedio) {
		
		
		
		return 0;
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
	public void actualizarEstudiante(String nombre, String email, double promedio) {
		
		
	}
	
	public boolean existeEstudiante(int documento, String tipoDocumento) {
		
		return false;
	}
	
	public boolean existeEstudiante(int idEstudiante) {
		
		return false;
	}
	
	/**
	 * Cambia el estado de la matricula del estudiante. 
	 * El estudiante sigue existiendo como estudiante pero se anula su matrícula.
	 * @param idEstudiante
	 */
	public void retirarEstudiante() {
		
	}
	
	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getNombreProgramaAcademico() {
		return nombreProgramaAcademico;
	}

	public void setNombreProgramaAcademico(String nombreProgramaAcademico) {
		this.nombreProgramaAcademico = nombreProgramaAcademico;
	}
	
	public String getIdMatricula() {
		return idMatricula;
	}
	
	public void setIdMatricula(String idMatricula) {
		this.idMatricula = idMatricula;
	}
	
}
