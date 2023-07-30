import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TradeMachineHotDrinks implements TradeMachine {
    List<Hot> hotList = new ArrayList<>();
    List<Hot> resultFind = new ArrayList<>();

    @Override
    public void initProduct() {
    }

    public void initProduct(List<Hot> list) {
        this.hotList = list;
    }

    @Override
    public String getProduct() {
        return null;
    }

    public String getProduct(String name) {
        resultFind.clear();
        for (Hot el : hotList) {
            if (el.getName().equals(name)) resultFind.add(el);
        }
        return resultFind.toString();
    }

    public String getProduct(BigDecimal price) {
        resultFind.clear();
        for (Hot el : hotList) {
            if (el.getPrice().compareTo(price) <= 0) resultFind.add(el);
        }
        return resultFind.toString();
    }

    public String getProduct(int temp) {
        resultFind.clear();
        for (Hot el : hotList) {
            if (el.getTemp() <= temp) resultFind.add(el);
        }
        return resultFind.toString();
    }
}