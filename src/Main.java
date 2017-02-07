import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Track inventory of paintbrushes.
    static ArrayList<PaintBrushStock> paintBrushes = new ArrayList<>();

    public static void main(String[] args) {

        String oldStockItem;
        Integer oldStockQuantity;
        String brushName;

        while (true) {
            processInv();

        }
    }
    private static void processInv() {
        System.out.println("1. Add item to stock.");
        System.out.println("2. Remove item from stock");
        System.out.println("3. Change the quantity of the item in stock.");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        if (option.equals("1")) {
            System.out.println("Add item by name.");
            String brush = scanner.nextLine();
            PaintBrushStock brushType = new PaintBrushStock(brush, 100);
            paintBrushes.add(brushType);

        } else if (option.equals("2")) {
            System.out.println("Remove item by item index number.");
            int itemNumIndex = paintBrushes.size();
            for (PaintBrushStock stock : paintBrushes) {
                System.out.println(itemNumIndex + " " + stock.brush + " " + stock.brushQuantity);
            }
            paintBrushes.remove(Integer.parseInt(scanner.nextLine()));
        } else if (option.equals("3")) {
            System.out.println(paintBrushes.size());
            Integer i = 1;
            for (PaintBrushStock stock : paintBrushes) {
                System.out.println((i) + " " + stock.brush + " " + stock.brushQuantity);
                i++;
            }
            System.out.println("Choose which item to change.");
            Integer itemNumChoice = Integer.parseInt(scanner.nextLine());
            PaintBrushStock p = paintBrushes.get(itemNumChoice - 1);

            System.out.println("Input number of brushes.");
            Integer brushQuantityAdj = Integer.parseInt(scanner.nextLine());
            p.brushQuantity = brushQuantityAdj;
        }

    }
}


