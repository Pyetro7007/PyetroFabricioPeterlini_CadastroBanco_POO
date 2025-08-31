// Código feito por Pyetro Fabrício Peterlini - 2°DS Mtec Manhã
package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import model.*;
import controller.*;

public class Janela extends JFrame {
    // Instância do controller
    private CadastroController controller = new CadastroController(); 

    // Método para centralizar tudo
    private void centralizar() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension janela = getSize();
        if (janela.height > screen.height)
            setSize(janela.width, screen.height);
        if (janela.width > screen.width)
            setSize(screen.width, janela.height);
        setLocation((screen.width - janela.width) / 2,
                (screen.height - janela.height) / 2);
    }

    public Janela() {
        // Criação do Frame (Janela)
        super("Java Swing - Desenvolvimento de Sistemas");
        setSize(400, 255);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setResizable(false);
        centralizar();

        // Label Agencia/TextField Agencia
        JLabel jlAgencia = new JLabel();
        jlAgencia.setText("Código da Agência:");
        jlAgencia.setBounds(10, 10, 110, 18);
        getContentPane().add(jlAgencia);

        JTextField jtfAgencia = new JTextField();
        jtfAgencia.setBounds(125, 10, 50, 20);
        getContentPane().add(jtfAgencia);

        // Label Conta/TextField Conta
        JLabel jlConta = new JLabel();
        jlConta.setText("Número da conta:");
        jlConta.setBounds(205, 10, 105, 18);
        getContentPane().add(jlConta);

        JTextField jtfConta = new JTextField();
        jtfConta.setBounds(315, 10, 60, 20);
        getContentPane().add(jtfConta);

        // Primeiro Separator (linha)
        JSeparator jSeparator01 = new JSeparator();
        jSeparator01.setBounds(10, 40, 365, 10);
        getContentPane().add(jSeparator01);

        // Label Nome/TextField Nome
        JLabel jlNome = new JLabel("Nome:");
        jlNome.setBounds(10, 50, 60, 18);
        jlNome.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlNome);

        JTextField jtfNome = new JTextField();
        jtfNome.setBounds(75, 50, 300, 20);
        getContentPane().add(jtfNome);

        // Label Endereço/TextField Endereço
        JLabel jlEndereco = new JLabel("Endereço:");
        jlEndereco.setBounds(10, 75, 60, 18);
        jlEndereco.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlEndereco);

        JTextField jtfEndereco = new JTextField();
        jtfEndereco.setBounds(75, 75, 300, 20);
        getContentPane().add(jtfEndereco);

        // Label Telefone/TextField Telefone
        JLabel jlTelefone = new JLabel("Telefone:");
        jlTelefone.setBounds(10, 100, 60, 18);
        jlTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlTelefone);
        
        JTextField jtfTelefone = new JTextField();
        jtfTelefone.setBounds(75, 100, 300, 20);
        getContentPane().add(jtfTelefone);

        // Label CPF/TextField CPF
        JLabel jlCpf = new JLabel("CPF:");
        jlCpf.setBounds(10, 125, 60, 18);
        jlCpf.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlCpf);

        JTextField jtfCpf = new JTextField();
        jtfCpf.setBounds(75, 125, 300, 20);
        getContentPane().add(jtfCpf);

        // Botão pra selecionar Conta Corrente e Conta Poupanca
        JRadioButton jrbCorrente = new JRadioButton("Conta Corrente");
        jrbCorrente.setBounds(100, 150, 111, 20);
        jrbCorrente.setMnemonic('C'); // Atalho para ALT + C
        jrbCorrente.setSelected(true);
        getContentPane().add(jrbCorrente);

        JRadioButton jrbPoupanca = new JRadioButton("Conta Poupança");
        jrbPoupanca.setBounds(225, 150, 118, 20);
        jrbPoupanca.setMnemonic('P'); // Atalho para ALT + P
        getContentPane().add(jrbPoupanca);

        // ButtonGroup pra obrigar o usuário selecionar apenas 1
        ButtonGroup bgContas = new ButtonGroup();
        bgContas.add(jrbCorrente);
        bgContas.add(jrbPoupanca);

        // Segundo Separator (linha)
        JSeparator jSeparator02 = new JSeparator();
        jSeparator02.setBounds(10, 180, 365, 10);
        getContentPane().add(jSeparator02);

        // Botões de Consultar, Atualizar e Fechar
        JButton jbConsultar = new JButton("Consultar");
        jbConsultar.setBounds(35, 190, 100, 23);
        jbConsultar.setMnemonic('S'); // Atalho para ALT + S
        getContentPane().add(jbConsultar);

        JButton jbAtualizar = new JButton("Atualizar");
        jbAtualizar.setBounds(145, 190, 100, 23);
        jbAtualizar.setMnemonic('A'); // Atalho para ALT + A
        jbAtualizar.setEnabled(false);
        getContentPane().add(jbAtualizar);

        JButton jbFechar = new JButton("Fechar");
        jbFechar.setBounds(255, 190, 100, 23);
        jbFechar.setMnemonic('F'); // Atalho para ALT + F
        getContentPane().add(jbFechar);

        // Integra a consulta na interface gráfica
        jbConsultar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String agencia = jtfAgencia.getText();
                String conta = jtfConta.getText();

                String[] dados = controller.consultarCliente(agencia, conta);

                if(dados != null) {
                    jtfNome.setText(dados[0]);
                    jtfEndereco.setText(dados[1]);
                    jtfTelefone.setText(dados[2]);
                    jtfCpf.setText(dados[3]);
                    if (dados[4].equalsIgnoreCase("corrente")) {
                        jrbCorrente.setSelected(true);
                    } else {
                        jrbPoupanca.setSelected(true);
                    }
                    jbAtualizar.setEnabled(true);
                    JOptionPane.showMessageDialog(null, "Cliente encontrado");
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente não encontrado");
                }
            }
        });

        // Integra a atualização na interface gráfica
        jbAtualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String agencia = jtfAgencia.getText();
                String conta = jtfConta.getText();
                String nome = jtfNome.getText();
                String endereco = jtfEndereco.getText();
                String telefone = jtfTelefone.getText();
                String cpf = jtfCpf.getText();
                String tipoConta;

                if (jrbCorrente.isSelected()) {
                    tipoConta = "corrente";
                } else {
                    tipoConta = "poupanca";
                }
            
                boolean sucesso = controller.atualizarCliente(agencia, conta, nome, endereco, telefone, cpf, tipoConta);
            
                if (sucesso) {
                    JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso \nNome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone + "\nCPF: " + cpf + "\nAgência: " + agencia.toString() + "\nConta: " + conta.toString() + "\nTipo: " + tipoConta);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao atualizar dados");
                }
            }
        });

        // Integra o fechar na interface gráfica
        jbFechar.addActionListener(e -> System.exit(0));
    }
    // Torna Visivel
    public static void main(String[] args) {
        Janela janela = new Janela();
        janela.setVisible(true);
    }
}
