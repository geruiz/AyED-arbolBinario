package tp03.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 
	
	/**
	 *  Crea un árbol vacío
	 */
	public ArbolBinario() {
	}

	/**
	 * Crea un árbol con un dato.  Si este es nulo, se lo considera vacío.
	 */
	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo == null && !this.esVacio() ? new ArbolBinario<>() : this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho == null && !this.esVacio() ? new ArbolBinario<>() : this.hijoDerecho;
	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}
	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}
	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	public boolean esLleno() {
		return false;
	}

	 boolean esCompleto() {
		return false;
	}
	
	// imprime el árbol en preorden  
	public void printPreorden() {
		
	}

	// imprime el árbol en postorden
	public void printPostorden() {
		
	}

	public void recorridoPorNiveles() {
		
	}

	public ListaGenerica<T> frontera() {
		ListaGenerica<T> l = new ListaEnlazadaGenerica<T>();

		return l;
	}
	
	public int contarHojas() {
		return 0;
	}
}
