public class AreaSalumeria implements Area{
	private String nomeArea;
	private int codiceArea;
	private static int ultimaArea=1200;
	public static Salume[] salumi = new Salume[100];
	public Scontrino s = new Scontrino();
	
	public AreaSalumeria(String nomeArea) {
		this.nomeArea=nomeArea;
		this.ultimaArea++;
		this.codiceArea=this.ultimaArea;
	}
	
	public int GetCodiceArea() {
		return this.codiceArea;
	}
	
	public String GetNomeArea() {
		return this.nomeArea;
	}
	
	public void InserisciProdotto(String nomeSalume, double prezzo) {
		Salume s = new Salume();
		double peso=100;
		for(int i=0;i<salumi.length;i++) {
			if(salumi[i]==null) {
				salumi[i]=s;
				salumi[i].SetDescrizione(nomeSalume);
				salumi[i].SetPeso(peso);
				salumi[i].SetPrezzo(prezzo);
				break;
			}
		}
	}
	
	public boolean RimuoviProdotto(String nomeSalume) {
		String estr;
		for(int i=0;i<salumi.length;i++) {
			if(salumi[i].GetDescrizione().equals(nomeSalume)) {
				estr=salumi[i].GetDescrizione();
				System.out.println("Hai rimosso il salume : "+estr);
				salumi[i]=null;
				return true;
			}
		}
		return false;
	}
	
	public void VisualizzaProdotto() {
		for(int i=0;i<salumi.length;i++)
			if(salumi[i]!=null)
				System.out.println("Salume "+(i+1)+": "+salumi[i].GetDescrizione()+" ------ costo : "+salumi[i].GetPrezzo()+"€ al Kg");
	}
	
	public boolean AcquistaOggetto(int posizione) {
		if(salumi[posizione]!=null) {
			s.InserisciLista(salumi[posizione], salumi[posizione].GetPrezzo());
			return true;
		}
		else return false;
	}
}
