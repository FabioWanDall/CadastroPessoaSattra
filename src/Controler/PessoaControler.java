package Controler;

import Model.Pessoa;
import DAO.PessoaDAO;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PessoaControler {

    public PessoaControler(){
    }

    public void cadartar(String nome, String cpf, String telefone, String email,
                         String cep, String uf, String localidade/*cidade*/, String bairro,
                         String logradouro, String numero, String complemento, String observacoes){

        Pessoa pessoa = new Pessoa();

        pessoa.setNome(nome);
        pessoa.setCpf(cpf);
        pessoa.setTelefone(telefone);
        pessoa.setCep(cep);
        pessoa.setEmail(email);
        pessoa.setUf(uf);
        pessoa.setLocalidade(localidade);
        pessoa.setBairro(bairro);
        pessoa.setLogradouro(logradouro);
        pessoa.setNumero(numero);
        pessoa.setComplemento(complemento);
        pessoa.setObservacao(observacoes);

        PessoaDAO pessoaDAO = new PessoaDAO();
        pessoaDAO.adiciona(pessoa);
    }

    public ArrayList<Pessoa> listar(){
        PessoaDAO pessoaDAO = new PessoaDAO();
        ResultSet rs = pessoaDAO.relatorio();
        ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
        Pessoa pessoa = new Pessoa();
        try
        {
            while(rs.next())
            {
                pessoa = new Pessoa();
                pessoa.setNome(rs.getString("nome"));
                pessoa.setCpf(rs.getString("cpf"));
                pessoa.setTelefone(rs.getString("telefone"));
                pessoa.setEmail(rs.getString("email"));
                pessoa.setCep(rs.getString("cep"));
                pessoa.setUf(rs.getString("uf"));
                pessoa.setLocalidade(rs.getString("localidade"));//Cidade
                pessoa.setBairro(rs.getString("bairro"));
                pessoa.setLogradouro(rs.getString("logradouro"));
                pessoa.setNumero(rs.getString("numero"));
                pessoa.setComplemento(rs.getString("complemento"));
                pessoa.setObservacao(rs.getString("observacoes"));

                lista.add(pessoa);
                pessoa = new Pessoa();
            }
            return lista;
        }catch(Exception ex)
        {
            System.out.println("ERRO Controler.PessoaControler.listar \n" + ex.getMessage());
            return null;
        }
    }
}
