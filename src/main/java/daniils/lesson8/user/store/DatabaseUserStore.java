package daniils.lesson8.user.store;

import java.sql.Connection;

public class DatabaseUserStore implements UserStore{

    Connection connection;

    @Override
    public void putUser(User user) {
        //connection.save(user);
    }

    @Override
    public User getUser() {
        //return connection.get();
        return null;
    }

}

