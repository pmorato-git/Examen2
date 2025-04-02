package clases;

public class PMP_Circulo {
	private int id;
	private String nombre;
	private double radio;
	private String color;
	
	public PMP_Circulo(){}
	
	public PMP_Circulo(int id, String nombre, double radio, String color) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.radio = radio;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "PMP_Circulo id=" + id + ", nombre=" + nombre + ", radio=" + radio + ", color=" + color + "]";
	}
	
	
	
}
