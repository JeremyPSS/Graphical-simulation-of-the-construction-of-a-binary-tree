package arbolBinarioGrafico;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import arbolBinario.Arbol;
import arbolBinario.NodoArbol;
import tadCola.Cola;
import tadCola.ColaVacia;
import tadCola.TadCola;

/**
 * Clase Arbol
 * @author Grupo#10
 * @date 27/08/2021
 * @param <T> - Generico
 */
public class ArbolGrafico<T extends Comparable<T>> extends Arbol{
	private String nombre;
	private NodoArbol<T> raiz;
	private boolean siono; 	
	

	public String preOrdenS() {
		String recorrido = "";
		recorrido = preOrdenS(this.getRaiz(),recorrido);
		return recorrido;
	}
	
	private String preOrdenS(NodoArbol<T> arbol, String recorrido) {
		if(arbol!=null) {
			recorrido+=arbol.getClave() + " ";
			recorrido = preOrdenS(arbol.getIz(),recorrido);
			recorrido = preOrdenS(arbol.getDe(),recorrido);
		}
		return recorrido;
	}
	
	public String ordenCentralS() {
		String recorrido = "";
		recorrido = ordenCentralS(this.getRaiz(),recorrido);
		return recorrido;
	}
	private String ordenCentralS(NodoArbol<T> arbol, String recorrido) {
		if(arbol!=null) {			
			recorrido = ordenCentralS(arbol.getIz(),recorrido);
			recorrido+=arbol.getClave() + " ";
			recorrido = ordenCentralS(arbol.getDe(),recorrido);
		}
		return recorrido;
	}
	
	public String postOrdenS() {
		String recorrido = "";
		recorrido = postOrdenS(this.getRaiz(),recorrido);
		return recorrido;
	}
	
	private String postOrdenS(NodoArbol<T> arbol, String recorrido) {
		if(arbol!=null) {			
			recorrido = postOrdenS(arbol.getIz(),recorrido);			
			recorrido = postOrdenS(arbol.getDe(),recorrido);
			recorrido+=arbol.getClave() + " ";
		}
		return recorrido;
	}
	
	public String listarAmplitudS() {
		String recorrido="";
		try {
			recorrido = listarAmplitudS(this.getRaiz(),recorrido);
		} catch (ColaVacia e) {

		}
		
		
		return recorrido;
	}
	
	private String listarAmplitudS(NodoArbol<T> arbol, String recorrido) throws ColaVacia {
		NodoArbol<T> p;
		Cola<NodoArbol<T>> cola = new TadCola<>();
		
		p = arbol;
		if(p != null)
			cola.encolar(p);
		while(!cola.colaVacia()) {
			p = cola.desencolar();
			recorrido += (p.getClave() + " ");
			if(p.getIz() != null)
				cola.encolar(p.getIz());
			if(p.getDe() != null)
				cola.encolar(p.getDe());
		}
		return recorrido;
	}

	/**
	 * Metodo encargado de insertar los datos izquierdos de la raiz
	 * preguntando cada vez que topa un nodo hijo
	 * Ingresa cuando se topa con un nodo hoja
	 * @param dato - valor que contendra el nodo
	 */
	public void insertarIZQ(T dato) {
		this.setRaiz(insertarIZQ(this.getRaiz(), dato));
	}
	private NodoArbol<T> insertarIZQ(NodoArbol<T> arbol, T dato) {
		NodoArbol<T> resul = arbol;
		if(arbol != null) {

			try {
				String[] botones = {"Izquierdo","Derecho"};
				int lado = 0;
				lado = JOptionPane.showOptionDialog(null, "Elije el lado de: " + arbol.getClave(), "Arbol binario", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);

				if(lado==0) {
					arbol.setIz(insertarIZQ(arbol.getIz(), dato));
					
				}else 
					if(lado==1) {
						arbol.setDe(insertarIZQ(arbol.getDe(), dato));
						
					}else
						JOptionPane.showMessageDialog(null, "Ha ocurrido un error en la seleccion");

			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}


		}else
			resul = new NodoArbol<>(dato);
		return resul;
	}
	
