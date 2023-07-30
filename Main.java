import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------- ПОИСК ОСВЕЖАЮЩИХ НАПИТКОВ ---------");
        TradeMachineBottle vmBottle = new TradeMachineBottle();
        List<Bottle> bottleList = new ArrayList<>(Arrays.asList(
                new Bottle(prod.Cola.toString(), new BigDecimal(3), 0.5),
                new Bottle(prod.Sprite.toString(), new BigDecimal(3.5), 0.45),
                new Bottle(prod.Fanta.toString(), new BigDecimal(3), 0.43),
                new Bottle("Aqua Minerale", new BigDecimal(1.5), 0.5)));
        vmBottle.initProduct(bottleList);
        System.out.println(vmBottle.getProduct("Aqua Minerale"));

        System.out.println("--------- ПОИСК ГОРЯЧИХ НАПИТКОВ ---------");
        TradeMachineHotDrinks vmHotDrinks = new TradeMachineHotDrinks();
        List<Hot> hotDrinksList = new ArrayList<>(Arrays.asList(
                new Hot("Coffee", new BigDecimal(3), 0.3, 90),
                new Hot("Tea", new BigDecimal(1), 0.4, 80),
                new Hot("Milk", new BigDecimal(3), 1.0, 50)));
        vmHotDrinks.initProduct(hotDrinksList);
        System.out.println("Поиск по названию: " + vmHotDrinks.getProduct("Coffee"));
        System.out.println("Поиск по цене <=: " + vmHotDrinks.getProduct(new BigDecimal(2.5)));
        System.out.println("Поиск по температуре <=: " + vmHotDrinks.getProduct(70));
    }

    enum prod {
        Cola,
        Sprite,
        Fanta,
    }
}