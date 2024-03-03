package overloading;
public class Overloading {
//metod overloading de önemli olan şey metod isminin aynı kalması
//bir fonksiyonu iki farklı şekilde kullanabiliriz. Örn 3 sayı toplayan bir fonksiyonken bir kez daha tanımlayıp 2 sayı toplayan bir fonksiyon olarak kullanabiliriz. (overloading) String ifade de kullanabiliriz.
    
    public static void toplama (int a, int b, int c){
        System.out.println("Toplamları = "+ (a+b+c));
    }
    
    public static void toplama (int a, int b){
        System.out.println("Toplamları= "+ (a+b));
    }
    
    public static void toplama (String a, String b){
        System.out.println(a + " " + b);
    }
    
    public static void main(String[] args) {
        
        toplama(5,8,9);
        toplama(7,10);
        toplama("Nazlıcan","Karadaş");
    }
    
}