	/**
	 * Metodo encargado de insertar los datos derechos de la raiz
	 * preguntando cada vez que topa un nodo hijo
	 * Ingresa cuando se topa con un nodo hoja
	 * @param dato - valor que contendra el nodo
	 */
	public void insertarDERE(T dato) {
		this.setRaiz(insertarDERE(this.getRaiz(), dato));
	}
	private NodoArbol<T> insertarDERE(NodoArbol<T> arbol, T dato) {
		NodoArbol<T> resul = arbol;
		if(arbol != null) { 

			try {

				String[] botones = {"Izquierdo","Derecho"};
				int lado = 0;
				lado = JOptionPane.showOptionDialog(null, "Elije el lado de: " + arbol.getClave(), "Arbol binario", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);

				if(lado==0) {
					arbol.setIz(insertarDERE(arbol.getIz(), dato));
					
				}else 
					if(lado==1) {
						arbol.setDe(insertarDERE(arbol.getDe(), dato));
						
					}else
						JOptionPane.showMessageDialog(null, "Ha ocurrido un error en la seleccion");

			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}


		}else
			resul = new NodoArbol<>(dato);
		return resul;
	}
	

	
	public void eliminarM(T dato) {
		siono = true;
		this.setRaiz((new EliminarM()).borrarNodo(this.getRaiz(), dato));
		if(siono==false)
			JOptionPane.showMessageDialog(null, "Dato no encontrado");
		
	}
	
	
	class EliminarM{
		boolean encontrado = false;
		
		NodoArbol<T> borrarNodo(NodoArbol<T> arbol, T dato) {
			NodoArbol<T> p, aux;
			
			if(arbol != null)
				if(arbol.getClave().compareTo(dato) == 0) {
					encontrado = true;
					p = arbol;
					if(arbol.getIz() == null)
						arbol = arbol.getDe();
					else
						if(arbol.getDe() == null)
							arbol = arbol.getIz();
						else
							arbol.setIz(eliminar2HijosM(arbol.getIz(), p));
				}
				else {
					aux = borrarNodo(arbol.getIz(), dato);
					if(encontrado) {
						arbol.setIz(aux);
					}else {
						aux = borrarNodo(arbol.getDe(), dato);
						if(encontrado)
							arbol.setDe(aux);
					}
				}
			
			
			if(encontrado==false)
				siono = false;
			if(encontrado==true)
				siono=true;
			return arbol;
		}
		
		NodoArbol<T> eliminar2HijosM(NodoArbol<T> arbol, NodoArbol<T> p) {
			NodoArbol<T> resul;
			
			if(arbol.getDe() != null) {
				resul = arbol;
				arbol.setDe(eliminar2HijosM(arbol.getDe(), p));
			}
			else {
				p.setClave(arbol.getClave());
				resul = arbol.getIz();
			}		
			return resul;
		}
	}

	
	/**
	 * Metodo que retorna por caracteres la informacion del arbol
	 * @return resul <- informacion del arbol
	 */
	public String Informacion(){
		String resul="";
		resul = "Información del árbol: " + super.getNombre() +
				"\nAltura: " + super.altura() +
				"\nNúmero de nodos: " +super.numeroDeNodos() +
				"\nNúmero de hojas: " + super.numeroDeHojas()+
				"\nArbol está completo?: " +(super.esCompleto()?"SI":"NO") +
				"\nDato menor: " +super.menor() +
				"\nDato mayor: " +super.mayor()+
				"\n------RECORRIDOS--------"+
				"\nPreOrder: "+ preOrdenS()+
				"\nInOrder: "+ ordenCentralS()+
				"\nPostOrder: "+ postOrdenS()+
				"\nAmplitud: "+ listarAmplitudS();
		return resul;
	}
	
	public JPanel getdibujo() {
        return new ArbolExpresionGrafico(this);
    }
}







