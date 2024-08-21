package daniils.lesson8.user.store;

public interface UserStore {
    String DEFAULT_USER_NAME = "user";

    default String getDefaultUserName(){
        return DEFAULT_USER_NAME;
    };

    void putUser(User user);
    User getUser();

}
