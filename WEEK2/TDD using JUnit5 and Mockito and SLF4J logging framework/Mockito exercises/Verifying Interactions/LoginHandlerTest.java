import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class LoginHandlerTest {

    @Test
    void testLoggerIsCalledOnLogin() {
        // Arrange
        LoggerService mockLogger = mock(LoggerService.class);
        LoginHandler handler = new LoginHandler(mockLogger);

        // Act
        handler.login("Alice");

        // Assert (Verify Interaction)
        verify(mockLogger).log("User Alice logged in");
    }

    @Test
    void testLoggerCalledExactlyOnce() {
        LoggerService mockLogger = mock(LoggerService.class);
        LoginHandler handler = new LoginHandler(mockLogger);

        handler.login("Bob");

        verify(mockLogger, times(1)).log(anyString());
    }
}
