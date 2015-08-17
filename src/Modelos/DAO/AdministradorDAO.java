/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos.DAO;

import Modelos.Administrador;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AdministradorDAO {

    private final SessionFactory conexao;

     public AdministradorDAO(){
        conexao = new Configuration().configure().buildSessionFactory();
    }
    
    public void checaTabela(){
    Session sessao;
        sessao = conexao.openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.getEntityName(this);
        transacao.commit();
        sessao.close();
    }

    public void salvarAdministrador (Administrador administrador) {
        Session sessao;
        sessao = conexao.openSession();
        Transaction transacao = sessao.beginTransaction();
        sessao.save(administrador);
        transacao.commit();
        sessao.close();
    }
}
