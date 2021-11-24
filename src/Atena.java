import java.util.ArrayList;

public class Atena {
	private ArrayList<Caballero>caballeros = new ArrayList<>();
	
	public Caballero posibleHades() {
		//Caballero hades=caballeros.get(0);
		Caballero hades = caballeros.isEmpty()?null:caballeros.get(0);
		for(Caballero c:caballeros) {
			
			if(c.getMaldad()<hades.getMaldad()) {
				hades=c;
      			
			}
		}
		return hades;
	}
	
	public int porcentajeDePrecoces() {
		@SuppressWarnings("unused")
		
		ArrayList<Caballero>precoces=new ArrayList<>();
		int n=0;
		for(Caballero c:caballeros) {
			
			if(c.esPrecoz()) {
				n++;
			}
		}
		return n*100/caballeros.size();
	}
	
	public ArrayList<Caballero>losMasPoderosos(){
		
		ArrayList<Caballero>poderosos=new ArrayList<>();
		for(Caballero c:caballeros) {
			if(c.esPoderoso()) {
				
				poderosos.add(c);
			}
		}
		return poderosos;
	}
	
	public ArrayList<Constelacion>lasMasCercanas(){
		
		ArrayList<Constelacion>cercanas=new ArrayList<>();
		
		for(Caballero c:caballeros) {
			if(c.esCercanoAlSol()) {
				cercanas.add(c.getConstelacion());
			}
		}
		return cercanas;
	}
	
	void viven(Caballero c) {
		caballeros.add(c);
	}
	
	void personas() {
		Caballero c1 = new Caballero();
		c1.setEdad(20);
		Constelacion cons1 = new Constelacion();
		cons1.setBanda(true);
		c1.setConstelacion(cons1);
		Caballero c2 = new Caballero();
		c2.setEdad(11);
		Constelacion cons2 = new Constelacion();
		cons2.setBanda(true);
		c2.setConstelacion(cons2);
		Caballero c3 = new Caballero();
		c3.setEdad(10);
		Constelacion cons3 = new Constelacion();
		cons3.setBanda(false);
		c3.setConstelacion(cons3);
		Caballero c4 = new Caballero();
		c4.setEdad(15);
		Constelacion cons4 = new Constelacion();
		cons4.setBanda(false);
		c4.setConstelacion(cons4);
		caballeros.add(c1);
		caballeros.add(c2);
		caballeros.add(c3);
		caballeros.add(c4);
	}
}
