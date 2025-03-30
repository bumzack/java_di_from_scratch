package at.bumzack.levelwtf;


import java.util.Objects;

public class AuthService {

    public boolean isAuthenticated(final String username) {
        return Objects.equals(username, "bliblablupp");
    }

}
