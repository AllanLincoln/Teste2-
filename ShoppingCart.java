import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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
        BigDecimal total = BigDecimal.ZERO;
        for (Product product : products) {
            System.out.println("Nome: " + product.getName());
            System.out.println("Descrição: " + product.getDescription());
            System.out.println("Preço: R$" + product.getPrice());
            System.out.println("--------------------");
            total = total.add(BigDecimal.valueOf(product.getPrice()));
        }

            System.out.println("Quantidade de produtos: " + products.size());

            BigDecimal displayVal = total.setScale(2, RoundingMode.HALF_EVEN);
            Locale brazil = Locale.of("pt","BR");
            NumberFormat brazilFormat = NumberFormat.getCurrencyInstance(brazil);
            brazilFormat.setMinimumFractionDigits(2);
            brazilFormat.setMaximumFractionDigits(2);

            System.out.println("Valor total: " + brazilFormat.format(displayVal.doubleValue()));

    }

    public void efetuarPagamento(PaymentMethod pix) {
    }
}



