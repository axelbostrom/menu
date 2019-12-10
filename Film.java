package lab6;

import java.util.*;

public class Film extends DataObject {
	protected String regissör;
	protected int längd;
	static LinkedList<DataObject> filmer = new LinkedList<DataObject>();
	
	public Film(String titel, String regissör, int längd, int pris) {
		super();
		this.setTitel(titel);
		this.setLängd(längd);
		this.setPris(pris);
		this.setRegissör(regissör);
	}
	
	public int getLängd() {
		return längd;
	}

	public void setLängd(int längd) {
		this.längd = längd;
	}
	public String getRegissör() {
		return regissör;
	}

	public void setRegissör(String regissör) {
		this.regissör = regissör;
	}
	
	public String toString() {
		return "Titel: " + getTitel() + ". " + "\n"
				+ "Regissör: " +  getRegissör() + ". " + "\n"
				+ "Längd: " + getLängd() + " minuter." + "\n"
				+ "Pris: " + getPris() + " kr.";
	}
	
	public void addFilm(Film c) {
		filmer.add(c);
	}

	public static void printFilm() {
		for(DataObject Film : filmer) {
			System.out.println(Film);
			System.out.println();
		}
	}
}
