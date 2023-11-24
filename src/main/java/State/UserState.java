package State;

public abstract class UserState {

    public abstract String getState();

    public boolean cadastrar(User user) {
        return false;
    }

    public boolean logar(User user) {
        return false;
    }

    public boolean deslogar(User user) {
        return false;
    }

    public boolean suspenso(User user) {
        return false;
    }

    public boolean bloqueado(User user) {
        return false;
    }

}
