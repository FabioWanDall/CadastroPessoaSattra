package View;

import Controler.PessoaControler;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroPessoaView {
    private JTextField textField_Nome;
    private JTextField textField_CPF;
    private JTextField textField_Telefone;
    private JTextField textField_Email;
    private JTextField textField_CEP;
    private JTextField textField_UF;
    private JTextField textField_Cidade;
    private JTextField textField_Bairro;
    private JTextField textField_Logradouro;
    private JTextField textField_Numero;
    private JTextField textField_Complemento;
    private JButton button_Cadastrar;
    private JButton button_Limpar;
    private JButton button_Sair;
    private JTextArea textArea_Observacoes;
    private JPanel jpainel_cadartro_pessoa;

    public CadastroPessoaView() {
        //Atavidades no click do botão CADASTRAR
        button_Cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Chama o metodo "" láaa controler que vai montar o modelo e mandar pra DAO guardar
                PessoaControler controler = new PessoaControler();
                controler.cadartar(
                        textField_Nome.getText(),
                        textField_CPF.getText(),
                        textField_Telefone.getText(),
                        textField_Email.getText(),
                        textField_CEP.getText(),
                        textField_UF.getText(),
                        textField_Cidade.getText(),
                        textField_Bairro.getText(),
                        textField_Logradouro.getText(),
                        textField_Numero.getText(),
                        textField_Complemento.getText(),
                        textArea_Observacoes.getText()
                );
                System.out.println("Chamou o metodo de cadastrar");
            }
        });
        //Atavidades no click do botão LIMPAR
        button_Limpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Limpa todos os campos
                textField_Nome.setText("");
                textField_CPF.setText("");
                //Contato
                textField_Telefone.setText("");
                textField_Email.setText("");
                //Endereço
                textField_CEP.setText("");
                textField_UF.setText("");
                textField_Cidade.setText("");//localidade
                textField_Bairro.setText("");
                textField_Logradouro.setText("");
                textField_Numero.setText("");
                textField_Complemento.setText("");
                //Observacoes
                textArea_Observacoes.setText("");
            }
        });
    }
}
