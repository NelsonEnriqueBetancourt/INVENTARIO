package API.REST.FULL.DAO;

import API.REST.FULL.Models.Users.UserAdmin;

public interface UserDao {

    boolean verificarCredenciales(UserAdmin user);
}
