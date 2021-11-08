public class rumusbola extends volbola {
	
	private Double hasil; 
	final double pi = 3.14;
	
	
	void hitung(int r){
		System.out.println("Nilai Volume Bola Yaitu : " +  String.format("%.2f",(1.33*pi*r*r*r)));
	}
	
	void tampil(){
		System.out.println("Rumus Volume Lingkaran : (4/3)*pi*jari^3");
	}
	
}