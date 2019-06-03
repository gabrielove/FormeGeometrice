package formeG.Display;
import java.util.Scanner;

import formeG.Shapes.Cerc;
import formeG.Shapes.Patrat;
import formeG.Shapes.Triunghi;



public class Menu {

	private Scanner scan = new Scanner(System.in);
	private Scanner scan1 = new Scanner(System.in);

	
	public void DisplayMenu()
	{
	    
	    String alegere;
	    Integer alegereInt;
	   do{

			System.out.println("");
			System.out.println("");
			System.out.println("---------------");
			System.out.println("Meniu Principal");
			System.out.println("---------------");
			System.out.println("Alegeti o forma: ");
			System.out.println("Patrat = 1; Triunghi = 2; Cerc = 3; Inchidere program = 4;");
			alegere = scan.nextLine();
			
			alegereInt = insertNumber(alegere);

    } while(alegereInt < 1 || alegereInt > 4);
	   
		switch(alegereInt) {
		case 1:
			PatratMenu();
			break;
		case 2:
			TriangleMenu();
			break;
		case 3:
			CircleMenu();
			break;
		case 4:
			break;
			default:
				System.out.println("Ati introdus gresit, reintroduceti:");

		}
	}

	public void PatratMenu() {
		
		System.out.println("");
		System.out.println("");
		System.out.println("---------------");
		System.out.println("Ati ales Patrat");
		System.out.println("---------------");
		System.out.println("Introduceti lungimea laturii:");
		String l = scan.nextLine();
		Integer lInt = insertNumber(l);
		
		Patrat patrat = new Patrat(lInt);
		
		System.out.println("S-a creat patratul");
		System.out.println("");
		System.out.println("1. Arie \n2. Perimetru \n3. Scrie in fisier \n4. Intoarce-te la ecranul anterior");
		System.out.println("Introduceti alegerea:");
		String alegere2 = scan.nextLine();
		
		Integer alegereInt = insertNumber(alegere2);
		
		switch(alegereInt) {
		case 1:
			patrat.afisareArie();
			System.out.println("");
			DisplayMenu();
			break;
		case 2:
			patrat.afisarePerimetru();
			System.out.println("");
			DisplayMenu();
			break;
		case 3:
			patrat.WriteToFile();
			System.out.println("S-a scris in fisier");
		case 4:
			DisplayMenu();
			default:{
				System.out.println("Ati introdus gresit");
				alegere2 = scan.nextLine();
			}
		}
	}
		
		public void TriangleMenu() {
			System.out.println("");
			System.out.println("");
			System.out.println("---------------");
			System.out.println("Ati ales Triunghi");
			System.out.println("---------------");
			
			System.out.println("Introduceti lungimea latura 1:");
			String l1Str = scan.nextLine();
			Integer l1 = insertNumber(l1Str);
			System.out.println("Introduceti lungimea latura 2:");
			String l2Str = scan.nextLine();
			Integer l2 = insertNumber(l2Str);
			System.out.println("Introduceti lungimea latura 3:");
			String l3Str = scan.nextLine();
			Integer l3 = insertNumber(l3Str);
		
			Triunghi triunghi = new Triunghi(l1,l2,l3);
			
			System.out.println("S-a creat triunghiul");
			System.out.println("");
			System.out.println("1. Arie \n2. Perimetru \n3. Scrie in fisier \n4. Intoarce-te la ecranul anterior");
			System.out.println("Introduceti alegerea:");
			String alegere2 = scan.nextLine();
			Integer alegereInt = insertNumber(alegere2);
			
			switch(alegereInt) {
			case 1:
				triunghi.afisareArie();
				System.out.println("");
				DisplayMenu();
				break;
			case 2:
				triunghi.afisarePerimetru();
				System.out.println("");
				DisplayMenu();
				break;
			case 3:
				triunghi.WriteToFile();
				System.out.println("S-a scris in fisier");
				DisplayMenu();
			case 4:
				DisplayMenu();
				default:
					System.out.println("Ati introdus gresit");
			}
		}
			
			public void CircleMenu() {
				
				System.out.println("");
				System.out.println("");
				System.out.println("---------------");
				System.out.println("Ati ales Cerc");
				System.out.println("---------------");
				
				System.out.println("Introduceti raza:");
				String r = scan.nextLine();
				Integer rInt = insertNumber(r);
				Cerc cerc = new Cerc(rInt);
				System.out.println("S-a creat cercul");
				scan.nextLine();
				System.out.println("");
				System.out.println("1. Arie \n2. Perimetru \n3. Scrie in fisier \n4. Intoarce-te la ecranul anterior");
				System.out.println("Introduceti alegerea:");
				String alegere2 = scan.nextLine();
				
				Integer alegereInt = insertNumber(alegere2);
				switch(alegereInt) {
				case 1:
					cerc.afisareArie();
					System.out.println("");
					DisplayMenu();
					break;
				case 2:
					cerc.afisarePerimetru();
					System.out.println("");
					DisplayMenu();
					break;
				case 3:
					cerc.WriteToFile();
					System.out.println("S-a scris in fisier");
					DisplayMenu();
				case 4:
					DisplayMenu();
					default:
						System.out.println("Ati introdus gresit");
				}
				
		
	}
	
public Integer insertNumber(String alegere) {
	Integer alegereInt1;
	
	while(true) {
		try {
			alegereInt1 = Integer.parseInt(alegere);
        	break;
		}
        catch(NumberFormatException  e) {
        	System.out.println("Ati introdus gresit, reintroduceti:");
        	alegere = scan.nextLine();
        }
		}
	return alegereInt1;
}

}
	



