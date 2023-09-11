package poo1.u1.implementado;

public class Matricula {

	private String periodo;
	// El id de la matricula se crea concatenando el id del estudiante con 
	// el periodo de la matricula.
	private String idMatricula;
	private String nombreProgramaAcademico;
	
	/**
	 * Este atributo se manipula a trav�s de los m�todos desarrollados
	 */
	private Estudiante matriculado;
	
	/**
	 * Recibe la informaci�n del estudiante para incluirlo en la lista 
	 * de matriculados. Debe crear el objeto usando la informaci�n recibida.
	 * @param documento
	 * @param tipoDocumento
	 * @param nombre
	 * @param email
	 * @param promedio
	 * @return el id del estudiante. Un n�mero generado de forma aleatoria.
	 */
	public int registrarEstudiante(int documento, String tipoDocumento, 
			String nombre, String email, double promedio) {
		
		// Se asigna la informacion de la matricula
		// Esto tambi�n puede hacerse con invocaciones a los m�todos get y set.
		// this.setNombreProgramaAcademico(nombreProgramaAcademico);
		// this.setPeriodo(periodo);
		
		// Instancio la clase Estudiante para poder registrarle la informaci�n.		
		matriculado = new Estudiante();
		
		// Tambien se podr�a inicializar as� al estudiante, y luego asignado a la variable matriculado
		// Estudiante e = new Estudiante();
		// matriculado = e;
		
		matriculado.setDocumento(documento);
		matriculado.setTipoDocumento(tipoDocumento);
		matriculado.setEmail(email);
		matriculado.setNombre(nombre);
		matriculado.setPromedio(promedio);
		
		// Al realizar la matricula se sobreentiende que se est� matriculando al estudiante
		// y por tanto, el estado deber�a colocarse a true.
		matriculado.setMatriculado(true);
		
		// Creo un n�mero aleatorio (Math.random()) entre 0 y 0,9. Ese valor
		// lo multiplico por 1000 y lo convierto a entero. 
		matriculado.setIdEstudiante((int)Math.random()*1000);
		
		return matriculado.getIdEstudiante();
	}
	

	/**
	 * Actualiza la informaci�n del estudiante. Recibe el identificador
	 * �nico del estudiante y modifica la informaci�n solicitada.
	 * Si la informaci�n llega nula, quiere decir que no se solicit� cambio.
	 * @param idEstudiante
	 * @param nombre
	 * @param email
	 * @param promedio
	 */
	public void actualizarEstudiante(String nombre, String email, double promedio) {
		
		if(matriculado!=null) {
			if(!nombre.isEmpty())
				matriculado.setNombre(nombre);
			if(!email.isEmpty())
				matriculado.setEmail(email);
			if(promedio>0)
				matriculado.setPromedio(promedio);
		}
	}
	
	public boolean existeEstudiante(int documento, String tipoDocumento) {
		
		boolean existe = matriculado.getDocumento()==documento && matriculado.getTipoDocumento().equals(tipoDocumento); 
		
		return existe;
	}
	
	public boolean existeEstudiante(int idEstudiante) {
		
		boolean existe = matriculado.getIdEstudiante()==idEstudiante; 
		
		return existe;
	}
	
	/**
	 * Cambia el estado de la matricula del estudiante. 
	 * El estudiante sigue existiendo como estudiante pero se anula su matr�cula.
	 * @param idEstudiante
	 */
	public void retirarEstudiante() {
		matriculado.setMatriculado(false);
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
