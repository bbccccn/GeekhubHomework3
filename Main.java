import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Inventory inventory = new Inventory();
        String input;

        do{
            System.out.println("Commands list: \nadd product \nshow info \nexit \n");
            input = getInput();
            switch (input.toLowerCase()){
                case ("add product"): {
                    inventory.addItem();
                    break;
                }
                case ("show info"):{
                    System.out.println(inventory.getInfo());
                    break;
                }
                default: {
                    if (!input.equals("exit"))
                        System.out.println("Can't read your command. Please, try again.");
                    break;
                }
            }
        } while(!input.equals("exit"));
    }

    private static String getInput() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }
}
