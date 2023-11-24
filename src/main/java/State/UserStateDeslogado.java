package State;

public class UserStateDeslogado extends UserState {

    private UserStateDeslogado() {};
    private static UserStateDeslogado instance = new UserStateDeslogado();
    public static UserStateDeslogado getInstance() {
        return instance;
    }

    public String getState() {
        return "Desconectado";
    }

}
