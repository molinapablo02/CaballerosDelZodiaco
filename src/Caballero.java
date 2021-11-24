public class Caballero {
	private String nombre;
	private int edad;
	private int maldad;
	private Constelacion constelacion;
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public void setMaldad(int maldad) {
		this.maldad=maldad;
	}
	
	public void setConstelacion(Constelacion constelacion) {
		this.constelacion=constelacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getMaldad() {
		return maldad;
	}
	
	public Constelacion getConstelacion(){
		return constelacion;
	}
	
	public boolean esPrecoz() {
		return (edad<12);
	}
	
	public boolean esPoderoso() {
		return (this.esPrecoz()&&constelacion.getBanda());
	}

	public boolean esCercanoAlSol() {
		return constelacion.esCercanoAlSol();
	}
	
	
}
