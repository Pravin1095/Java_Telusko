package Java_Core.BasicCode.JavaList;

public class Main {
    public static void main(String[] a){
        InventoryManager manager = new InventoryManager();

        manager.addProduct(new Product("P101", "Mechanical Keyboard", "Electronics", 120.0, 15));
        manager.addProduct(new Product("P102", "Ergonomic Mouse", "Electronics", 45.0, 0)); // Out of stock
        manager.addProduct(new Product("P103", "Standing Desk", "Furniture", 350.0, 5));
        manager.addProduct(new Product("P104", "Gaming Chair", "Furniture", 220.0, 5));
        manager.addProduct(new Product("P105", "USB-C Hub", "Electronics", 30.0, 25));

//        manager.sortByPrice(true);
        manager.sortByStockThenName();

        // 1. Remove out-of-stock items (P102 should be removed)
//        manager.removeOutOfStock();
//
//        // 2. Apply 10% discount to Electronics
//        manager.applyCategoryDiscount("Electronics", 10.0);
//
//        // 3. Sort by price ascending
//        System.out.println("--- Sorted by Price (Ascending) ---");
//        manager.sortByPrice(true);
//        // Expected order: USB-C Hub ($27.00), Mechanical Keyboard ($108.00), Gaming Chair ($220.00), Standing Desk ($350.00)
//
//        // 4. Multi-level Sort (Stock Descending, then Name Ascending)
//        System.out.println("\n--- Sorted by Stock (Desc), then Name (Asc) ---");
//        manager.sortByStockThenName();
//        // Expected order:
//        // Stock 25: USB-C Hub
//        // Stock 15: Mechanical Keyboard
//        // Stock 5:  Gaming Chair (G comes before S)
//        // Stock 5:  Standing Desk
    }
}
