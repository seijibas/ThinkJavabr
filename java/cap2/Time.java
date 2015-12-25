
public class Time {

	public static void main(String[] args) {
		// Declaração de variáveis
		float hour, minute, second;
		hour = 13;
		minute = 37;
		second = 48;
		
		//Calcula quantos segundos desde meia-noite e imprime
		float segundosDesde;
		segundosDesde = hour*60*60 + minute*60 + second;
		System.out.println("Segundos desde meia-noite: " + segundosDesde);
		//Calcula quantos segundos restantes no dia e imprime
		float segundosRestantes;
		segundosRestantes = ((24-hour)*60*60) + ((60-minute)*60) + (60-second);
		System.out.println("Segundos restantes no dia: " + segundosRestantes);
		// Calcula a porcentagem do dia que passou e imprime
		float porcentagemDoDia;
		porcentagemDoDia = (100*(segundosDesde/3600)/24);
		System.out.println("Porcentagem do dia que passou: " + porcentagemDoDia + "%");
	}

}
