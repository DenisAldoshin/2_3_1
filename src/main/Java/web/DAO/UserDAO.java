package web.DAO;

import web.models.User;

import java.util.List;

public interface UserDAO {
    public List<User> showALL();

    public User showOne(int id);

    public void save(User user);

    public void delete(int id);

    public void update(int id, User updateUser );


}
