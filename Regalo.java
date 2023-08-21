
public class Regalo {
	public static String elegir(int vida) {
		String gift = "";
		switch(vida) {
		case 1: gift = "Una entrada al cine"; break;
		case 2: gift = "Una visita al museo"; break;
		case 3: gift = "Pasaje al caribe"; break;
		}
		return gift;
	}
}
