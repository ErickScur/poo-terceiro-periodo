package ROBSON_DE_LIMA.primeirob.listas.listaSeis;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected Endereco endereco;

    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void apresentarse() {
        System.out.printf("Nome: %s, Idade: %d%n", nome, idade);
        endereco.apresentarLogradouro();
    }
}