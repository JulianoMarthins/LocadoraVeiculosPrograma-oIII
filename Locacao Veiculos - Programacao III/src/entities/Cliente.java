package entities;

import javax.swing.*;

/*
 *    Curso: Analise e Desenvolvimento de Sistemas
 *    Faculdade: Unicessumar
 *    Disciplina: Programação 3
 *
 *    Aluno: Juliano Martins de Souza
 *    R.A: 20152979-5
 *
 *    Avaliação MAPA
 */
public class Cliente {

    // Instanciação de objetos
    public final JOptionPane op = new JOptionPane();


    // Atrinutos de classe
    private Integer id = 0;
    private String nome = " ";
    private String cpf = " ";
    private String telefone = " ";


    // Contrutores
    public Cliente() {

    }

    public Cliente(int id, String nome, String cpf, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }


    // Metodos

    public void cadastrarUsuario() {
        this.id = Integer.parseInt(op.showInputDialog("=-=-=-=-=-=-=-=-=-=- Cadastro de cliente =-=-=-=-=-=-=-=-=-=-" +
                "\n\nDigite os dados solicitador para cadastro\n\nID: "));
        this.nome = op.showInputDialog("Nome: ");
        this.cpf = op.showInputDialog("CPF: ");
        this.telefone = op.showInputDialog("Telefone: ");
        op.showMessageDialog(null, "Cadastro realizado com sucesso");
    }

    public void mostrarDadosUsuario() {
        String dadosCliente = "=-=-=-=- Dados do cliente =-=-=-=-\n\nID: " + this.id + "\nNome: " + this.nome + "\nCPF: "
                + this.cpf + "\nTelefone: " + this.telefone;

        op.showMessageDialog(null, dadosCliente);
    }


    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


}
