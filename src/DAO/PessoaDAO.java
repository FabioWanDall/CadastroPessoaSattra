package DAO;

import DAO.ConnectionFactory;
import Model.Pessoa;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class PessoaDAO {

    private Connection connect;
            Long id;
            String nome;
            String cpf;
            String contato;//
            String telefone;
            String email;
            String endereco;//
            String cep;
            String uf;
            String bairro;
            String logradouro;
            String numero;
            String complemento;
            String localidade;//

    //Construtor ja realiza a conexao
    public PessoaDAO(){
        this.connect = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta por PessoaDAO!");
    }

    public void adiciona(Pessoa pessoa){
        String sql = "INSERT INTO pessoa (nome, cpf, telefone, email, cep, uf, localidade, bairro, logradouro, numero, complemento, observacoes)" +
                     "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connect.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getCpf());
            stmt.setString(3, pessoa.getTelefone());
            stmt.setString(4, pessoa.getEmail());
            stmt.setString(5, pessoa.getCep());
            stmt.setString(6, pessoa.getUf());
            stmt.setString(7, pessoa.getLocalidade());
            stmt.setString(8, pessoa.getBairro());
            stmt.setString(9, pessoa.getLogradouro());
            stmt.setString(10, pessoa.getNumero());
            stmt.setString(11, pessoa.getComplemento());
            stmt.setString(12, pessoa.getObservacao());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }

    }

    public ResultSet relatorio(){
        try {
            Statement st = connect.createStatement();
            String table = "pessoa";
            String sql = "SELECT * FROM "+table+";";
            ResultSet rs = st.executeQuery(sql);
            return rs;
        }
        catch (SQLException u) {
            System.out.println("Problemas na conexão. PessoaDao.relatorio()\n" + u.getMessage());
            //throw new RuntimeException(u);
            return null;
        }

    }
/*
    public int altera(Pessoa pessoa){

    }

    public int exclui(Pessoa pessoa){

    }
*/
}
