import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTests {
    @Test
    public void Dalton(){
        assertEquals(0, DaltonConverter.convert(0), 0.001);
    }
    @Test
    public void Fahrenheit(){
        assertEquals(32, FahrenheitConverter.convert(0), 0.001);
    }
    @Test
    public void Gelil(){
        assertEquals(150.0, GelilConverter.convert(0), 0.001);
    }
    @Test
    public void Hook(){
        assertEquals(0, HookConverter.convert(0), 0.001);
    }
    @Test
    public void Kelvin(){
        assertEquals(-273.15, KelvinConverter.convert(0), 0.001);
    }
    @Test
    public void Leiden(){
        assertEquals(253.0, LeidenConverter.convert(0), 0.001);
    }
    @Test
    public void Newton(){
        assertEquals(0, NewtonConverter.convert(0), 0.001);
    }
    @Test
    public void Planckian(){
        assertEquals(-3.869945496E34, PlanckianConverter.convert(0), 0.001);
    }
    @Test
    public void Rankin(){
        assertEquals(-151.74999999999997, RankinConverter.convert(0), 0.001);
    }
    @Test
    public void Reaumur(){
        assertEquals(0, ReaumurConverter.convert(0), 0.001);
    }
    @Test
    public void Remer(){
        assertEquals(7.5, RemerConverter.convert(0), 0.001);
    }
}