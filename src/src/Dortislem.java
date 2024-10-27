package src;

public class Dortislem {
	
	public static void main(String[] args) {
	int x = 8 ;
	int y = 32 ;
	int toplama = y + x ;
	int cikarma = y - x ;
	int bolme = y / x ; 
	int carpma = y * x ;
	System.out.println("Toplama Sonucu = " + toplama) ;
	System.out.println("Çıkarma Sonucu = " + cikarma) ;
	System.out.println("Bölme Sonucu = " + bolme) ;
	System.out.println("Çarpma Sonucu = " + carpma) ;
	
	int yukseklik = 10 ;
	int taban = 7 ;
	int ucgenalan = taban * yukseklik /2 ;
	int ucgencevre = taban + taban + taban ;
	System.out.println("Üçgenin Alanı = " + ucgenalan);
    System.out.println("Üçgenin Çevresi = " + ucgencevre);
    
    int r = 3 ;
    double pi = 3.14;
    double dairecevre = 2 * pi * r ;
    double dairealan = pi * r * r ;
    System.out.println("Dairenin Alanı = " + dairealan) ;
    System.out.println("Dairenin Çevresi = " + dairecevre) ;
	
	}}
