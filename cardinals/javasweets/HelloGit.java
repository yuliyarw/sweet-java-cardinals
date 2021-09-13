package cardinals.javasweets;

import java.time.LocalDate;

public class HelloGit {

    public static void main(String[] args) {
        System.out.println("HelloGit!");
        
        Inventory item = new Inventory("1001", "Pumpkin Pie", 12.99, 3, LocalDate.of(2021, 10, 31));
        System.out.println(item.toString());
        
    }

}
