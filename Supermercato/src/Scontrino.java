import java.util.Scanner;

public class Scontrino {
	public static Scanner input = new Scanner(System.in);
	Object[] elementi = new Object[100];
	private static int i=0;
	private static double prezzoTot=0;
	
	public void InserisciLista(Object o, double prezzo) {
		elementi[i]=o;
		i++;
		this.prezzoTot+=prezzo;
	}
	
	public void StampaLista() {
		for(int j=0;j<elementi.length;j++) {
			if(elementi[j]!=null)
				System.out.println((j+1)+" : "+elementi[j]);
		}
		System.out.println("Il prezzo totale è : "+this.prezzoTot);
	}
	
}
