public class StudentService {
    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public String getStudentName(int id) {
        return repo.findStudentNameById(id);
    }
}
