public class AutoConCilindrada extends Auto {
	protected int cilindrada;
	public AutoConCilindrada(String marca, String modelo, double precio, int cilindrada){
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.cilindrada = cilindrada;	
	}

	@Override
	public void getDatos() {
		System.out.println("Marca: " +marca+ " // Modelo: " +modelo+ " // Cilindrada: " + cilindrada +"c // Precio: $" + String.format("%.2f", precio));
	}

}