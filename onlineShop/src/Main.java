public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket(400 );

        vasyaBasket.add("Moloko", 300);
        vasyaBasket.add("Sir", 700);

        Basket petyaBasket = new Basket(400);

        petyaBasket.add("Lopata", 300);
        petyaBasket.add("Bochka", 700);

        vasyaBasket.print("Корзина Васи:");
        petyaBasket.print("Корзина Пети:");
    }
}
