package trabajo_final_auto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opcion;
		String teclado;
		String teclado2;
		String teclado3;
		String T1, T2, T3, T4, T5, T6, T7;
		int pocicionDisponible = 0;
		Ingreso vector[] = new Ingreso[100];

		do {
			System.out.println("");
			System.out.println("**********RESERVA DE VEHICULOS METROCARD********* ");
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
						System.out.println(
								"Placa: PCT-1434-Modelo: Prius–Marca: Toyota–Año: 2015–Estado: Disponible –Fecha Entrega: null");

					}
					if (teclado.equals("KIA") || teclado.equals("Sportage")) {
						System.out.println(
								"Placa: PRG-0423-Modelo: Sportage–Marca: KIA–Año: 2017 –Estado: Reservado–Fecha Entrega: 12/03/2021");
						System.out.println(
								"Placa: PFQ-0445 -Modelo: Sportage–Marca: KIA–Año: 2019–Estado: Alquilado–Fecha Entrega: 12/05/2021");
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
					teclado = sc.nextLine();

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
					vector[pocicionDisponible] = new Ingreso(T1, T2, T3, T4, T5, T6, T7);
					pocicionDisponible++;

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
}


