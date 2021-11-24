public class Constelacion {
	private int distancia;
	private boolean bandaCeleste;
	
	public void setDistancia(int distancia) {
		this.distancia=distancia;
	}
	
	public void setBanda(boolean bandaCeleste) {
		this.bandaCeleste=bandaCeleste;
	}
	
	public boolean esCercanoAlSol() {
		return (distancia<1000000000);
	}
	
	public boolean getBanda() {
		return bandaCeleste;
	}
}
