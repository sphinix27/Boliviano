package org.fundacionjala.at04.boliviano;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Zero on 11/5/2017.
 */
public class BolivianoTest {

    @Test
    public void noValueReturnsZeroBsToString()
    {
        Boliviano boliviano = new Boliviano();

        assertEquals("Bs 0.00", boliviano.toString());
    }

    @Test
    public void twoValueReturnsTwoBsToString()
    {
        Boliviano boliviano = new Boliviano(2);

        assertEquals("Bs 2.00", boliviano.toString());
    }

    @Test
    public void doubleValueReturnsDoubleBsToString()
    {
        Boliviano boliviano = new Boliviano(7.5);

        assertEquals("Bs 7.50", boliviano.toString());
    }

    @Test
    public void bolivianoOneIsEqualsToBolivianoTwo()
    {
        Boliviano bolivianoUno = new Boliviano(7.4);
        Boliviano bolivianoDos = new Boliviano(7.4);

        assertTrue(bolivianoUno.equals(bolivianoDos));
        assertTrue(bolivianoDos.equals(bolivianoUno));
    }

    @Test
    public void bolivianoOneIsInequalsToBolivianoTwo()
    {
        Boliviano bolivianoUno = new Boliviano(7.4);
        Boliviano bolivianoDos = new Boliviano(3.4);

        assertFalse(bolivianoUno.equals(bolivianoDos));
        assertFalse(bolivianoDos.equals(bolivianoUno));
    }

    @Test
    public void bolivianoOneCanSubstractBolivianoTwo()
    {
        Boliviano bolivianoUno = new Boliviano(7.4);
        Boliviano bolivianoDos = new Boliviano(5.4);

        assertEquals(new Boliviano(2), bolivianoUno.minus(bolivianoDos));
    }

    @Test
    public void substractionOfTwoValuesShouldBeSafety()
    {
        Boliviano bolivianoUno = new Boliviano(7.23);
        Boliviano bolivianoDos = new Boliviano(5.89);

        assertEquals(new Boliviano(1.34), bolivianoUno.minus(bolivianoDos));
    }

}
