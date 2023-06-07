import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void displayCart() {
        System.out.println("Carrinho de Compras:");
        System.out.println("--------------------");
        double total = 0;
        for (Product product : products) {
            System.out.println("Nome: " + product.getName());
            System.out.println("Descrição: " + product.getDescription());
            System.out.println("Preço: R$" + product.getPrice());
            System.out.println("--------------------");
            total += product.getPrice();
        }

            System.out.println("Quantidade de produtos: " + products.size());
            System.out.println("Valor total: R$" + total);
        }

    public void efetuarPagamento(PaymentMethod pix) {
    }
}



