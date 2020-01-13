public interface Aplicacion{ 

	public static void main(String arg[]){
			System.out.println(" ");
	//instancio los autos
	
			Auto doscientosseis = new AutoConPuertas("Peugot", "206", 200000.00, 4);
			Auto titan 			= new AutoConCilindrada("Honda","Titan",60000.00,125);
			Auto doscientosocho	= new AutoConPuertas("Puegot", "208", 250000.00, 5);
			Auto ybr 			= new AutoConCilindrada("Yamaha","YBR",80500.50,160);
	
	//pongo los autos en un array
	//NOTA, la consigna aclara que el algoritmo de impresión no debe depender de la cantidad de autos, en este caso si se agrega un auto hay que agregarlo
	//manualmente al array, no lo interpreté en un sentido tan estricto. Me pareció más lindo que instanciar los objetos directamente cuando declaro cada
	//posición del arreglo		
			Auto[] arrayDeAutos = {doscientosseis,titan,doscientosocho,ybr};
	
	//imprimo los datos de los autos usando el método getDatos()
		    for (Auto auto: arrayDeAutos) {
		    	auto.getDatos();
		    }
	
			System.out.println("=============================");
		
		
	// busco el auto más caro e imprimo	
			Auto masCaro = arrayDeAutos[0];
			for (Auto auto : arrayDeAutos) {
		    	if (auto.precio > masCaro.precio){
		      		masCaro = auto;
		      	}
		    }
		    System.out.println("Vehículo más caro: " + masCaro.marca + " " + masCaro.modelo);
		
	//busco el auto más barato e imprimo	
		    Auto masBarato = arrayDeAutos[0];
			for (Auto auto : arrayDeAutos) {
		    	if (auto.precio < masBarato.precio){
		      		masBarato = auto;
		      	}
		    }
		    System.out.println("Vehículo más barato: " + masBarato.marca + " " + masBarato.modelo);
	
	//busco los modelos con la letra 'y' e imprimo	
		   	for (Auto auto : arrayDeAutos) {
		   		if (auto.modelo.contains("Y") || auto.modelo.contains("y")){
		   			System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + auto.marca + " " + auto.modelo + " $" + String.format("%.2f", auto.precio));
		   		}
		   	}
				 
			System.out.println("=============================");
			
	//ordeno el array de autos por precio, de mayor a menor	
		    int n = arrayDeAutos.length; 
		    for (int i = 0; i < n-1; i++){
		        for (int j = 0; j < n-i-1; j++) {
		            if (arrayDeAutos[j].precio < arrayDeAutos[j+1].precio) { 
		                Auto temp = arrayDeAutos[j]; 
		                arrayDeAutos[j] = arrayDeAutos[j+1]; 
		                arrayDeAutos[j+1] = temp; 
		            } 
		        }
		    }
	//imprimo los autos ordenados		
		    System.out.println("Vehículos ordenados por precio de mayor a menor:");
		    for (Auto auto : arrayDeAutos) {
		    	System.out.println(auto.marca + " " + auto.modelo);
	    	}
	
	    	System.out.println(" ");
	
		}
}


