package lab6;

public interface MenuItem {    
	
	/**    * Returnerar menyvalets rubrik.    */    
	
	public String getTitle();
	
	/**    * Exekverar/väljer menyvalet.    */    
	
	public void execute();
	
}