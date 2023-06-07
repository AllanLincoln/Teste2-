import java.util.Scanner;

public class ECommerce {
    public static void main(String[] args) {
        // Criando objetos de produtos
        Product livro = new Product("Livro", 29.99, "Um livro interessante sobre um determinado assunto.");
        Product notebook = new Product("Notebook", 1999.99, "Um notebook poderoso para uso profissional.");
        Product televisao = new Product("Televisão", 799.99, "Uma televisão de alta definição com recursos avançados.");

        // Criando carrinho de compras
        ShoppingCart cart = new ShoppingCart();

        // Adicionando produtos ao carrinho
        cart.addProduct(livro);
        cart.addProduct(notebook);
        cart.addProduct(televisao);

        // Exibindo o carrinho de compras
        cart.displayCart();

        // Removendo um produto do carrinho
        //cart.removeProduct(notebook);

        // Exibindo o carrinho de compras atualizado
        cart.displayCart();


        // Métodos de pagamento
        PaymentMethod pix = new Pix();
        PaymentMethod boleto = new Boleto();
        PaymentMethod cartaoCredito = new CartaoCredito(10);

        //Variedade de itens
        double totalAmount = cart.calculateTotal();



        // Solicitando a escolha do método de pagamento
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o método de pagamento: ");
        System.out.println("1 - Pix");
        System.out.println("2 - Boleto");
        System.out.println("3 - Cartão de Crédito");

        int paymentMethod = scanner.nextInt();

        // Realizando o pagamento via Pix
        pix.efetuarPagamento(totalAmount);

        // Realizando o pagamento via Boleto
        boleto.efetuarPagamento(totalAmount);

        // Realizando o pagamento via Cartão de Crédito
        cartaoCredito.efetuarPagamento(totalAmount);

        // Verificando a escolha do usuário
        switch (paymentMethod) {
            case 1:
                PaymentMethod pix = new Pix();
                pix.efetuarPagamento(cart.calculateTotal());
                break;
            case 2:
                PaymentMethod boleto = new Boleto();
                boleto.efetuarPagamento(cart.calculateTotal());
                break;
            case 3:
                PaymentMethod cartaoCredito = new CartaoCredito(10);
                cartaoCredito.efetuarPagamento(cart.calculateTotal());
                break;
            default:
                System.out.println("Opção inválida. Pagamento não efetuado.");
                break;
        }

        scanner.close();




    }


}





