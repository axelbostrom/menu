package lab6;

import java.util.*;
import java.io.*;


public class Menu implements MenuItem {
    /**
     * Skapar en tom meny med den givna rubriken.
     */
	protected String title;
    List<MenuItem> items;
    public Menu(String title) {
        items = new ArrayList<>();
        this.title = title;
    }
    /**
     * Lägger till ett menyval till menyn.
     */
    public void add(MenuItem item) {
        items.add(item);
    }

    public String getTitle() {
        return title;
    }

    public void execute() throws NullPointerException {
    	int counter = -1;
    	//counter++;
        MenuItem toExecute = null;
        System.out.println(getTitle());
        
        for (int i = 0; i < getTitle().length(); i++) {
        	String n = ("=");
        	System.out.print(n);
        }
        System.out.println("");
        
        for(MenuItem item : items) {
        	counter++;
            if(item.getTitle().equals(this.getTitle())) {
                toExecute = item;
            }
            System.out.println(counter + ": " + item.getTitle());
        }
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        toExecute = items.get(a);
        toExecute.execute();
    }

    public static void main(String [] args) throws NullPointerException {
    	String titel = null;
        String författare = null;
        String regissör = null;
        int längd = 0;
        int pris = 0;
    	Scanner scan = new Scanner(System.in);
 	   Menu mainMenu = new Menu("Main menu");
 	   Menu varuLista = new Menu("Varulista");
 	   Menu nyVara = new Menu("Lägg till vara");

	   //Main menu
        mainMenu.add(new AbstractMenuItem("Avsluta") { //anonymkla​ss
	        public void execute() {
	        	System.exit(1);
	        }
        });
        
        mainMenu.add(new AbstractMenuItem("Varulista") {  //anonymkla​ss
	        public void execute() {
	        	varuLista.execute();
	        }
        });
        
        mainMenu.add(new AbstractMenuItem("Lägg till vara") {  //anonymkla​ss
	        public void execute() {
	            nyVara.execute();
	        }
        });
        
        //Varulista
        varuLista.add(new AbstractMenuItem("Tillbaka") {  //anonymkla​ss
	        public void execute() {
	            mainMenu.execute();
	        }
        });
        
        varuLista.add(new AbstractMenuItem("Böcker") {  //anonymkla​ss
	        public void execute() {
   				System.out.println("");
   				Bok.printBok();
   				System.out.println("");
   				varuLista.execute();
	        }
        });
        
        varuLista.add(new AbstractMenuItem("Filmer") {  //anonymkla​ss
	        public void execute() {
   				System.out.println("");
   				Film.printFilm();
   				System.out.println("");
   				varuLista.execute();
	        }     
        });
        
        //Ny vara
        nyVara.add(new AbstractMenuItem("Tillbaka") {  //anonymkla​ss
	        public void execute() {
	            mainMenu.execute();
	        }
        });
        
        nyVara.add(new AbstractMenuItem("Ny bok") {
	        public void execute() {
	            Bok bok = new Bok(titel, författare, pris);
	            System.out.println(getTitle());
	            for (int i = 0; i < getTitle().length(); i++) {
	            	String n = ("=");
	            	System.out.print(n);
	            }
	            System.out.println("");
	            System.out.print("Titel: ");
            	String titel = scan.next();
	            bok.setTitel(titel);
            	
	            System.out.print("Författare: ");
	            String författare = scan.next();
	            bok.setFörfattare(författare);
	            
	            System.out.print("Pris (kr): ");
	            int pris = scan.nextInt();
	            bok.setPris(pris);
            
            	System.out.println();
            	System.out.println("Fel inmatning. Försök igen.");
            	System.out.println();
	            
	            bok.addBok(bok);
	            nyVara.execute();
	        }
        });
        
        nyVara.add(new AbstractMenuItem("Ny film") {  //anonymkla​ss

        	public void execute() {
                Film film = new Film(titel, regissör, längd, pris);
	            System.out.println(getTitle());
	            for (int i = 0; i < getTitle().length(); i++) {
	            	String n = ("=");
	            	System.out.print(n);
	            }
	            System.out.println("");
	            System.out.print("Titel: ");
	            String titel = scan.next();
	            film.setTitel(titel);
	            
	            System.out.print("Regissör: ");
	            String regissör = scan.next();
	            film.setRegissör(regissör);
	            
	            System.out.print("Längd (minuter): ");
	            int längd = scan.nextInt();
	            film.setLängd(längd);
	            
	            System.out.print("Pris (kr): ");
	            int pris = scan.nextInt();
	            film.setPris(pris);
	            
	            film.addFilm(film);
	            
	            nyVara.execute();
	        }
        });
        mainMenu.execute();
    }
}
