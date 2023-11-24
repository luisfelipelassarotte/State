package State;

public class UserStateSuspenso extends UserState {

    private UserStateSuspenso() {};
    private static UserStateSuspenso instance = new UserStateSuspenso();
    public static UserStateSuspenso getInstance() {
        return instance;
    }

    public String getState() {
        return "Bloqueado";
    }

    public boolean cadastrar(User user) {
        user.setState(UserStateCadastrado.getInstance());
        return true;
    }

    public boolean desconectar(User user) {
        user.setState(UserStateDeslogado.getInstance());
        return true;
    }

}
