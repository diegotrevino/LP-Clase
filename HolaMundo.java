import java.util.Scanner;
public class HolaMundo {

	public static void main(String[] args) {
		int vida,rp;
		boolean fl = false;
		vida = 0;
		Scanner sc = new Scanner(System.in);
		do {
			vida = numeroVidas(vida);
			System.out.println("Vida: "+vida+"\t¿Cual es el numero secreto?");
			rp = sc.nextInt();
			if(rp == 1234)
				fl=true;
		}while(vida < 3 && !fl);
		if(fl == true)
			System.out.println("Adiviniaste!!! Ganaste un carro");
		else
			System.out.println("ups, perdiste... ");
	}
	public static int numeroVidas(int vida) {
		vida++;
		return vida;
	}
}
