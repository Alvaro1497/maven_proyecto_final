package trabajo_final_auto;

public class Camioneta {

	private String peso;
	private String placa;
	private String modelo;
	private String marca;
	private String añoDefabricación;
	private String paísFabricación;
	private String cilindraje;
	private String precio;
	private String estado;

	public Camioneta(String t1, String t2, String t3, String t4, String t5, String t6, String t7, String t8) {
		placa = t1;
		modelo = t2;
		marca = t3;
		añoDefabricación = t4;
		paísFabricación = t5;
		cilindraje = t6;
		precio = t7;
		peso = t8;
		estado = "DSIPONIBLE";
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

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Camioneta [peso=" + peso + "]";
	}

}
