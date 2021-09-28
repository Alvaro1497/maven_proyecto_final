package trabajo_final_auto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner KD = new Scanner(System.in);

		String opcion;
		String teclado;
		String teclado2;
		String teclado3;
		String tecladoc4;
		String tecladoc5;
		String T1, T2, T3, T4, T5, T6, T7, T8, T9;
		String D1, D2, D3;
		String estado;
		String placAu = null;
		String placCa = null;

		LocalDate fechaCt;
		LocalDate fechanueva;

		LocalDate diaHoy = LocalDate.ofYearDay(2021, 11);
		LocalDate diafin = diaHoy.plusDays(2);

		LocalDate diaHoy1 = LocalDate.ofYearDay(2021, 9);
		LocalDate diafin1 = diaHoy1.plusDays(2);

		LocalDate diaHoy2 = LocalDate.ofYearDay(2021, 8);
		LocalDate diafin2 = diaHoy2.plusDays(2);

		AutoConsulta autoc = new AutoConsulta();
		autoc.setPlaca("PRG-0423");
		autoc.setMarca("Kia");
		autoc.setModelo("Sportage");
		autoc.setFechaInicio(diaHoy);
		autoc.setEstado(true);
		autoc.setFecha("2020");

		AutoConsulta autoc1 = new AutoConsulta();
		autoc1.setPlaca("PCT-1434");
		autoc1.setMarca("Toyota");
		autoc1.setModelo("Prius");
		autoc1.setFechaInicio(diaHoy1);
		autoc1.setEstado(true);
		autoc1.setFecha("2019");

		AutoConsulta autoc2 = new AutoConsulta();
		autoc2.setPlaca("PFQ-0445");
		autoc2.setMarca("Kia");
		autoc2.setModelo("Sportage");
		autoc2.setFechaInicio(diaHoy2);
		autoc2.setEstado(true);
		autoc2.setFecha("2018");

		Automovil au = new Automovil();
		Camioneta ca = new Camioneta();

		do {
			System.out.println("");
			System.out.println("********** RESERVA DE VEHICULOS METROCARD ********* ");
			System.out.println("Escoja opcion: ");
			System.out.println("1) Clientes: ");
			System.out.println("2) Empleados: ");
			System.out.println("3) SALIR: ");
			opcion = sc.nextLine();

			switch (opcion) {
			case "1":
				System.out.println(" A) Consultar autos");
				System.out.println(" B) Reservar auto");
				opcion = sc.nextLine();

				if (opcion.equals("A")) {
					System.out.println("ingrese el Modelo y/o marca del Auto");
					teclado = sc.nextLine();

					if (teclado.equals("Toyota") || teclado.equals("Prius")) {
						System.out.println("Placa = " + autoc1.getPlaca() + "- Modelo - " + autoc1.getModelo()
								+ " -Marca- " + autoc1.getMarca() + " -Año- " + autoc1.getFecha() + "-Fecha Entrega- "
								+ autoc1.getFechaInicio().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
								+ " -Estado -" + autoc1.estado);

					}
					if (teclado.equals("KIA") || teclado.equals("Sportage")) {
						System.out.println("Placa = " + autoc.getPlaca() + "- Modelo - " + autoc.getModelo()
								+ " -Marca- " + autoc.getMarca() + " -Año- " + autoc.getFecha() + " -Fecha Entrega- "
								+ autoc.getFechaInicio().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
								+ " -Estado -" + autoc.estado);

						System.out.println("Placa = " + autoc2.getPlaca() + "- Modelo - " + autoc2.getModelo()
								+ " -Marca- " + autoc2.getMarca() + " -Año- " + autoc2.getFecha() + "-Fecha Entrega- "
								+ autoc2.getFechaInicio().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
								+ " -Estado -" + autoc2.estado);

					}
					if (!(teclado.equals("KIA") || teclado.equals("Sportage") || teclado.equals("Toyota")
							|| teclado.equals("Prius"))) {
						System.out.println("NO SE ENCONTRO MARCA O MODELO DE AUTO");

					}
				}
				if (opcion.equals("B")) {
					System.out.println("Ingrese la placa del auto que desea reservar");
					teclado2 = sc.nextLine();
					System.out.println("Ingrese su cedula");
					tecladoc4 = sc.nextLine();

					if (teclado2.equals(autoc1.getPlaca())) {
						if (autoc1.getEstado()) {
							System.out.println("Retire el automovil en el patio ");
							autoc1.setCedula(tecladoc4);
							autoc1.setFechafin(diafin1);
							autoc1.setEstado(false);

						} else {
							System.out.println("No estara disponible hasta el: " + autoc1.getFechafin());
						}

					}
					if (teclado2.equals(autoc.getPlaca())) {
						if (autoc.getEstado()) {
							System.out.println("Retire el automovil en el patio");
							autoc.setCedula(tecladoc4);
							autoc.setFechafin(diafin);
							autoc.setEstado(false);

						} else {
							System.out.println("No estara disponible hasta el: " + autoc.getFechafin());
						}

					}
					if (teclado2.equals(autoc2.getPlaca())) {
						if (autoc2.getEstado()) {
							System.out.println("Retire el automovil en el patio");
							autoc2.setCedula(tecladoc4);
							autoc2.setFechafin(diafin2);
							autoc2.setEstado(false);

						} else {
							System.out.println("No estara disponible hasta el: " + autoc2.getFechafin());
						}

					}
					if (!(teclado2.equals(autoc1.getPlaca())
							|| (teclado2.equals(autoc.getPlaca()) || teclado2.equals(autoc2.getPlaca())))) {
						System.out.println("NO SE ENCONTRO LA PLACA");

					}

				}

				break;

			case "2":
				System.out.println(" A) Ingresar un auto");
				System.out.println(" B) Alquilar un auto");
				System.out.println(" C) Aplazar fecha de entrega");
				teclado3 = sc.nextLine();
				if (teclado3.equals("A")) {
					System.out.println(" Ingrese la siguiente informacion informacion ");
					System.out.println("Ingrese la Placa");
					T1 = sc.nextLine();
					System.out.println("ingrese Modelo");
					T2 = sc.nextLine();
					System.out.println("ingrese Marca");
					T3 = sc.nextLine();
					System.out.println("Ingrese año de fabricacion");
					T4 = sc.nextLine();
					System.out.println("Ingrese País fabricación");
					T5 = sc.nextLine();
					System.out.println("ingrese Cilindrage");
					T6 = sc.nextLine();
					System.out.println("Ingrese Avalúo ");
					T7 = sc.nextLine();

					System.out.println(" *** QUE TIPO DE AUTO ES: 1)Automovil - 2)Camioneta *** ");
					tecladoc5 = sc.nextLine();
					switch (tecladoc5) {
					case "1":
						System.out.println("Ingrese numero de puertas");
						T8 = sc.nextLine();
						au.setPlaca(T1);
						au.setMarca(T2);
						au.setModelo(T3);
						au.setAñoDefabricación(T4);
						au.setPaísFabricación(T5);
						au.setCilindraje(T6);
						au.setPrecio(T7);
						au.setNumPuertas(T8);

						placAu = au.getPlaca();
						System.out.println("Guardado con Exito");
						break;

					case "2":
						System.out.println("Peso soportado ");
						T9 = sc.nextLine();
						ca.setPlaca(T1);
						ca.setMarca(T2);
						ca.setModelo(T3);
						ca.setAñoDefabricación(T4);
						ca.setAñoDefabricación(T5);
						ca.setCilindraje(T6);
						ca.setPrecio(T7);
						ca.setPeso(T9);
						placCa = ca.getPlaca();
						System.out.println("Guardado con Exito");
						break;

					}

				}
				if (teclado3.equals("B")) {
					System.out.println("iNGRESE PLACA DEL AUTOMOVIL");
					D1 = sc.nextLine();
					// ingreso aqui la placa lo comparara con la placa quemada y me mostrara si esta
					// diponible o no
					if (placa1(autoc.getPlaca(), D1)) {
						if (autoc.getEstado() == true) {
							estado = "disponible";
						} else {
							estado = "reservado";
						}
						System.out.println("Placa: " + autoc.getPlaca() + " Modelo: " + autoc.getModelo() + " Estado: "
								+ estado + " Fecha Entrega: "
								+ autoc.getFechaInicio().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
								+ " Reservado por: " + autoc.getCedula());
					} else if (placa2(autoc1.getPlaca(), D1)) {
						if (autoc1.getEstado() == true) {
							estado = "disponible";
						} else {
							estado = "reservado";
						}
						System.out.println("Placa: " + autoc1.getPlaca() + " Modelo: " + autoc1.getModelo()
								+ " Estado: " + estado + " Fecha Entrega: "
								+ autoc1.getFechaInicio().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
								+ " Reservado por: " + autoc1.getCedula());

					} else if (placa3(autoc2.getPlaca(), D1)) {
						if (autoc2.getEstado() == true) {
							estado = "disponible";
						} else {
							estado = "reservado";
						}
						System.out.println("Placa: " + autoc2.getPlaca() + " Modelo: " + autoc2.getModelo()
								+ " Estado: " + estado + " Fecha Entrega: "
								+ autoc2.getFechaInicio().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
								+ " Reservado por: " + autoc2.getCedula());
					} else {
						System.out.println("No se encontro la placa en la base de datos reservada .... ");
						System.out.println(" ---------------------------------------------------------- ");
						System.out.println("Buscando placa en los registros actuales");
						if (D1 == placAu) {
							System.out.println(" Desea alquilar el vehiculo ? (SI / NO) ");
							String cont = KD.nextLine();
							if (cont.equals("si")) {
								System.out.println("Automovil alquilado con exito");
								// cambiamos estado
								au.setEstado("Alquilado");

							}
							System.out.println("Placa: " + au.getPlaca() + " Modelo: " + au.getModelo() + " Estado: "
									+ au.getEstado() + " año fabricacion: " + au.getAñoDefabricación()
									+ " País Fabricación" + au.getPaísFabricación() + " Cilindraje "
									+ au.getCilindraje() + " Precio " + au.getPrecio());
						}

					}

				}
				if (teclado3.equals("C")) {
					System.out.println("iNGRESE PLACA DEL AUTOMOVIL");
					D2 = sc.nextLine();
					if (placa1(autoc.getPlaca(), D2)) {
						System.out.println("Placa: " + autoc.getPlaca() + " Modelo: " + autoc.getModelo() + " Estado: "
								+ autoc.getEstado() + " Fecha Entrega: "
								+ autoc.getFechaInicio().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
								+ " Reservado por: " + autoc.getCedula());
						System.out.println(" Desea aplzar tiepo de entrega? (SI/NO) ");
						D3 = sc.nextLine();
						if (D3.equals("si")) {
							fechaCt = autoc.getFechaInicio();
							fechanueva = fechaCt.plusDays(3);
							autoc.setFechaInicio(fechanueva);
							System.out.println("Placa: " + autoc.getPlaca() + " Modelo: " + autoc.getModelo()
									+ " Estado: " + autoc.getEstado() + " Fecha Entrega: "
									+ autoc.getFechaInicio().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
									+ " Reservado por: " + autoc.getCedula());
						} else {
							System.out.println("La fecha no se Aplaza");
						}
					} else if (placa2(autoc1.getPlaca(), D2)) {
						System.out.println("Placa: " + autoc1.getPlaca() + " Modelo: " + autoc1.getModelo()
								+ " Estado: " + autoc1.getEstado() + " Fecha Entrega: "
								+ autoc1.getFechaInicio().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
								+ " Reservado por: " + autoc1.getCedula());
						System.out.println(" Desea aplzar tiepo de entrega? (SI/NO) ");
						D3 = sc.nextLine();
						if (D3.equals("si")) {
							fechaCt = autoc1.getFechaInicio();
							fechanueva = fechaCt.plusDays(3);
							autoc1.setFechaInicio(fechanueva);
							System.out.println("Placa: " + autoc1.getPlaca() + " Modelo: " + autoc1.getModelo()
									+ " Estado: " + autoc1.getEstado() + " Fecha Entrega: "
									+ autoc1.getFechaInicio().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
									+ " Reservado por: " + autoc1.getCedula());
						} else {
							System.out.println("La fecha no se Aplaza");
						}

					} else if (placa3(autoc2.getPlaca(), D2)) {
						System.out.println("Placa: " + autoc2.getPlaca() + " Modelo: " + autoc2.getModelo()
								+ " Estado: " + autoc2.getEstado() + " Fecha Entrega: "
								+ autoc2.getFechaInicio().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
								+ " Reservado por: " + autoc2.getCedula());
						System.out.println(" Desea aplzar tiepo de entrega? (SI/NO) ");
						D3 = sc.nextLine();
						if (D3.equals("si")) {
							fechaCt = autoc2.getFechaInicio();
							fechanueva = fechaCt.plusDays(3);
							autoc2.setFechaInicio(fechanueva);
							System.out.println("Placa: " + autoc2.getPlaca() + " Modelo: " + autoc2.getModelo()
									+ " Estado: " + autoc2.getEstado() + " Fecha Entrega: "
									+ autoc2.getFechaInicio().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
									+ " Reservado por: " + autoc2.getCedula());
						} else {
							System.out.println("La fecha no se Aplaza");
						}
					}

				}

				break;
			case "3":
				System.out.println("Salir");
				break;
			default:
				System.out.println("No ha elegido ninguna opcion valida");
				break;

			}

		} while (!opcion.equals("3"));
		System.out.println("Gracias por preferirnos");

	}

	// METODOS PARA COMPROVAR SI EXISTE UN VALOR DENTRO DE TODO UN ARREGLO//
	private static boolean placa1(String string, String buscarplaca1) {
		return Arrays.asList(string).contains(buscarplaca1);
	}

	private static boolean placa2(String string, String buscarplaca2) {
		return Arrays.asList(string).contains(buscarplaca2);
	}

	private static boolean placa3(String string, String buscarplaca3) {
		return Arrays.asList(string).contains(buscarplaca3);
	}

}
