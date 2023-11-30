package orm.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import java.util.List;

public class AlunoDAO {

    private EntityManagerFactory factory;
    private EntityManager em;

    public AlunoDAO() {
        factory = Persistence.createEntityManagerFactory("alunos");
        em = factory.createEntityManager();
    }

    public void inserirAluno(Aluno aluno) {
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            em.persist(aluno);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
    
    public List<Aluno> listarAlunos() {
        try {
            return em.createQuery("SELECT a FROM Aluno a", Aluno.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            em.close();
        }
    }
    
    public List<Aluno> listarAlunosPorLetra(String letra) {
        try {
            return em.createQuery("SELECT a FROM Aluno a WHERE UPPER(SUBSTRING(a.nome, 1, 1)) = :letra", Aluno.class)
                    .setParameter("letra", letra.toUpperCase())
                    .getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            em.close();
        }
    }
}

