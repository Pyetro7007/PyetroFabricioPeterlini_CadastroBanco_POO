package PyetroFabricioPeterlini_CadastroBanco_POO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Janela extends JFrame{
    private void centralizar() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension janela = getSize();
        if (janela.height > screen.height);
            setSize(janela.width, screen.height);
        if (janela.width > screen.width)
            setSize(screen.width, janela.height);
        setLocation((screen.width - janela.width) / 2,
                (screen.height - janela.height) / 2);
    }

    public Janela(){
        // Criação do Frame (Janela)
        super("Java Swing - Desenvolvimento de Sistemas");
        setSize(400, 255);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setResizable(false);

        JLabel jlAgencia = new JLabel("Código da Agência");
        JTextField jtfAgencia = new JTextField();

        JLabel jlConta = new JLabel("");
        JTextField jtfConta = new JTextField();

        JSeparator jSeparator01 = new JSeparator();

        JLabel jlNome = new JLabel("");
        JTextField jtfNome = new JTextField();

        JLabel jlEndereco = new JLabel("");
        JTextField jtfEndereco = new JTextField();

        JLabel jlTelefone = new JLabel("");
        JTextField jtfTelefone = new JTextField();

        JLabel jlCpf = new JLabel("");
        JTextField jtfCpf = new JTextField();

        JRadioButton jrbCorrente = new JRadioButton();
        JRadioButton jrbPoupanca = new JRadioButton();

        ButtonGroup bgContas = new ButtonGroup();
        bgContas.add(jrbCorrente);
        bgContas.add(jrbPoupanca);

        JSeparator jSeparator02 = new JSeparator();

        JButton jbConsultar = new JButton();
        JButton jbAtualizar = new JButton();
        JButton jbFechar = new JButton();

    }
    public static void main(String[] args) {
        Janela janela = new Janela();
        janela.setVisible(true);
    }
}
