package entities;

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

import javax.swing.*;

public class Carro {

    // Instanciação de objetos
    public final JOptionPane op = new JOptionPane();


    // Atributos
    private Integer id;
    private String modelo;
    private String marca;
    private Double valorPorKm;


    // Contrutores
    public Carro() {

    }

    public Carro(int id, String modelo, String marca, double valorPorKm) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.valorPorKm = valorPorKm;
    }


    // Metodos

    public void cadastrarCarro() {
        this.id = Integer.parseInt(op.showInputDialog("=-=-=-=-=-=-=-=-=-=- Cadastro de veículo =-=-=-=-=-=-=-=-=-=-" +
                "\n\nDigite os dados solicitador para cadastro\n\nID: "));
        this.modelo = op.showInputDialog("Modelo: ");
        this.marca = op.showInputDialog("Marca: ");
        this.valorPorKm = Double.parseDouble(op.showInputDialog("Valor por quilometro: "));

        op.showMessageDialog(null, "Cadastro realizado com sucesso");
    }

    public void mostrarDadosCarro() {
        String dadosCarro = "=-=-=-=- Dados do veículo =-=-=-=-\n\nID: " + this.id + "\nModelo: " + this.modelo + "\nMarca: "
                + this.marca + "\nValor por quilometro: " + String.format("R$ %.2f", this.valorPorKm);

        op.showMessageDialog(null, dadosCarro);
    }


    // Getters & Setters
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getValorPorKm() {
        return valorPorKm;
    }

    public void setValorPorKm(double valorPorKm) {
        this.valorPorKm = valorPorKm;
    }

}
