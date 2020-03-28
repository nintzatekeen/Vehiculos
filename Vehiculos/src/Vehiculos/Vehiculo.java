package Vehiculos;

public class Vehiculo {

		private String color;
		private byte numeroRuedas;
		private short cilindrada;
		private short potencia;

		public Vehiculo (String col){
			this.color = col;
		}

		public Vehiculo (byte numRuedas){
			this.numeroRuedas = numRuedas;
		}

		public Vehiculo (short cilin) {
			this.cilindrada = cilin;
		}

		public Vehiculo (String col, byte numRuedas) {
			this.color = col;
			this.numeroRuedas = numRuedas; 
		}

		public Vehiculo (String col, byte numRuedas, short cilin) {
			this.color = col;
			this.numeroRuedas = numRuedas;
			this.cilindrada = cilin;
		} 

		public Vehiculo (String col, byte numRuedas, short cilin, short pot){
			this.color = col;
			this.numeroRuedas = numRuedas;
			this.cilindrada = cilin;
			this.potencia = pot;
		}

		public String getColor ( ) {
			return color;
		}
		
		public byte getNumRuedas ( ) {
			return numeroRuedas;
		} 
		
		 public short getCilindrada ( ){
			 return cilindrada;
		 }

		 public short getPotencia ( ) {
			 return potencia;
		 }

		 public void setColor (String col) {
			 this.color = col;
		 } 
		 
		 public void setNumeroRuedas (byte numRuedas) {
			 this.numeroRuedas = numRuedas;
		 } 
		 public void ver() {
			 System.out.println("Color: "+color);
			 System.out.println("Num ruedas: "+numeroRuedas);
		 }
}


