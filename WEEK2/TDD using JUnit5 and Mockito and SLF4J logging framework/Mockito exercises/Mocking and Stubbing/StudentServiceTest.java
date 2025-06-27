import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest {

    @Test
    void testGetStudentName() {
        // Arrange: Create a mock and stub behavior
        StudentRepository mockRepo = mock(StudentRepository.class);
        when(mockRepo.findStudentNameById(101)).thenReturn("Alice");

        // Act: Inject the mock into the service
        StudentService service = new StudentService(mockRepo);
        String name = service.getStudentName(101);

        // Assert: Check expected result
        assertEquals("Alice", name);

        // Verify: Ensure method was called
        verify(mockRepo).findStudentNameById(101);
    }
}
