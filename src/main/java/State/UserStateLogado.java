package State;

public class UserStateLogado extends UserState {

    private UserStateLogado() {};
    private static UserStateLogado instance = new UserStateLogado();
    public static UserStateLogado getInstance() {
        return instance;
    }

    public String getState() {
        return "Logado";
    }

}
