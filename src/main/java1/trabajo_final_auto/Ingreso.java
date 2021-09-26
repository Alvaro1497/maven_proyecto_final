package trabajo_final_auto;

public class Ingreso {
	private String placa;
	private String modelo;
	private String marca;
	private String añoDefabricación;
	private String paísFabricación;
	private String cilindraje;
	private String precio;

	public Ingreso(String pl, String mo, String ma, String af, String pf, String cl, String pr) {
		placa = pl;
		modelo = mo;
		marca = ma;
		añoDefabricación = af;
		paísFabricación = pf;
		cilindraje = cl;
		precio = pr;

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

}
