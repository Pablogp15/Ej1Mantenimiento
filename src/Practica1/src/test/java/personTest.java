import org.example.person.Person;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class personTest {
    static Person personaH;
    static Person personaM;
    static Person p3;
    static Person p4;

    @BeforeAll
    public static void initialize() {
        personaH = new Person("Pedro", 20, "Male");
        personaM = new Person("Bernarda", 17, "Female");
        p3 = new Person("Roberto", 22, "Male");
        p4 = new Person("Luisa", 18, "Female");
    }
    @Test
    public void correctName(){
        String obtained  = personaH.getName();
        assertEquals("Pedro", obtained);

    }
    @Test
    public void correctAge(){
        int obtained  = personaH.getAge();
        assertEquals(20, obtained);

    }
    @Test
    public void incorrectAge(){
        RuntimeException r;
        r =assertThrows (RuntimeException.class, ()-> new Person("Pablo", -1, "Male"));
        assertEquals("The number is negative", r.getMessage());

    }
    @Test
    public void incorrectGender(){
        RuntimeException r;
        r =assertThrows (RuntimeException.class, ()-> new Person("Pablo", 1, "Ma"));
        assertEquals("Incorrect gender", r.getMessage());

    }

    @Test
    public void correctGender(){
        String obtained  = personaH.getGender();
        assertEquals("Male", obtained);
    }
    @Test
    public void correctMean(){
        List<Person> Personas = Arrays.asList(personaH,personaM,p3,p4);
        double [] averageAges = p4.averageAgePerGender(Personas);
        assertEquals(21, averageAges[0]);
        assertEquals(17.5, averageAges[1]);
    }
    @Test
    public void nHombres0(){
        List<Person> Personas = Arrays.asList(personaM);

        double [] averageAges = personaM.averageAgePerGender(Personas);
        assertEquals(0, averageAges[0]);
    }
    @Test
    public void nMujeres0(){
        List<Person> Personas = Arrays.asList(personaH);

        double [] averageAges = personaH.averageAgePerGender(Personas);
        assertEquals(0, averageAges[1]);
    }

}
