public class LoginHandler {
    private final LoggerService logger;

    public LoginHandler(LoggerService logger) {
        this.logger = logger;
    }

    public void login(String username) {
        // logic to validate user ...
        logger.log("User " + username + " logged in");
    }
}
