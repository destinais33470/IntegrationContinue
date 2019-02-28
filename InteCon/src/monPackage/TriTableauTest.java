package monPackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class TriTableauTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    
    @Test
    void triCroissant() {
        int monTableau[] = {42,3,78,9,1};
        int monTableauAttendu[] = {1,3,9,42,78};
        TriTableau.triCroissant(monTableau);
        assertEquals(monTableau[4],monTableauAttendu[4]);

        for (int i = 0; i < monTableau.length - 1; i++) {
            assertTrue(monTableau[i] <= monTableau [i+1]);
        }

    }

    @Test
    void triDecroissant() {
        int monTableau[] = {78,48,9,32,7};
        int monTableauAttendu[] = {78,48,32,9,7};
        TriTableau.triDecroissant(monTableau);
        assertEquals(monTableau[4],monTableauAttendu[4]);

        for (int i = 0; i < monTableau.length - 1; i++) {
            if( i != monTableau.length) {
                assertTrue(monTableau[i] >= monTableau[i + 1]);
            }
        }

    }
}