import DAO.UserDAO;
import entity.User;

public class App {
    public static void main(String[] args) throws Exception {

        User u1 = new User();

        u1.setName("Gusta");
        u1.setLogin("gustinha");
        u1.setEmail("gustavosilva.h37@gmail.com");
        u1.setPassword("123456");

        new UserDAO().userSignup(u1);

    }
}
