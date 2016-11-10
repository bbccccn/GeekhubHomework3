import Goods.Banana;
import Goods.Box;
import Goods.Product;
import Goods.SysadminsBeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Inventory {
    Map<String, List<Product>> goods = new HashMap<String, List<Product>>();

    public Inventory() {
        goods.put("sysadminsbeer", new ArrayList<>());
        goods.put("banana", new ArrayList<>());
        goods.put("box", new ArrayList<>());
    }

    public String getInfo() {
        String result = "";
        double summaryPriceOfAllProducts = 0;
        int itemsCount = 0;
        for (List<Product> concreteGoods : goods.values()) {
            for (Product product : concreteGoods) {
                result += product.toString() + "\n";
                itemsCount += product.getCount();
                summaryPriceOfAllProducts += product.getSummaryPrice();
            }
        }
        result+="Summary items in inventory: "+ itemsCount + "\nSummary price: " + summaryPriceOfAllProducts +'\n';
        return result;
    }

    public void addItem() throws IOException {
        String input;
        do {
            System.out.println("Enter name of product: SysadminsBeer, Banana, Box");
            input = getInput().toLowerCase();
        } while (!isInputValid(input));

        switch (input) {
            case ("sysadminsbeer"): {
                System.out.println("Enter following values: price per item, count of items, capacity");
                goods.get(input).add(new SysadminsBeer(getValidDouble(), getValidInt(), getValidDouble()));
                break;
            }
            case ("banana"): {
                System.out.println("Enter following values: price per item, count of items");
                goods.get(input).add(new Banana(getValidDouble(), getValidInt()));
                break;
            }
            case ("box"): {
                System.out.println("Enter following values: price per item, count of items, weight capacity");
                goods.get(input).add(new Box(getValidDouble(), getValidInt(), getValidDouble()));
                break;
            }
        }
    }

    private double getValidDouble() throws IOException {
        double value = parseDouble(getInput());
        while (value < 0){
            System.out.println("Your value is not bigger that zero! Please, rewrite value:");
            value = parseDouble(getInput());
        }
        return value;
    }

    private int getValidInt() throws IOException {
        int value = parseInt(getInput());
        while (value < 0){
            System.out.println("Your value is not bigger that zero! Please, rewrite value:");
            value = parseInt(getInput());
        }
        return value;
    }

    private boolean isInputValid(String input) {
        return input.equals("sysadminsbeer")
                || input.equals("banana")
                || input.equals("box");
    }

    private static String getInput() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }
}

