package daniils.lesson8.user.store;

public class InMemoryUserStore implements UserStore{
    User[] users;

    @Override
    public void putUser(User user) {
        //users[i]=user;
    }

    @Override
    public User getUser() {
        //return user[i];
        return null;
    }
}
