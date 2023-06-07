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
        cart.removeProduct(notebook);

        // Exibindo o carrinho de compras atualizado
        cart.displayCart();

        // Métodos de pagamento
        PaymentMethod pix = new Pix();
        PaymentMethod boleto = new Boleto();
        PaymentMethod cartaoCredito = new CartaoCredito(10);

        // Realizando o pagamento via Pix
        cart.efetuarPagamento(pix);

        // Realizando o pagamento via Boleto
        cart.efetuarPagamento(boleto);

        // Realizando o pagamento via Cartão de Crédito
        cart.efetuarPagamento(cartaoCredito);


    }


}


