package vaje_3;

import java.util.*;

public class Tocka {
	String ime;
	Set<Tocka> sosedi;
	double x,y ;
		
	//static int stevec = 0; 
	//static Graf g;  //stati�ni konstruktor, treba ga je nastaviti zunaj
	//	static {
		//		g = new Graf();
		//		g.dodajTocko();
//	}
	
	public Tocka(String ime) {
		this.ime = ime;  //tukaj je treba this, da lo�imo parameter in 
		sosedi = new HashSet<Tocka>(); // ko ustvarjamo novo mno�ico,objekt napi�emo katero implementacijo tega objekta bi �eleli imeti, npr. HashSet
		// �e ni potrebe this spu��amo
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