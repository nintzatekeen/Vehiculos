package Vehiculos;

public class Motocicleta extends Vehiculo{
	
	private byte numeroPlazas;
	

	public Motocicleta (byte numPlazas){
		super(numPlazas);
		super.setNumeroRuedas((byte) 2);
	}
	
	public Motocicleta (String color){
		super(color);
		super.setNumeroRuedas((byte) 2);
	}
	
	public Motocicleta (String color,byte cilin){
		super(color, cilin);
		super.setNumeroRuedas((byte) 2);
	}
	
	public Motocicleta (String color,byte cilin,short poten){
		super(color,cilin,poten);
		super.setNumeroRuedas((byte) 2);
	}
	
	public byte getNumeroPlazas(){
		return numeroPlazas;
	}

	public void setNumeroPlazas(byte num){
		numeroPlazas=num;
	}

	public void verMoto (){
		System.out.println("MOTO:");
		System.out.println("La moto es de color "+getColor());
		System.out.println("Tiene "+getNumRuedas()+" numero de ruedas");
		System.out.println("Con una cilindrada de"+getCilindrada());
		System.out.println("Y una potencia de"+getPotencia());
		System.out.println("Tiene "+numeroPlazas+" numero de plazas");
	}
}
