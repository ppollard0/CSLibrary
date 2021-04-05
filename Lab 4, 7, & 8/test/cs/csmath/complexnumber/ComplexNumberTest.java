package cs.csmath.complexnumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexNumberTest {

    @Test
    public void add() {
    }

    @Test
    public void sub() {
    }

    @Test
    public void mult() {
    }

    @Test
    public void div() {
    }

    @Test
    public void conj() {
    }

    @Test
    public void abs() {
    }

    @Test
    public void testToString() {
    }

    @Test
    public void main() {
    }

    @Test
    public void getImagPart() {
        ComplexNumber cn = new ComplexNumber(1.7,-3.3);
        assertEquals("Test getImagePart returns -3.3",-3.3,cn.getImagPart(),0.0);
    }

    @Test
    public void getRealPart() {
        ComplexNumber cn = new ComplexNumber(1.7,-3.3);
        assertEquals("Test getRealPart returns 1.7",1.7,cn.getRealPart(),0.0);
    }

    @Test
    public void setImagPart() {
        ComplexNumber cn = new ComplexNumber(2.6, 5.3);
        assertEquals("Test setImagPart returns 3.5", 3.5,cn.setImagPart(3.5), 0.0);
    }

    @Test
    public void setRealPart() {
        ComplexNumber cn = new ComplexNumber(2.6, 5.3);
        assertEquals("Test setRealPart returns 6.7", 6.7,cn.setRealPart(6.7), 0.0);
    }

    @Test
    public void math1() {
        ComplexNumber cn1 = new ComplexNumber(2.1, 3.1);
        ComplexNumber cn2 = new ComplexNumber(0.5, -0.5);
        cn1.mult(cn2);
        assertEquals("Test mult  returns 2.6", 2.6, cn1.getRealPart(), 0.0);
        assertEquals("Test mult returns 0.5", 0.5,cn1.getImagPart(), 0.0);
    }

    @Test
    public void mult2() {
        ComplexNumber cn1 = new ComplexNumber(2.1, 3.1);
        ComplexNumber cn2 = new ComplexNumber(0.0, 0.0);
        cn1.mult(cn2);
        assertEquals("Test mult returns 0.0", 0.0,cn1.getRealPart(), 0.0);
        assertEquals("Test mult returns 0.0", 0.0,cn1.getImagPart(), 0.0);
    }

    @Test
    public void mult3() {
        ComplexNumber cn1 = new ComplexNumber(2.1, 3.1);
        ComplexNumber cn2 = new ComplexNumber(1.0, 1.0);
        cn1.mult(cn2);
        assertEquals("Test mult returns -1", -1,cn1.getRealPart(), 0.0);
        assertEquals("Test mult returns 5.2", 5.2,cn1.getImagPart(), 0.0);
    }

    @Test
    public void mult4() {
        ComplexNumber cn1 = new ComplexNumber(2.1, 3.1);
        ComplexNumber cn2 = new ComplexNumber(3.1, 3.1);
        cn1.mult(cn2);
        assertEquals("Test mult returns -3.1", -3.1000000000000005,cn1.getRealPart(), 0.0);
        assertEquals("Test mult returns 16.12", 16.12,cn1.getImagPart(), 0.0);
    }

    @Test
    public void div1() {
        ComplexNumber cn1 = new ComplexNumber(2.1, 3.1);
        ComplexNumber cn2 = new ComplexNumber(0.5, -0.5);
        assertEquals("Test div  returns -1", 2.1, cn1.getRealPart(), 0.0);
        cn1.div(cn2);
        assertEquals("Test div  returns -1", -1, cn1.getRealPart(), 0.0);
        assertEquals("Test div returns 5.2", 5.2, cn1.getImagPart(), 0.0);
    }

    @Test
    public void div2() {
        ComplexNumber cn1 = new ComplexNumber(2.1, 3.1);
        ComplexNumber cn2 = new ComplexNumber(0.0, 0.0);
        cn1.div(cn2);
        assertEquals("Test div returns 0.0", 0.0,cn1.getRealPart(), 0.0);
        assertEquals("Test div returns 0.0", 0.0,cn1.getImagPart(), 0.0);
    }

    @Test
    public void div3() {
        ComplexNumber cn1 = new ComplexNumber(2.1, 3.1);
        ComplexNumber cn2 = new ComplexNumber(1.0, 1.0);
        cn1.div(cn2);
        assertEquals("Test div returns 2.6", 2.6,cn1.getRealPart(), 0.0);
        assertEquals("Test div returns 0.5", 0.5,cn1.getImagPart(), 0.0);
    }

    @Test
    public void div4() {
        ComplexNumber cn1 = new ComplexNumber(2.1, 3.1);
        ComplexNumber cn2 = new ComplexNumber(3.1, 3.1);
        cn1.div(cn2);
        assertEquals("Test div returns -3.1",  0.8387096774193548, cn1.getRealPart(), 0.0);
        assertEquals("Test div returns 16.12", 0.16129032258064516, cn1.getImagPart(), 0.0);
    }

}