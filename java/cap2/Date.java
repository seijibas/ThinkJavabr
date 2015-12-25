
public class Date {

	public static void main(String[] args) {
		// Declaração das variáveis
		String day, month;
		int date, year;
		// Declaração dos valores iniciais ou inicialização das variáveis
		day = "Segunda";
		month = "dezembro";
		date = 25;
		year = 2015;
		
		//Imprime na tela os valores das variáveis
		System.out.println("day=" + day);
		System.out.println("month=" + month);
		System.out.println("date=" + date);
		System.out.println("year=" + year);
		
		//Imprime a data no formato norte-americano
		System.out.println("Formato norte-americano:");
		System.out.println(day + ", " + month + " " + date + ", " + year + ".");	
		//Imprime a data no formato brasileiro
		System.out.println("Formato brasileiro:");
		System.out.println(day + ", " + date + " de " + month + " de " + year + ".");

	}

}
