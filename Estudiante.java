
public class Estudiante {
	private String nombre;
	private String apellido;
	private String fnacimiento;
	private String dni;
	private String estudios;
	private String tlf;

	public Estudiante() {
		
	}

	public Estudiante(String nombre, String apellido, String fnacimiento, String dni, String estudios, String tlf) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fnacimiento = fnacimiento;
		this.dni = dni;
		this.estudios = estudios;
		this.tlf = tlf;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFnacimiento() {
		return fnacimiento;
	}

	public void setFnacimiento(String fnacimiento) {
		this.fnacimiento = fnacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", fnacimiento=" + fnacimiento + ", dni="
				+ dni + ", estudios=" + estudios + ", tlf=" + tlf + "]";
	}
	
	

}
