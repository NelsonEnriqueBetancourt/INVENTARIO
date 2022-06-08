package API.REST.FULL.DAO;

import API.REST.FULL.Models.Users.UserAdmin;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Service
public class UsersDaoImplement implements UserDao {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public boolean verificarCredenciales(UserAdmin user) {
        String query="FROM UserAdmin WHERE Name = :name AND Password = :password";
        List<UserAdmin> list=entityManager.createQuery(query)
                .setParameter("name",user.getName())
                .setParameter("password",user.getPassword())
                .getResultList();
        return !list.isEmpty();

    }
}
