package Java_Core.BasicCode.JavaList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InventoryManager  {
    private List<Product> inventory = new ArrayList<>();



    public boolean addProduct(Product product){
        if(product==null){
            return false;
        }
        for(Product in : inventory){
            if(in.getId().toLowerCase()==product.getId().toLowerCase()){
                return false;
            }

        }
        inventory.add(product);
        return true;
    }

    public List<Product> getProductsByCategory(String category){
        List<Product> filterByCategory = inventory.stream().filter(i ->i.getCategory()==category).toList();
        return filterByCategory;
    }

    public void applyCategoryDiscount(String category, double discountPercentage){
        if (category == null || discountPercentage <= 0 || discountPercentage > 100) {
            return;
        }
        List<Product> categoryProducts = inventory.stream().filter(i -> i.getCategory().equals(category)).toList();
        for(Product p : categoryProducts){
            double newPrice = 0.0;
            newPrice = p.getPrice() * (1-(discountPercentage/100.0));
            p.setPrice(newPrice);

        }

    }

    public void removeOutOfStock(){
        inventory.stream().filter(i -> i.getStockQuantity()>0);
    }




    public void sortByPrice(boolean ascending) {
        Comparator<Product> com = (Product i, Product j)->{
            if(i.getPrice()>j.getPrice()){
                return 1;
            }
            else{
                return -1;
            }
        };
        inventory.sort(ascending ? com : com.reversed());
        System.out.println("check "+inventory);
    }

    public void sortByStockThenName(){
          Comparator<Product> com = (Product i, Product j)-> {
              if (i.getStockQuantity()!=j.getStockQuantity()) {
                  return Integer.compare(j.getStockQuantity(), i.getStockQuantity());
              } else {
                  return i.getName().compareToIgnoreCase(j.getName());
              }
          };
          inventory.sort(com);
        System.out.println("check "+inventory);
    }

}
