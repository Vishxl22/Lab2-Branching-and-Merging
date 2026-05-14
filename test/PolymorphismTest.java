import org.junit.Test;
import static org.junit.Assert.*;

public class PolymorphismTest {

    @Test
    public void testGetStudentRole() {
        Person person = new Person("Somebody");
        assertEquals("General", Polymorphism.getStudentRole(person));

        Student student = new Student("Someone", "207207207");
        assertEquals("Student", Polymorphism.getStudentRole(student));

    }
}