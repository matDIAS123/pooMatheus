package aula0204;



public class Conta {


String nome;
int numero;
int agencia;
double saldo;
String data;


	void saca(double valor) {
	//saca que recebe um valor como 
	//parâmetro e retira esse valor do saldo da conta	
		
		if(this.saldo < valor) {
			
		System.out.println("SALDO INSUFICIENTE");
		
		}else {
			this.saldo = this.saldo - valor;
		}
		
	}
	void deposita(double valor) {

	//deposita que recebe um valor 
	//como parâmetro e adiciona esse valor ao saldo da conta
		
		this.saldo += valor;
	}
	double calculaRendimento() {
	//calculaRendimento que não recebe parâmetro algum e devolve o 
	//valor do saldo multiplicado por 0.1
		
		this.saldo = this.saldo * 0.1;	
		return this.saldo;
	}
	String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.nome;
		dados += "Numero: " + this.numero;
		dados += "Agencia: " + this.agencia;
		dados += "Saldo : " + this.saldo;
		dados += "Data : " + this.data;
		
		
		return dados;
	}
}
