package State;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;

    @BeforeEach
    public void setUp() {
        user = new User();
    }

    //    Usuário Cadastrado

    @Test
    public void naoDeveCadastrarUsuarioCadastrado() {
        user.setState(UserStateCadastrado.getInstance());
        assertFalse(user.cadastrar());
    }

    @Test
    public void deveLogarUsuarioCadastrado() {
        user.setState(UserStateCadastrado.getInstance());
        assertTrue(user.logar());
        assertEquals(UserStateLogado.getInstance(), user.getState());
    }

    @Test
    public void deveDeslogarUsuarioCadastrado() {
        user.setState(UserStateCadastrado.getInstance());
        assertTrue(user.deslogar());
        assertEquals(UserStateDeslogado.getInstance(), user.getState());
    }

    @Test
    public void deveSuspenderUsuarioCadastrado() {
        user.setState(UserStateCadastrado.getInstance());
        assertTrue(user.suspenso());
        assertEquals(UserStateSuspenso.getInstance(), user.getState());
    }

    @Test
    public void deveBloquearUsuarioCadastrado() {
        user.setState(UserStateCadastrado.getInstance());
        assertTrue(user.bloqueado());
        assertEquals(UserStateBloqueado.getInstance(), user.getState());
    }

    //    Usuário Suspenso

    @Test
    public void naoDeveCadastrarUsuarioSuspenso() {
        user.setState(UserStateSuspenso.getInstance());
        assertTrue(user.cadastrar());
        assertEquals(UserStateCadastrado.getInstance(), user.getState());
    }

    @Test
    public void naoDeveSuspenderUsuarioSuspenso() {
        user.setState(UserStateSuspenso.getInstance());
        assertFalse(user.suspenso());
    }

    @Test
    public void naoDeveLogarUsuarioSuspenso() {
        user.setState(UserStateSuspenso.getInstance());
        assertFalse(user.logar());
    }

//    @Test
//    public void deveDeslogarUsuarioSuspenso() {
//        user.setState(UserStateSuspenso.getInstance());
//        assertTrue(user.bloqueado());
//        assertEquals(UserStateBloqueado.getInstance(), user.getState());
//    }

//    @Test
//    public void deveDeslogarUsuarioCadastrado() {
//        user.setState(UserStateCadastrado.getInstance());
//        assertTrue(user.deslogar());
//        assertEquals(UserStateDeslogado.getInstance(), user.getState());
//    }
//
//    @Test
//    public void deveSuspenderUsuarioCadastrado() {
//        user.setState(UserStateCadastrado.getInstance());
//        assertTrue(user.suspenso());
//        assertEquals(UserStateSuspenso.getInstance(), user.getState());
//    }
//
//    @Test
//    public void deveBloquearUsuarioCadastrado() {
//        user.setState(UserStateCadastrado.getInstance());
//        assertTrue(user.bloqueado());
//        assertEquals(UserStateBloqueado.getInstance(), user.getState());
//    }


}