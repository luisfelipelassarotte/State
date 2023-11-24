package State;

public class UserStateCadastrado extends UserState {

    private UserStateCadastrado() {};
    private static UserStateCadastrado instance = new UserStateCadastrado();
    public static UserStateCadastrado getInstance() {
        return instance;
    }

    public String getState() {
        return "Cadastrado";
    }

    public boolean logar(User user) {
        user.setState(UserStateLogado.getInstance());
        return true;
    }

    public boolean deslogar(User user) {
        user.setState(UserStateDeslogado.getInstance());
        return true;
    }

    public boolean suspenso(User user) {
        user.setState(UserStateSuspenso.getInstance());
        return true;
    }

    public boolean bloqueado(User user) {
        user.setState(UserStateBloqueado.getInstance());
        return true;
    }

}
