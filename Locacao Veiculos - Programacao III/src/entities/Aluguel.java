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

public class Aluguel {

    // Instanciação de objeto
    public final JOptionPane op = new JOptionPane();


    // Atributos
    private Integer id;
    private Carro carro = new Carro();
    private Cliente cliente = new Cliente();
    private Integer qtdDias;
    private Integer kmInicial;
    private Integer kmFinal;
    private Double valorTotalAluguel;


    // Contrutores
    public Aluguel() {

    }

    public Aluguel(Integer id, Carro carro, Cliente cliente, Integer qtdDias, Integer kmInicial, Integer kmFinal,
                   Double valorTotalAluguel) {
        this.id = id;
        this.carro = carro;
        this.cliente = cliente;
        this.qtdDias = qtdDias;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.valorTotalAluguel = valorTotalAluguel;
    }


    // Metodos

    public void iniciarLocacao() {
        this.cliente.cadastrarUsuario();
        this.carro.cadastrarCarro();

        op.showMessageDialog(null, "=-=-=-=-=-=-=-=-=-=- Iniciando processo de locação " +
                "=-=-=-=-=-=-=-=-=-=-");
        this.kmInicial = Integer.parseInt(op.showInputDialog("Quilometragem inicial: "));
        op.showMessageDialog(null, "=-=-=-=-=-=-=-=-=-=- Contrato finalizado " +
                "=-=-=-=-=-=-=-=-=-=-\n\nCliente: " + cliente.getNome() + "\nVeículo: " + carro.getModelo());
        op.showMessageDialog(null, "=-=-=-=-=-=-=-=-=-=- Boa viagem =-=-=-=-=-=-=-=-=-=-");
    }

    public void fecharLocacao() {
        op.showMessageDialog(null, "=-=-=-=-=-=-=-=-=-=- Fechamento de diarias " +
                "=-=-=-=-=-=-=-=-=-=- ");
        kmFinal = Integer.parseInt(op.showInputDialog("Digite a quilometragem final: "));
        qtdDias = Integer.parseInt(op.showInputDialog("Quantidade de diárias: "));

    }

    public double calculos() {
        if (qtdDias > 20) {
            this.valorTotalAluguel = (qtdDias * carro.getValorPorKm() * (kmFinal - kmInicial)) * 1.2;
        } else if (qtdDias > 10 && qtdDias <= 19) {
            this.valorTotalAluguel = (qtdDias * carro.getValorPorKm() * (kmFinal - kmInicial)) * 1.2;
        } else {
            valorTotalAluguel = qtdDias * carro.getValorPorKm() * (kmFinal - kmInicial);
        }
        return valorTotalAluguel;
    }

    public void mostrarResumoLocacao() {
        cliente.mostrarDadosUsuario();
        carro.mostrarDadosCarro();
        double var = calculos();
        String dadosAluguel = "=-=-=-=-=-=-=-=-=-=- Dados do Aluguel =-=-=-=-=-=-=-=-=-=-\n\nQuantidade de dias: "
                + this.qtdDias + "\nQuilometragem inicial: " + this.kmInicial + "\nQuilometragem final: "
                + this.kmFinal + "\nValor total" + String.format("R$ %.2f", var);

        op.showMessageDialog(null, dadosAluguel);
        op.showMessageDialog(null, "Fim de programa\nObrigado por usar");
        op.showMessageDialog(null, "=-=-=-=-=-=-=-=-=-=- " +
                "Programado por =-=-=-=-=-=-=-=-=-=-" +
                "\n\n =-=-=-=-=-=-=-=-=-=- 'JulianoMarthins' =-=-=-=-=-=-=-=-=-=-");
    }


    // Getters & Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
