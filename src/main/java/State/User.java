package State;

public class User {

    public String user;
    private UserState state;

    public User() {
        this.state = UserStateCadastrado.getInstance();
    }

    public void setState(UserState state) {
        this.state = state;
    }

    public boolean cadastrar() {
        return state.cadastrar(this);
    }

    public boolean logar() {
        return state.logar(this);
    }

    public boolean deslogar() {
        return state.deslogar(this);
    }

    public boolean suspenso() {
        return state.suspenso(this);
    }

    public boolean bloqueado() {
        return state.bloqueado(this);
    }

    public String getNameState() {
        return state.getState();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public UserState getState() {
        return state;
    }
}
