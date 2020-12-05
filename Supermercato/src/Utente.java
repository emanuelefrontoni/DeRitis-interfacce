import java.util.Scanner;

public class Utente extends Persona{
	public static Scanner input = new Scanner(System.in);
	public double saldo;
	private String nomecognome;
	private String indirizzo;
	
	public Utente(String nomecognome, String indirizzo) {
		super(nomecognome,indirizzo);
	}

	public String GetIndirizzo() {
		return this.indirizzo;
	}

	public void SetIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String GetNome() {
		return this.nomecognome;
	}
	
	public void CreaConto() {
		System.out.print("Inserisci il saldo iniziale : ");
		saldo=input.nextDouble();
		ContoCorrente cc = new ContoCorrente(saldo);
	}
	
}
