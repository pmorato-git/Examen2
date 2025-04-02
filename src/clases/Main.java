package clases;

public class Main {

	public static void main(String[] args) {
		PMP_Circulo circulo1 =new PMP_Circulo(1, "circulo 1", 3, "naranja");
		PMP_Rectangulo rectangulo1 = new PMP_Rectangulo(1, "rect", 3, 5, "amarillo");
		
		// Calcula area circulo pi * r * r
		double radio = circulo1.getRadio();
		double areaCirculo = 3.14159265 * radio * radio;
		
		// Calcular area rectangulo lado * lado
		double ladoA = rectangulo1.getLadoA();
		double ladoB = rectangulo1.getLadoB();
		double areaRectangulo = ladoA * ladoB;
		
		// Imprimir resultados
		System.out.println(circulo1);
		System.out.println(rectangulo1);
		System.out.println("Area circulo: "+areaCirculo);
		System.out.println("Area rectangulo: "+areaRectangulo);

	}

}
