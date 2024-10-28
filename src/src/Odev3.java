package src;
import java.util.Scanner;

public class Odev3{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	int a ; 
	int b ;
	
	System.out.println("A sayısını giriniz");
	a = input.nextInt();
	System.out.println("B sayısını giriniz");
	b = input.nextInt();
	
	if(a>b) {
		System.out.print("a sayısı büyük, ");
	}
	else if(a<b) {
		System.out.print("b sayısı büyük, ");
	}
	else {
		System.out.println("Sayılar birbirine eşittir");
	}
	if(b>a) {
		System.out.print("a sayısı küçüktür\n");
	}
	else if(b<a) {
		System.out.print("b sayısı küçüktür\n");
	}
	
	int vize,finall;
	double ortalama;
	System.out.println("Vize notunuzu giriniz");
	vize = input.nextInt();
	System.out.println("Final notunuzu giriniz");
	finall = input.nextInt();
	
	ortalama = (vize * 0.35)+(finall * 0.65);
	
	if(ortalama >= 50) {
	    System.out.print("Kişi barajı " + ortalama + " ortalama ile GEÇTİ\n");
	}
	else {
		System.out.print("Kişi barajda " + ortalama + " ortalama ile KALDI\n");
}	
// final iki "l" ile çünkü tek "l" ile yazıldığında java onu bir değişken olarak algılamıyor.	
	
	Scanner scan = new Scanner(System.in);
    System.out.println("Emailinizi giriniz:");
    String email = scan.next();

    if (email.length() < 10) {
        System.out.println("Emailiniz en az 10 haneli olmalıdır.");
}   else     
    
    if (email.endsWith("@gmail.com")) {
            System.out.println("Giriş başarılı.");
}   else {
            System.out.println("Domaini google olan bir email kullanınız.");
}	
// Aslında email kısmını endswith ile yapmak istiyordum fakat bir türlü yapamadım. Eğer yapılabiliyorsa gösterirseniz sevinirim.

String c = "ayrı";
	     String d = "bitişik";
         System.out.println("Türkçe'de bulunan 'ki' bağlacı nasıl yazılır? (ayrı veya bitişik)");
	     String e = scan.next();
	     if (e.equals(c)) {
	     System.out.println("Cevabınız doğru.");
}
	     else if (e.equals(d)) {
	     System.out.println("Cevabınız yanlış");
}
	     else {
	     System.out.println("Cevap 'ayrı' idi.");
}
	     System.out.println("Türkçe'de bulunan 'de' edatı nasıl yazılır? (ayrı veya bitişik)");
	     String f = scan.next();
	     if (f.equals(d)) {
	     System.out.println("Cevabınız doğru.");
}
	     else if (f.equals(d)) {
	     System.out.println("Cevabınız yanlış"); 
}
	     else {
	     System.out.println("Cevap 'bitişik' idi.");
}
	     System.out.println("Türkçe'de bulunan 'mi' eki nasıl yazılır? (ayrı veya bitişik)");
	     String g = scan.next();
	     if (g.equals(c)) {
	     System.out.println("Cevabınız doğru.");
}
	     else if (g.equals(d)) {
	     System.out.println("Cevabınız yanlış.");
}
	     else {
	     System.out.println("Cevap 'ayrı' idi.");
}
// Bana özel kısım üstteki kısım idi	
	     
	     String islem = "" ;
	     String toplama = "+" ;
	     String cikarma = "-" ;
	     String bolme = "/" ;
	     String carpma = "*" ;
	     System.out.println("İşleminizin işaretini (*,/,+,-) giriniz");
	     islem = scan.next();
	     if (islem.equals(toplama) || islem.equals(cikarma) || islem.equals(bolme) || islem.equals(carpma)) {
}            else {
	     System.out.println("Geçersiz işlem adı girildi.");
}	    	     	    
	     if (islem.equals(toplama) || islem.equals(cikarma) || islem.equals(bolme) || islem.equals(carpma)) {
	     System.out.printf("İşlem yapılacak sayı adedini giriniz.Minimum 2 adet sayı giriniz.");
	     int sayilar = scan.nextInt();
	     if (sayilar<2) {
	     System.out.println("En az 2 adet sayı ile işlem yapabilirsiniz");
}else {
	    	 double sonuc = 0;
             
         System.out.println("İlk sayıyı giriniz:");
             double ilkSayi = scan.nextDouble();
             sonuc = ilkSayi; 
             
             for (int i = 1; i < sayilar; i++) {
             System.out.println((i + 1) + ". sayıyı giriniz:");
             double sayi = scan.nextDouble();                                  
             if (islem.equals(toplama)) {
             sonuc += sayi;
} 
             else if (islem.equals(cikarma)) {
             sonuc -= sayi;
} 
             else if (islem.equals(bolme)) {
             sonuc /= sayi;
} 
             else if (islem.equals(carpma)) {
             sonuc *= sayi;
}
             System.out.println("İşlemin sonucu: " + sonuc);
         
// for kısmında chat gpt den yardım aldım.
  	
	
	
				
	                      
}}}}}
