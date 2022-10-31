package br.com.geofusion.cart;

/**
 * Classe que representa um produto que pode ser adicionado
 * como item ao carrinho de compras.
 *
 * Importante: Dois produtos são considerados iguais quando ambos possuem o
 * mesmo código.
 */
public class Product {

    private Long code;
    private String description;
    protected int id;
    private static int count = 1;

    /**
     * Construtor da classe Produto.
     *
     * @param code
     * @param description
     */
    public Product(Long code, String description) {
    }

    public Product(Long code, String description, int id) {
        this.code = code;
        this.description = description;
        this.id = Product.count;

        Product.count++;
    }

    /**
     * Retorna o código da produto.
     *
     * @return Long
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * Retorna a descrição do produto.
     *
     * @return String
     */
    public String getDescription() {
        return this.description;
    }

    public int getId() {
        return this.id;
    }

}