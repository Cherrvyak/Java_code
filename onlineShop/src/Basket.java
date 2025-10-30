public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private int limit;

    public Basket() {
        this.limit = 10000;
    }

    public Basket(int limit){
        this();
        this.limit = limit;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count){
        if (items.contains(name) || totalPrice + price * count >= limit){
            return;
        } else {
            items = items + "\n" + name + count + " шт. - " + price * count;
            totalPrice = totalPrice + price;
        }
    }


    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int totalPriceReturn() {
        return totalPrice;
    }

    public void print(String title) {
        System.out.println("\n" + title);

        if(items.isEmpty()){
            System.out.println("Корзина пуста!");
        } else {
            System.out.println(items);
        }
    }


}
