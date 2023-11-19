package programaCirculo;

/**
 * clase circulo
 * @author Mayra
 */

public class Circulo {
	
	private double area;
	private double perimetro;
	private double radio;
	
	final private double pi=3.14;
	
	/**
	 * 
	 * constructora
	 * @param radio
	 */
	
	public Circulo ( double radio) {
		this.radio= radio;
		this.perimetro = 0;
		this.area =0;
		
	}
	/**
	 * Este metodo retorna el area
	 * @return
	 */
	
	public double getArea () {
		return this.area;
		
	}
	
	/**
	 * Metodo que terona el perimetro
	 * @return
	 */
	
	public double getPerimetro () {
		return this.perimetro;
	}
	
	/**
	 * Metodo que calcula el area
	 */
	
	public void CalcularArea () {
		 this.area = this.pi*(this.radio*this.radio);
	}
	
	/**
	 * Metodo que calcula perimetro
	 */
	
	public void calcularPerimetro () {
		this.perimetro = 2*this.pi*this.radio;
	}

	

}
