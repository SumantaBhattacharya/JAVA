public class Hierar_inherit4 {
    public static void main(String[] args) {
        Hierar_inheritD T1 = new Hierar_inheritD();
        System.out.println("we adpted out "+T1.name + " 1965 ");
        System.out.println("Labrador"+"protect its family with its "+T1.claws + " claws");
        T1.Bark();
        Hierar_inheritC T2= new Hierar_inheritC();
        System.out.println("cat has " +T2.claws+ " claws");
        T2.eat();
    }
}
