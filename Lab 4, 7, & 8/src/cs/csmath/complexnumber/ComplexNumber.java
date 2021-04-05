package cs.csmath.complexnumber;


/**
 * The Complex Number class provides a data type for using complex numbers 
 * within a Java program.
 *  * 
 * @author S. Sigman
 * @version 1.0 (Feb 14, 2017)
 *
 */ 
public class ComplexNumber {

	/** 
	 * The real part of the complex number.
	 */
	private double realPart;
	
	/** 
	 * The imaginary part of the complex number.
	 */
	private double imagPart;
	
	// Constructors
	
	/**
	 * This constructor initializes a complex number with the
	 * specified real and imaginary parts.
	 * 
	 * @param realP The real part of the complex number.
	 * @param imagP The imaginary part of the complex number.
	 */
	public ComplexNumber(double realP, double imagP)
	{
		// TO DO: Initialize realPart to realP and imagPart
		//        to imageP.
		this.realPart = realP;
		this.imagPart = imagP;
	}
	
	/**
     * Constructs the complex number 0.0 + 0.0i.
     */
	public ComplexNumber() {
		this.realPart = 0.0;
		this.imagPart = 0.0;
	    // TO DO: Set the complex number to 0 + 0i.
		// HINT: You can do this by calling the previous
		//       constructor using the this key word in place
		//       of the actual constructor name.
	}

    // Query Methods (getters and setters)
    
	// TO DO: Generate getter and setter methods for the
	//        instance variables realPart and imagPart.
	// HINT:  Use IntelliJ to do this.  See the
	//        Refactor/Encapsulate Fields menu.

	// Arithmetic Methods
	
	/**
     * This method adds the complex number otherCN to the
     * value of the current instance and replaces the value
     * of the instance with the sum.
     *  
     * @param otherCN The complex number to add.
     */
    public void add(ComplexNumber otherCN) {
		this.realPart = this.realPart + otherCN.realPart;
		this.imagPart = this.imagPart + otherCN.imagPart;
        // TO DO: Complete this method
    }


    /**
     * This method subtracts the complex number otherCN
     * from the current instance and replaces the value of 
     * the current instance with the difference.
     * 
     * @param otherCN The complex number to subtract.
     */
    public void sub(ComplexNumber otherCN) {
    	this.realPart = this.realPart - otherCN.realPart;
        this.imagPart = this.imagPart - otherCN.imagPart;
    }

    /**
     * This method multiplies the current complex number by 
     * the complex number otherCN and replaces the current
     * complex number with the product.
     * 
     * @param otherCN The complex number to multiply by.
     */
    public void mult(ComplexNumber otherCN) {
    	double temp = (this.realPart * otherCN.realPart) - (this.imagPart * otherCN.imagPart);
    	this.imagPart = (this.imagPart * otherCN.realPart) + (this.realPart * otherCN.imagPart);
    	this.realPart = temp;
        // TO DO: Implement complex number multiplication
    }

    /**
     * This method divides the current complex number by 
     * the complex number otherCN and replaces the current
     * complex number with the quotient.
     * 
     * @param otherCN The divisor to use.
     */
    public void div(ComplexNumber otherCN) {
    	double temp = (this.realPart * otherCN.realPart + this.imagPart * otherCN.imagPart) / (Math.pow(otherCN.realPart, 2) + Math.pow(otherCN.imagPart, 2));
    	this.imagPart = ((this.imagPart * otherCN.realPart) - (this.realPart * (otherCN.imagPart))) / (Math.pow(otherCN.realPart, 2) + Math.pow(otherCN.imagPart, 2));
		this.realPart = temp;
		// Implement this method next week.
    }

    
    /**
     * This method returns the conjugate of an instance of a
     * complex number.
     * 
     * @return The conjugate of this instance.
     */
    public ComplexNumber conj() {
    	this.imagPart = -1 * this.imagPart;
    	//TO DO: Implement the conjugate operation.
        return new ComplexNumber(this.realPart, -1 * this.imagPart);
    }
    
    /**
     * This method returns the absolute value of the this 
     * complex number.  The value returned is:
     * square_root(realPart^2 + imagPart^2)
     * 
     * @return The absolute value of this complex number.
     */
    public double abs() {
    	double realSqrd = (this.realPart * this.realPart);
    	double imgsqrd = (this.imagPart * this.imagPart);
    	// TO DO: Implement the absolute value operation.
        return Math.sqrt(realSqrd + imgsqrd);
    }

	public double getRealPart() {
		return this.realPart;
	}

    public double getImagPart() {
    	return this.imagPart;
	}

	public double setImagPart(double dub) {
    	this.imagPart = dub;
    	return this.imagPart;
	}

	public double setRealPart(double dub) {
		this.realPart = dub;
		return this.realPart;
	}


    /** 
	 * This method returns the complex number as a
	 * string formatted as:
	 *    realPart +/- imagPart i
	 * where the appropriate sign is placed before the imagPart
	 * of the number.  No space is placed before the i.
	 * 
     * @return A string representation of the complex number is returned.
     */
    public String toString() {
    	String sign = "+";
    	if (this.imagPart<0)
    		sign = "-";
    	return "" + this.realPart + sign + Math.abs(this.imagPart) + "i";
    }

    public static void main(String [] args) {
    	ComplexNumber c1 = new ComplexNumber(2.0, 3.1);
    	ComplexNumber c2 = new ComplexNumber(3.0, -3.1);
    	c1.add(c2);
    	System.out.println(c1);
		ComplexNumber c3 = new ComplexNumber(3.14, 2.5);
		ComplexNumber c4 = new ComplexNumber(0.0, 0.0);
    	c3.sub(c4);
    	System.out.println(c3);
		ComplexNumber c5 = new ComplexNumber(2.1, 3.1);
		ComplexNumber c6 = new ComplexNumber(0.5, -0.5);
		c5.mult(c6);
		System.out.println(c5);
		ComplexNumber c7 = new ComplexNumber(2.1, 3.1);
		ComplexNumber c8 = new ComplexNumber(0.0, 0.0);
		c7.mult(c8);
		System.out.println(c7);
		ComplexNumber c9 = new ComplexNumber(1.0, 0.0);
		System.out.println(c9.abs());
		ComplexNumber c10 = new ComplexNumber(1.0, 1.0);
		System.out.println(c10.abs());
		ComplexNumber c11 = new ComplexNumber(2.1, 3.2);
		c11.conj();
		System.out.println(c11);
		ComplexNumber c12 = new ComplexNumber(2.1, -3.2);
		c12.conj();
		System.out.println(c12);



	}
}