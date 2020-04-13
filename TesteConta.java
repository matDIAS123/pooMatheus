package aula0204;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();

        c1.nome = "Hugo";
        c1.numero = 123;
        c1.agencia = 456789;
        c1.saldo = 50.0;
        c1.data = "04/06/2015";
        
        
        Conta c2 = new Conta();
        
        c2.nome = "Danilo";
        c2.numero = 123;
        c2.agencia = 432424;
        c2.saldo = 100;
        c2.data = "04/06/2015";
        
        

        c1.deposita(100.0);
        System.out.println("saldo atual:" + c1.saldo);
        System.out.println("Rendimento: " + c1.calculaRendimento());
        System.out.println(c1.recuperaDadosParaImpressao()); 
        
        c2.deposita(100.0);
        System.out.println("saldo atual:" + c2.saldo);
        System.out.println("Rendimento: " + c2.calculaRendimento());
        System.out.println(c2.recuperaDadosParaImpressao());
	
	if (c1 == c2) {
        System.out.println("iguais");
    } else {
        System.out.println("diferentes");        
    }
	
	}
}
