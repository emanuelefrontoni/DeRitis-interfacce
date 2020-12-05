public class ContoCorrente {
	private double saldo;
	private int numero;
	private static int NumeroIniziale=1000;
	
	public ContoCorrente(double Saldo) {
		this.saldo=Saldo;
		NumeroIniziale++;
		numero=NumeroIniziale;
	}
	
	public void Versa(double saldo) {
		this.saldo+=saldo;
	}
	
	public boolean Preleva(double saldo) {
		if(this.saldo>saldo) {
			this.saldo-=saldo;
			return true;
		} else return false;
	}
	
	public double OttieniSaldo() {
		return this.saldo;
	}
	
	public int OttieniNumero() {
		return this.numero;
	}
}
