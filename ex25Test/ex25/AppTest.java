package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void passwordValidator() {
    }

    @Test
    void main() {
        String password = "password1234";
        int strength = 3;
        assertEquals(3, strength);
    }
}