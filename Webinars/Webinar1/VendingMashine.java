package Webinars.Webinar1;

import java.util.ArrayList;
import java.util.List;

public class VendingMashine {
    String name;
    private List<Product> productList;


    public VendingMashine(List<Product> productList) {
        productList = new ArrayList<>();
    }
    public VendingMashine(){
        this(new ArrayList<>());
    }
    public  void  addProduct(Product product){
        productList.add(product);
    }
}
