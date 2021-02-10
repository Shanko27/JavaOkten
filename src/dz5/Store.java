package dz5;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@ToString
public class Store {


    List<Product> prod = new ArrayList<>();
    String a;
    int b;
    int s = 0;
    int z;

    public void addProduct(Product product) {
        Pattern pattern = Pattern.compile("\\d[0-9]");
        Matcher matcher = pattern.matcher(product.name);
        boolean mf = matcher.find();
        if (product.price > 0 && !mf) {
            this.prod.add(product);
        }
    }

    public void del(Product product, String a) {
        this.prod.add(product);
        if (product.name.equals(a)) {
            this.prod.remove(product);
        }
    }

    public void up(Product product, String a) {
        if (product.Type.name() == a.toUpperCase()) {
            product.price = product.price * 2;
            this.prod.add(product);
        }
    }

    List<Product> topProd = new ArrayList<>();

    public void newArr(Product product, int b) {
        prod.add(product);
        if (product.price > b) {
            topProd.add(product);
        }
    }

    public void sum(Product product, String a) {

        if (product.Type.name() == a.toUpperCase()) {
            this.prod.add(product);
            s = s + product.price;
        }
    }


    public void avgProd(Product product) {
        prod.add(product);
        s = s + product.price;
        z = s / prod.size();
    }
}
