
package Modelos.DAO;

import Modelos.Entidade;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EntidadeDAO {

    private final SessionFactory conexao;
    
    public EntidadeDAO(){
        conexao = new Configuration().configure().buildSessionFactory();
    }

    public void salvarEntidade (Entidade entidade) {
        Session sessao;
        sessao = conexao.openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.save(entidade);
        transacao.commit();
        sessao.close();
    }
}
