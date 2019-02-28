package monPackage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

class FIFOTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        FIFO FIFO = new FIFO();
        int tailleQueue = FIFO.size();
        FIFO.add(42);
        assertEquals(tailleQueue,tailleQueue++);

        FIFO FIFO2 = new FIFO();
        FIFO2.add(75);
        assertEquals(FIFO2.first(),Integer.valueOf(75));
    }

    @Test
    void first() {
        FIFO FIFO = new FIFO();
        assertThrows(NoSuchElementException.class, ()-> FIFO.first() );

        FIFO.add(3);
        assertEquals(FIFO.first(), Integer.valueOf(3));
    }

    @Test
    void isEmpty() {
        FIFO FIFO = new FIFO();
        assertEquals(FIFO.isEmpty(), true);
    }

    @Test
    void removeFirst() {
        FIFO FIFO = new FIFO();
        assertThrows(NoSuchElementException.class, ()-> FIFO.removeFirst());

        FIFO FIFO2 = new FIFO();
        FIFO2.add(78);
        FIFO2.add(427);
        FIFO2.removeFirst();
        assertEquals(FIFO2.first(),Integer.valueOf(427));
    }

    @Test
    void size() {
        FIFO FIFO = new FIFO();
        int taille = 1;
        FIFO.add(55);
        assertEquals(FIFO.size(), taille);

        FIFO FIFO2 = new FIFO();
        int tailleBis = 0;
        assertEquals(FIFO2.size(), tailleBis);

    }
}