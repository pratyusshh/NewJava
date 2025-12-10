import event.weconnect.user.User;
import events.weconnect.browse.Browse;

public  class Main {
    public static void main(String[] args) {
        Browse bro = new Browse();
        User user = new User();

        bro.events();
        user.signUp();
    }
}