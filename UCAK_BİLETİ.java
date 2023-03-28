import java.util.Scanner;
public class Main{
// tofo  auto generated method stub
// km birim fıyatı = 0.10 $ 
// 12 yasından kuuckse toplam fıyatta %50 ındırım
// 12-24 arası ise %10indirim
// 65 yasından buyukse %30 indirim
// gidiş donüş alırsa +20 indirim
// bu kosullara gore hespalama yapan program

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int km,yas,tip;
		System.out.print("Mesafeyi  giriniz: ");
		km = scan.nextInt();
		System.out.print("\n Yaşınızı giriniz: ");
		yas = scan.nextInt();
		System.out.print("\n yolculuk tipini seciniz(1= Tek yön, 2= Gidiş-Dönüş): ");
		tip = scan.nextInt();
		
		double normalFiyat,yasIndirimi,tipIndirimi;
		
		if(km > 0 && yas > 0 && (tip==1 || tip== 2 )){
		    normalFiyat = km * 0.10;
		    if(yas < 12){
		        yasIndirimi = normalFiyat * 0.5;         // indirim oranını hesapladık.
		        
		    }
		    else if (yas >= 12 && yas <= 24){
		        yasIndirimi = normalFiyat * 0.10;
		    }
		    else if(yas>=65){
		        yasIndirimi = normalFiyat * 0.30;
		    }
		    else{
		        yasIndirimi = 0;
		    }
		    normalFiyat = normalFiyat - yasIndirimi; // fiyattan indirimi çıkardık.
		    
		    if(tip==2){
		        tipIndirimi = normalFiyat * 0.20;
		        normalFiyat = (normalFiyat - tipIndirimi)*2; // çift yön olduğundan 2 ile çarptık.
		    }
		}
		else{
		    System.out.println("Girdiğiniz değerler eksik veya yanlış. Lütfen tekrar deneyiniz! ");
		    
		}
		
	}
}

