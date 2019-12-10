package lab6;

public class DataObject {
	protected String titel;
	protected int pris;
	
	public DataObject() {
		
	}
	
	public DataObject(String titel, int pris) {
		super();
		this.setTitel(titel);
		this.setPris(pris);
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}
	
	public String getTitel() {
		return titel; 
	}

	public int getPris() {
		return pris;
	}

	public void setPris(int pris) {
		this.pris = pris;
	}

}