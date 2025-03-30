package at.bumzack.levelwtf;


public class RequestHandler {

    private final AuthService authService;

    public RequestHandler(final AuthService authService) {
        this.authService = authService;
    }

    public boolean handleRequest(final String request, final String response) {
        return authService.isAuthenticated(request) || authService.isAuthenticated(response);
    }

    public AuthService getAuthService() {
        return authService;
    }
}
