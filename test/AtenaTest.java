import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class AtenaTest {
	
	@Test
	void elPosibleHades() {
		Caballero c1 = new Caballero();
		c1.setMaldad(20);
		Caballero c2 = new Caballero();
		c2.setMaldad(50);
		Caballero c3 = new Caballero();
		c3.setMaldad(10);
		Atena a = new Atena();
		a.viven(c1);
		a.viven(c2);
		a.viven(c3);
		assertEquals(a.posibleHades(), c3);
	}
	
	@Test
	void porcentajeDePrecoces() {
		Caballero c1 = new Caballero();
		c1.setEdad(20);
		Caballero c2 = new Caballero();
		c2.setEdad(7);
		Caballero c3 = new Caballero();
		c3.setEdad(10);
		Caballero c4 = new Caballero();
		c4.setEdad(15);
		Atena a = new Atena();
		a.viven(c1);
		a.viven(c2);
		a.viven(c3);
		a.viven(c4);
		assertEquals(a.porcentajeDePrecoces(), 50);
	}
	
	@Test
	void losMasPoderosos() {
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
		Atena a = new Atena();
		a.viven(c1);
		a.viven(c2);
		a.viven(c3);
		a.viven(c4);
		ArrayList<Caballero> poderosos = new ArrayList<>();
		poderosos.add(c2);
		
		assertEquals(poderosos,a.losMasPoderosos());
	}
	
	
	
}
