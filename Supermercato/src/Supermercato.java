import java.util.Scanner;

public class Supermercato {
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		char scelta;
		char continua;
		boolean ok=true;
		Scontrino s = new Scontrino();
		Persona u1 = new Utente("Claudia Di Prinzio","Via Roma 11");
		Persona r1 = new Responsabile("Riccardo De Ritis","Via Fonte Giardino",1301);
		Persona[] utenti = {u1,r1};
		ContoCorrente c1 = new ContoCorrente(5000);
		ContoCorrente c2 = new ContoCorrente(4000);
		ContoCorrente[] conti = {c1,c2};
		Area alimenti = new AreaAlimenti("Area alimenti");
		Area salumi = new AreaSalumeria("Area salumi");
		Area telefoni = new AreaTelefoni("Area telefoni");
		Area computer = new AreaComputer("Area computer");
		alimenti.InserisciProdotto("Panettone", 4.50);
		alimenti.InserisciProdotto("Tonno x6", 3.30);
		alimenti.InserisciProdotto("Philadelphia", 2.20);
		salumi.InserisciProdotto("Prosciutto crudo di Parma", 39);
		salumi.InserisciProdotto("Prosciutto cotto", 20);
		salumi.InserisciProdotto("Ventricina", 24);
		telefoni.InserisciProdotto("Samsung Galaxy S20 128Gb", 829);
		telefoni.InserisciProdotto("Apple Iphone 12 Pro Max 512Gb", 1349);
		telefoni.InserisciProdotto("Huawei P40 Pro 128Gb", 749);
		computer.InserisciProdotto("Asus ROG Zephyrus S17", 3199);
		computer.InserisciProdotto("Dell XPS 15 7590", 2399);
		computer.InserisciProdotto("Apple MacBook Air M1", 1499);
		alimenti.VisualizzaProdotto();
		System.out.println();
		salumi.VisualizzaProdotto();
		System.out.println();
		telefoni.VisualizzaProdotto();
		System.out.println();
		computer.VisualizzaProdotto();
		System.out.println();
		System.out.println("Quali prodotti vuoi acquistare? [a/s/t/c]");
		do {
			scelta=input.next().charAt(0);
			switch(scelta) {
				case 'a':{
					System.out.println("Quale prodotto vuoi acquistare?");
					int scelta1=input.nextInt();
					if(alimenti.AcquistaOggetto(scelta1-1))
						System.out.println("Aggiunto nel carrello!");
					else
						System.out.println("Questo prodotto non esiste");
					System.out.println("Vuoi continure ad acquistare? [s/n]");
					continua=input.next().charAt(0);
					if(continua=='s') ok=true;
					else ok=false;
					break;
				}
				case 's':{
					System.out.println("Quale prodotto vuoi acquistare?");
					int scelta1=input.nextInt();
					if(salumi.AcquistaOggetto(scelta1-1))
						System.out.println("Aggiunto nel carrello!");
					else
						System.out.println("Questo prodotto non esiste");
					System.out.println("Vuoi continure ad acquistare? [s/n]");
					continua=input.next().charAt(0);
					if(continua=='s') ok=true;
					else ok=false;
					break;
				}
				case 't':{
					System.out.println("Quale prodotto vuoi acquistare?");
					int scelta1=input.nextInt();
					if(telefoni.AcquistaOggetto(scelta1-1))
						System.out.println("Aggiunto nel carrello!");
					else
						System.out.println("Questo prodotto non esiste");
					System.out.println("Vuoi continure ad acquistare? [s/n]");
					continua=input.next().charAt(0);
					if(continua=='s') ok=true;
					else ok=false;
					break;
				}
				case 'c':{
					System.out.println("Quale prodotto vuoi acquistare?");
					int scelta1=input.nextInt();
					if(computer.AcquistaOggetto(scelta1-1))
						System.out.println("Aggiunto nel carrello!");
					else
						System.out.println("Questo prodotto non esiste");
					System.out.println("Vuoi continure ad acquistare? [s/n]");
					continua=input.next().charAt(0);
					if(continua=='s') ok=true;
					else ok=false;
					break;
				}
				default:
					System.out.println("Inserisci solo caratteri consentiti");
			}
		}while(ok);
		System.out.println("Lo scontrino è il seguente :");
		s.StampaLista();
		System.out.println("Vuoi acquistare? [s/n]");
		char acquista=input.next().charAt(0);
	}

}
