
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lutador l[] = new Lutador[2];
		
		l[0] = new Lutador("Matheus", "Brazil", 15, 1.67f, 65.5f, 11, 2, 1);
		
		l[1] = new Lutador("Joao", "Gabao", 15, 1.67f, 65.5f, 1, 20, 1);

		l[0].status();
		l[1].status();
		
		l[0].perderLuta();
		l[1].empatarLuta();
		
		Luta lu = new Luta();
		
		lu.marcarLuta(l[0], l[1]);
		lu.lutar();
		l[1].status();
		
		
	}

}
