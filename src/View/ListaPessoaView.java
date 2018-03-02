package View;

import Controler.PessoaControler;
import Model.Pessoa;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ListaPessoaView extends JFrame {

    public ListaPessoaView () {
        //Definições do JFrame
        setTitle ("Sistema de Cadastro de Pessoa");
        setSize (700, 700);
        Container cp = getContentPane ();

        //Criando JTabbedPane e adicionando ao JFrame
        JTabbedPane jtp = new JTabbedPane ();
        cp.add (jtp);

        //Criando o JPanel pedido com Layout null
        JPanel JPanel_Pessoa = new JPanel ();
        JPanel_Pessoa.setLayout (null);
        //Criando as JLabel's, definindo tamanho e localização e adicionando ao JPanel
        JLabel nome = new JLabel ("Nome:");
        nome.setBounds (10, 10, 100, 10);
        JPanel_Pessoa.add (nome);
        JLabel sobrenome = new JLabel ("Sobrenome:");
        sobrenome.setBounds (10, 40, 100, 10);
        JPanel_Pessoa.add (sobrenome);
        JLabel cpf = new JLabel ("CPF:");
        cpf.setBounds (10, 70, 100, 10);
        JPanel_Pessoa.add (cpf);
        //Criando os JTextField's, definindo tamanho e localização e adicionando ao JPanel pedido
        JTextField camponome = new JTextField ();
        camponome.setBounds (110, 8, 500, 20);
        JPanel_Pessoa.add (camponome);
        JTextField camposobrenome = new JTextField ();
        camposobrenome.setBounds (110, 37, 500, 20);
        JPanel_Pessoa.add (camposobrenome);
        JTextField campocpf = new JTextField ();
        campocpf.setBounds (110, 65, 500, 20);
        JPanel_Pessoa.add (campocpf);
        //Criando os JButton's, definindo tamanho e localização e adicionando ao JPanel pedido
        JButton incluir = new JButton ("Incluir");
        incluir.setBounds (191, 150, 100, 30);
        JPanel_Pessoa.add (incluir);
        JButton atualizar = new JButton ("Atualizar");
        atualizar.setBounds (296, 150, 100, 30);
        JPanel_Pessoa.add (atualizar);
        JButton listar = new JButton ("Listar");
        listar.setBounds (401, 150, 100, 30);
        JPanel_Pessoa.add (listar);
        JButton excluir = new JButton ("Excluir");
        excluir.setBounds (506, 150, 100, 30);
        JPanel_Pessoa.add (excluir);
        //Criando JScrollPane, configurando tamanho e localização e adicionando no JPanel pedido
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(240, 200, 300, 200);
        JPanel_Pessoa.add(scrollPane);
        //Criando a JTable tabela e adicionando no JScrollPane
        JTable tabela = new JTable();
        scrollPane.setViewportView(tabela);
        tabela.setModel(new DefaultTableModel(
                new Object[][] {
                        {"Teste", "Teste", "Teste"},
                        {"Teste", "Teste", "Teste"},
                        {"Teste", "Teste", "Teste"},
                },
                new String[] {
                        "CPF", "Nome", "Sobrenome"
                }
        ));
        ////Criando os JPanel's cliente e preco
        ////JPanel cliente = new JPanel ();
        ////JPanel preco = new JPanel ();
        ////Adicionando os JPanel's ao JTabbedPane
        ////jtp.addTab ("Cliente", cliente);
        jtp.addTab ("All Fuctions", JPanel_Pessoa);
        ////cp.add(pedido);

        ////jtp.addTab ("Preço do Material", preco);
    }
    public static void main (String [] args) {
        ListaPessoaView design = new ListaPessoaView ();
        design.setVisible (true);
    }
}
/*
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class ListaPessoaView {
    private JTable table_lista_pessoa;
    private JPanel jpanel_lista_pessoa;


    public ListaPessoaView(){

        //Criando JScrollPane, configurando tamanho e localização e adicionando no JPanel pedido
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(240, 200, 300, 200);
        this.jpanel_lista_pessoa.add(scrollPane);
        scrollPane.setViewportView(table_lista_pessoa);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nome");
        model.addColumn("CPF");
        model.addColumn("Observações");

        PessoaControler pessoaControler = new PessoaControler();
        ArrayList<Pessoa> lista = pessoaControler.listar();
        if(lista.isEmpty()) {
            model.addRow(new String[]{"lista vazia", "", ""});
        }else{
            for (Pessoa p : lista) {
                model.addRow(new String[]{p.getNome(),p.getCpf(),p.getObservacao()});
            }
        }
        table_lista_pessoa.setModel(model);
    }




    public static void main(String[] args) {
        JFrame frame = new JFrame("App Cadastro de Pessoa");
        frame.setContentPane(new ListaPessoaView().jpanel_lista_pessoa);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
*/