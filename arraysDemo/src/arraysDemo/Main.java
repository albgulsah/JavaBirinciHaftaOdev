package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Merve";
		String ogrenci2 = "Yusuf";
		String ogrenci3 = "Gülşah";
		String ogrenci4 = "Murat";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("---------------------------------");
		
		String [] ogrenciler = new String[4];
		ogrenciler[0]="Merve";
		ogrenciler[1]="Yusuf";
		ogrenciler[2]="Gülşah";
		ogrenciler[3]="Murat";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		
		System.out.println("---------------------------------");
		
		//en kısa kod yazılımı bu şekildedir.iyikoddur.yukarıdaki kullanımın aynısıdır.
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
