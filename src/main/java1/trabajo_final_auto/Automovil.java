package trabajo_final_auto;

public class Automovil {

	private String numPuertas;
	private String placa;
	private String modelo;
	private String marca;
	private String añoDefabricación;
	private String paísFabricación;
	private String cilindraje;
	private String precio;
	private String estado = "Disponible";
	private String prestamo;

	public String getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(String prestamo) {
		this.prestamo = prestamo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAñoDefabricación() {
		return añoDefabricación;
	}

	public void setAñoDefabricación(String añoDefabricación) {
		this.añoDefabricación = añoDefabricación;
	}

	public String getPaísFabricación() {
		return paísFabricación;
	}

	public void setPaísFabricación(String paísFabricación) {
		this.paísFabricación = paísFabricación;
	}

	public String getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(String numPuertas) {
		this.numPuertas = numPuertas;
	}

	@Override
	public String toString() {
		return "Automovil [numPuertas=" + numPuertas + "]";
	}

}
