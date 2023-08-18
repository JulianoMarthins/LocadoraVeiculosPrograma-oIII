import entities.Aluguel;
import entities.Carro;
import entities.Cliente;

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

public class Main {
    public static void main(String[] args) {

        JOptionPane op = new JOptionPane();
        Aluguel aluguel = new Aluguel();

        op.showMessageDialog(null, "=-=-=-=-=-=-=-=-=-=- MAPA =-=-=-=-=-=-=-=-=-=-" +
                "\nCurso: Analise e Desenvolvimento de Sistemas\nFaculdade: Unicessumar\nDisciplina: Programação III" +
                "\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\nAluno: Juliano Martins de Souza\n" +
                "R.A. 20157929-5\n");

        op.showMessageDialog(null, "Sistema de Locação de Veículos\n");

        aluguel.iniciarLocacao();
        aluguel.fecharLocacao();
        aluguel.mostrarResumoLocacao();

    }
}