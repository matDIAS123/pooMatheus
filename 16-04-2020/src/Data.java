
public class Data {

	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
	     this.mes = mes;
	     this.ano = ano;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public boolean setData(int dia, int mes, int ano) {
		
		if(dia > 0 && dia <=31) {
			this.setDia(dia);
		}
		if(mes > 0 && mes <= 12) {
			this.setMes(mes);
		}
		if(ano > 0 && ano <=2020) {
			this.setAno(ano);
		}
		if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	public String getData(String Data) {
		return Data;
	}
	

}
