package builder;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder(" cienkie", " Pepperoni, Jalapeno, Ser, Szpinak", " Czosnkowy")
                .setOstra(true)
                .build();
        System.out.println(pizza.toString());
    }
}
