package daniils.lesson8.user.store;

public class Simulation {

    public static void main(String[] args) {
        UserStore userStore = new InMemoryUserStore();

        userStore.putUser(new User("Daniil"));
        userStore.putUser(new User("Daniil1"));
        userStore.putUser(new User("Daniil2"));
        userStore.putUser(new User("Daniil3"));
        userStore.putUser(new User("Daniil4"));
    }

}
