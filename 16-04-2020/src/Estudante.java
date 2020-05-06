
public class Estudante {

	private int codigo;
	String nome;
	private double notaMat;
	private double notaPort;
	private double notaCien;
	public double extra;
	
	public Estudante(int codigo,String nome){
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public int getCodigo(){
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	
	public void setNotas(double notaMat, double notaPort, double notaCien) {
	
		this.notaMat = notaMat;

		this.notaPort = notaPort;

		this.notaCien = notaCien;
	
	}
	
	public double calculaMedia() {
	double media;
		
		media = (notaMat + notaPort +notaCien)/3;
		
	return media;
	
	}
	
	
	public double calculaMedia1(double extra) {
		return extra;
		
	}
	
	String recuperaDadosParaImpressao() {
		String dados = "Nome: " + this.nome;
		dados += "\nCodigo: " + this.codigo;
		dados += "\nNota matematica: " + this.notaMat;
		dados += "\nNota portugues : " + this.notaPort;
		dados += "\nNota ciencias : " + this.notaCien;
		
		dados += "\nMedia aritmetica: " + this.calculaMedia();
		
		return dados;
	}

}

