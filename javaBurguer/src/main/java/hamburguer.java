public class hamburguer {
private String nome;
private double preco;

    public hamburguer(String nome, double preco){
    this.nome = nome;
    this.preco = preco;
}
    public String getNome() {
        return nome;
}
    public double getPreco() {
        return preco;
    }
    public void setPreco ( double preco){
        this.preco = preco;
    }
}
