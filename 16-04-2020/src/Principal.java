

public class Principal {

	public static void main(String[] args) {
	
	   Data d1 = new Data(02,10,2018);
		
       System.out.println (d1);
      
       Estudante e1 = new Estudante(123, "matheus");
       
       e1.setNotas(8, 6, 5);
   
       System.out.println(e1.recuperaDadosParaImpressao());
       System.out.println("Media com pontuação extra: " +( e1.calculaMedia()+e1.calculaMedia1(2)));
       
       System.out.println("\n---------------------------------------------------------------------\n");
       
	   Data d2 = new Data(30,12,2019);
		
       System.out.println (d2);
      
       Estudante e2 = new Estudante(321, "joao");
       
       e2.setNotas(3, 10, 5);
   
       System.out.println(e2.recuperaDadosParaImpressao());
       System.out.println("Media com pontuação extra: " +( e2.calculaMedia()+e2.calculaMedia1(3)));
	}

}
