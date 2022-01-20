package entidades;

public class Oro {
	private long id;
	private float pureza; // % pureza

	public Oro(long id, float pureza) {
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
		return "O" + id + "(" + pureza + "%)";
	}


}
