import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaballeroTest {
	
	@Test
	void unCaballeroQueRecibioSuArmaduraAntesDeLosDoceEsPrecoz() {
		Caballero c = new Caballero();
		c.setEdad(11);
		
		assertTrue(c.esPrecoz());
	}
	
	@Test
	void unCaballeroQueRecibioSuArmaduraDespuesDeLosDoceNoEsPrecoz() {
		Caballero c = new Caballero();
		c.setEdad(13);
		
		assertFalse(c.esPrecoz());
	}
	
	@Test
	void unCaballeroQueRecibioSuArmaduraALosDoceNoEsPrecoz() {
		Caballero c = new Caballero();
		c.setEdad(12);
		
		assertFalse(c.esPrecoz());
	}
	
	@Test
	void unCaballeroQueNoEsPrecozYNoEstaEnLaBandaCelesteNoEsPoderoso() {
		Caballero cab = new Caballero();
		cab.setEdad(13);
		Constelacion cons = new Constelacion();
		cons.setBanda(false);
		cab.setConstelacion(cons);
		
		assertFalse(cab.esPoderoso());
	}
	
	@Test
	void unCaballeroQueNoEsPrecozYEstaEnLaBandaCelesteNoEsPoderoso() {
		Caballero cab = new Caballero();
		cab.setEdad(13);
		Constelacion cons = new Constelacion();
		cons.setBanda(true);
		cab.setConstelacion(cons);
		
		assertFalse(cab.esPoderoso());
	}
	
	@Test
	void unCaballeroQueEsPrecozYNoEstaEnLaBandaCelesteNoEsPoderoso() {
		Caballero cab = new Caballero();
		cab.setEdad(11);
		Constelacion cons = new Constelacion();
		cons.setBanda(false);
		cab.setConstelacion(cons);
		
		assertFalse(cab.esPoderoso());
	}
	
	@Test
	void unCaballeroQueEsPrecozYEstaEnLaBandaCelesteEsPoderoso() {
		Caballero cab = new Caballero();
		cab.setEdad(11);
		Constelacion cons = new Constelacion();
		cons.setBanda(true);
		cab.setConstelacion(cons);
		
		assertTrue(cab.esPoderoso());
	}
}
