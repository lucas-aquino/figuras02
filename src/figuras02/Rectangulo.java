package figuras02;

public class Rectangulo {

	private double ancho, alto;

	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public double getPerimetro() {
		return this.alto * 2 + this.ancho * 2;
	}

}
