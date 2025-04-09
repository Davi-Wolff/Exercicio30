package Principal;

import Model.Funcionario;
import Model.Aluno;
import javax.swing.JOptionPane;

/**
 *
 * @author Davi Wolff
 */
public class Principal {

    public static void main(String[] args) {

        // 1a parte, registro do Aluno
        Aluno alun = new Aluno(1);

        alun.setNome(JOptionPane.showInputDialog(null, "Escreva o seu nome: "));
        alun.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null, "Escreva a sua altura (em metros):")));
        alun.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, "Escreva o seu peso (em kg):")));
        alun.setObjetivo(JOptionPane.showInputDialog(null, "Escreva o seu objetivo: "));
        JOptionPane.showMessageDialog(null, alun.toString());

        if (alun.calculadorIMC() < 18.5) {
            JOptionPane.showMessageDialog(null, "O seu IMC está em 'abaixo da média', sugerido aumento calórico na sua dieta");
        }
        if (alun.calculadorIMC() >= 24.9 && alun.calculadorIMC() <= 29.9) {
            JOptionPane.showMessageDialog(null, "O seu IMC está em 'acima da média', sugerido diminuição calórica na sua dieta");
        }
        if (alun.calculadorIMC() >= 30) {
            JOptionPane.showMessageDialog(null, "O seu IMC está em 'obesidade', sugerido consultar nutricionista");
        } else {
            JOptionPane.showMessageDialog(null, "O seu IMC está em 'dentro da média', sugerido continuar se empenhando! ");
        }

        
        //2a parte introdução ao profissional
        
        
        String resposta = JOptionPane.showInputDialog(null, "Escreva o dia da semana que você treina: ");
        resposta = resposta.toLowerCase();
        resposta = resposta.trim();
        
        Funcionario fc = null;
        
        if ("segunda".equals(resposta)) {
            fc = new Funcionario("Marcos", "marcosaurelio@gmail.com", 4, 22);
        }
        if ("terça".equals(resposta)) {
            fc = new Funcionario("Jorge", "jorge.fisioterapia@gmail.com", 10, 53);
        }
        if ("quarta".equals(resposta)) {
            fc = new Funcionario("Lorena", "lorena.edfisica@gmail.com", 8, 32);
        }
        if ("quita".equals(resposta)) {
            fc = new Funcionario("Maria", "mariacarolina@gmail.com", 2, 20);
        }
        if ("sexta".equals(resposta)) {
            fc = new Funcionario("Cesar", "cesinha.coach@gmail.com", 12, 42);
        }
        
        
        JOptionPane.showMessageDialog(null,"Obrigado por escolher nosso serviços, sugerimos o nosso funcionario para o dia escolhido:");
        JOptionPane.showMessageDialog(null, fc.toString());
        
        
    }
}
