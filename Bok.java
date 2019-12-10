package lab6;

import java.util.*;

public class Bok extends DataObject {
	protected String författare;
	static LinkedList<DataObject> böcker = new LinkedList<DataObject>();
	
	public Bok(String titel, String författare, int pris) {
		super();
		this.setTitel(titel);
		this.setFörfattare(författare);
		this.setPris(pris);
	}
	
	public String getFörfattare() {
		return författare;
	}

	public void setFörfattare(String författare) {
		this.författare = författare;
	}
	
	public String toString() {
		return "Titel: " + getTitel() + ". " + "\n"
	+ "Författare: " +  getFörfattare() + ". " + "\n"
	+ "Pris: " + getPris() + " kr.";
	}
	
	public void addBok(Bok a) {
		böcker.add(a);
		
	}
	
	public static void printBok() {
		for(DataObject Bok : böcker) {
			System.out.println(Bok);
		}
	}
}
