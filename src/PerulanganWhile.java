import java.util.Scanner;
public class PerulanganWhile{
	public static void main(String[] args) {
		boolean running = true;
		int counter = 0;
		String jawab;
		Scanner scan = new Scanner(System.in);
		
		while(running) {
			System.out.println("Apakah anda ingin keluar?");
			System.out.print("Jawab [ya/tidak]> ");
			jawab = scan.nextLine();
			
			if (jawab.equalsIgnoreCase("ya")) {
				running=false;
			}
			counter++;
		}
		scan.close();
		System.out.println("Anda sudah melakukan perulangan sebanyak = " +(counter-1)+" kali");
	}
}