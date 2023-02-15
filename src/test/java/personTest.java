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
}