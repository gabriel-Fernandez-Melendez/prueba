package entidades;

public class Plata {
	private long id;
	private float pureza; //% pureza

	public Plata(long id, float pureza) {
		super();
		this.id = id;
		this.pureza = pureza;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getPureza() {
		return pureza;
	}

	public void setPureza(float pureza) {
		this.pureza = pureza;
	}

	@Override
	public String toString() {
		return "P" + id + "(" + pureza + "%)";
	}

}
