package trabajo_final_auto;

public class AutosConsulta extends Main {

	private String nombre;
	private String modelo;
	private String marca;
	private String placa;
	private String estado;
	private String cedula;
	
	public AutosConsulta(String n, String m, String m1, String p, String e ,String c) {
		nombre = n;
		modelo = m;
		marca = m1;
		placa = p;
		estado = e;
		cedula = c;

	}
	

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
