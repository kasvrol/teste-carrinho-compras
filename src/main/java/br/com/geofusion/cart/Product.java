package br.com.geofusion.cart;

import java.util.ArrayList;

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
    protected int quantity;
    private static int count = 1;
    protected ArrayList<Product> products;

    /**
     * Construtor da classe Produto.
     *
     * @param code
     * @param description
     */
    public Product(Long code, String description) {
    }

    public Product(Long code, String description, int quantity) {
        this.code = code;
        this.description = description;
        this.id = Product.count;
        this.quantity = quantity;

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

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void signUpProduct(Long code, String description) {
        products = new ArrayList<>();
        products.add(new Product(code, description, 1));

        equalProduct();
    }

    public void equalProduct() {
        for (Product codeUp : products) {
            if (codeUp.getCode() == code) {
                try {
                    // uso comparable

                } catch (NullPointerException e) {
                    quantity = 1;

                }
            }
        }
    }

}