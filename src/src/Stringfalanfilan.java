package src;
import java.util.Scanner;

public class Stringfalanfilan {
public static void main(String[] args) {
 
Scanner scan = new Scanner(System.in);
 
 System.out.println("Bir yazı giriniz: ");
 String a = scan.nextLine();
 System.out.println("Yazınızın uzunluğu = " + a.length());

 System.out.println("Bir yazı giriniz: ");
 String b = scan.nextLine();
 System.out.println("Yazınızın büyük hali --> " + b.toUpperCase());
	
 System.out.println("Bir yazı giriniz: ");
 String c = scan.nextLine();
 System.out.println("Yazınızın yeni hali --> " + c.substring(2,6));

 System.out.println("Bir yazı giriniz: ");
 String d = scan.nextLine();
 System.out.println("Yazınız E ile başlıyor mu? " + d.startsWith("E"));
	}}
