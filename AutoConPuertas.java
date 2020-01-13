public class AutoConPuertas extends Auto {
	protected int puertas;
	public AutoConPuertas(String marca, String modelo, double precio, int puertas){
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.puertas = puertas;		
	}

	@Override
	public void getDatos() {
		System.out.println("Marca: " +marca+ " // Modelo: " +modelo+ " // Puertas: " + puertas +" // Precio: $" + String.format("%.2f", precio));
	}
	
}
