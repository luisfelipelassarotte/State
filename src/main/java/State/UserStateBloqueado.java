package State;

public class UserStateBloqueado extends UserState {

    private UserStateBloqueado() {};
    private static UserStateBloqueado instance = new UserStateBloqueado();
    public static UserStateBloqueado getInstance() {
        return instance;
    }

    public String getState() {
        return "Bloqueado";
    }

    public boolean suspenso(User user) {
        user.setState(UserStateSuspenso.getInstance());
        return true;
    }

}
