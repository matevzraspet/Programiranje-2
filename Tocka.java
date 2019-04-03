package vaje_3;

import java.util.*;

public class Tocka {
	String ime;
	Set<Tocka> sosedi;
	double x,y ;
		
	//static int stevec = 0; 
	//static Graf g;  //statièni konstruktor, treba ga je nastaviti zunaj
	//	static {
		//		g = new Graf();
		//		g.dodajTocko();
//	}
	
	public Tocka(String ime) {
		this.ime = ime;  //tukaj je treba this, da loèimo parameter in 
		sosedi = new HashSet<Tocka>(); // ko ustvarjamo novo množico,objekt napišemo katero implementacijo tega objekta bi želeli imeti, npr. HashSet
		// èe ni potrebe this spušèamo
		x = y = 0;
		// ++stevec;
		
		
	}
	
	public int stopnja() {
		return sosedi.size();
	}
	
	public String  toString() {
		return ime;
	}
}