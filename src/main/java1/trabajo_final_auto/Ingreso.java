package trabajo_final_auto;

public class Ingreso {
	private String placa;
	private String modelo;
	private String marca;
	private String a�oDefabricaci�n;
	private String pa�sFabricaci�n;
	private String cilindraje;
	private String precio;

	public Ingreso(String pl, String mo, String ma, String af, String pf, String cl, String pr) {
		placa = pl;
		modelo = mo;
		marca = ma;
		a�oDefabricaci�n = af;
		pa�sFabricaci�n = pf;
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

	public String getA�oDefabricaci�n() {
		return a�oDefabricaci�n;
	}

	public void setA�oDefabricaci�n(String a�oDefabricaci�n) {
		this.a�oDefabricaci�n = a�oDefabricaci�n;
	}

	public String getPa�sFabricaci�n() {
		return pa�sFabricaci�n;
	}

	public void setPa�sFabricaci�n(String pa�sFabricaci�n) {
		this.pa�sFabricaci�n = pa�sFabricaci�n;
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
