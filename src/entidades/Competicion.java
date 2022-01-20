package entidades;

import java.util.Scanner;

public class Competicion {
	private long id;
	private String nombre;
	private int anio;
	private Prueba[] pruebas;

	public Competicion(long id, String nombre, int anio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.anio = anio;
	}

	public Competicion(long id, String nombre, int anio, Prueba[] pruebas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.anio = anio;
		this.pruebas = pruebas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		String ret = "";
		ret += nombre + " (año " + anio + ")";
		for (Prueba p : this.pruebas) {
			ret += "* " + p + "\n";
		}
		return ret;
	}

	public Prueba[] getPruebas() {
		return pruebas;
	}

	public void setPruebas(Prueba[] pruebas) {
		this.pruebas = pruebas;
	}

}
