package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,4,5,7,6,8,9,0,};
		int aranacak = 3;
		boolean veri = false;
		
		for(int sayi : sayilar) {
			if(sayi==aranacak) {
				veri = true;
				break;
			}
		}
		
		if(veri) {
			System.out.println("Sayı mevcuttur.");
		}else {
			System.out.println("Sayı mevcut değildir.");
		}

	}

}
