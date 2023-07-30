import java.util.ArrayList;
import java.util.List;

public class TradeMachineBottle implements TradeMachine {
    List<Bottle> bottleList = new ArrayList<>();
    @Override
    public void initProduct() {
    }

    public void initProduct(List<Bottle> bottle) {
        this.bottleList = bottle;
    }

    @Override
    public String getProduct() {
        return null;
    }
    public String getProduct(String name) {
        for (Bottle el : bottleList) {
            if (el.getName().equals(name)) return el.toString();
        }
        return "Не найдено";
    }
}
