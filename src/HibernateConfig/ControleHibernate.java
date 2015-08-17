/*♣♣♣♣♣♣(↓)♣♣♣♣♣♣
 INFORMAÇÕES IMPORTANTES
 A - Adicione a biblioteca do hibernate (Hibernate 4.3.X)

 B - Adicione o hibernate.cfg
 Botão direito no nome do projeto: Novo\Hibernate\Assistente de Configuração do Hibernate
 conexão de banco de dados
 Drive: MySQL (Connector/J driver)

 ♣♣♣♣♣♣(↑)♣♣♣♣♣♣*/
package HibernateConfig;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class ControleHibernate {

    private final SessionFactory fabrica;

    private ControleHibernate() {
        this.fabrica = new AnnotationConfiguration().configure().buildSessionFactory();
    }

    public Session getSession() {
        return fabrica.openSession();
    }
}
