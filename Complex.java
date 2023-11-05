package a3;


public final class Complex {
	
	double re, im;
	
	/*
	 * Initializes this complex number to (0 + 0i).
	 */
	public Complex() {
		re = 0.0;
		im = 0.0;
	}
	
	/*
	 * Initializes this complex number so that it has the same real and imaginary parts 
	 * as another complex number.
	 * 
	 * Parameters: other - the complex number to copy
	 */
	public Complex(Complex other) {
		re = other.re;
		im = other.im;
	}
	
	/*
	 * Initializes this complex number so that it has the given real and imaginary components.
	 * 
	 * Parameters:
	 * 		re - the real part of the complex number
	 * 		im - the imaginary part of the complex number
	 */
	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}
	
	/*
	 * A static factory method that returns a new complex number whose real part 
	 * is equal to re and whose imaginary part is equal to 0.0
	 * 
	 * Parameters: re - the desired real part of the complex number
	 * 
	 * Returns:
	 * 		a new complex number whose real part is equal to re and whose 
	 * 		imaginary part is equal to 0.0
	 */
	public static Complex real(double re) {
		Complex realComplex = new Complex(re, 0.0);
		return realComplex;
	}

	/*
	 * A static factory method that returns a new complex number whose real part is 
	 * equal to 0.0 and whose imaginary part is equal to im.
	 * 
	 * Parameters: im - the desired imaginary part of the complex number
	 * 
	 * Returns: a new complex number whose real part is equal to 0.0 and whose 
	 * imaginary part is equal to im
	 */
	public static Complex imag(double im) {
		Complex imagComplex = new Complex(0.0, im);
		return imagComplex;
	}
	
	/*
	 * Gets the real part of this complex number.
	 * 
	 * Returns: the real part of this complex number
	 */
	public double re() {
		return this.re;
	}
	
	/*
	 * Gets the imaginary part of the complex number.
	 * 
	 * Returns: the imaginary part of this complex number
	 */
	public double im() {
		return this.im;
	}
	
	/*
	 * Sets the real part of this complex number.
	 * 
	 * Parameters: val - the value to set the real part of this complex number to
	 */
	public void re(double val) {
		this.re = val;
	}
	
	/*
	 * Sets the imaginary part of this complex number.
	 * 
	 * Parameters: val - the value to set the imaginary part of this complex number to
	 */
	public void im(double val) {
		this.im = val;
	}
	
	/*
	 * Adds this complex number and another complex number to obtain a new complex number. 
	 * Neither this complex number nor c is changed by this method.
	 * 
	 * Parameters: c - The complex number to add to this complex number
	 * 
	 * Returns: a new complex number equal to the sum of this complex number and c
	 */
	public Complex add(Complex c) {
		Complex result = new Complex(0.0, 0.0);
		result.re = this.re + c.re;
		result.im = this.im + c.im;
		return result;
	}
	
	/*
	 * Multiplies this complex number with another complex number to obtain a new complex number.
	 *  
	 * Parameters: c - The complex number to multiply by
	 * 
	 * Returns: a new complex number equal to this complex number multiplied by c
	 */
	public Complex multiply(Complex c) {
		Complex multiplyResult = new Complex(0.0, 0.0);
		multiplyResult.re = (this.re * c.re) - (this.im * c.im);
		multiplyResult.im = (this.re * c.im) + (this.im * c.re);
		
		return multiplyResult;
	}

	/*
	 * Compute the magnitude of this complex number without intermediate 
	 * underflow or underflow. 
	 * 
	 * Returns: the magnitude of this complex number
	 */
	public double mag() {
	     double x = this.re;
	     double y = this.im;
	     return Math.hypot(x, y);
	}
	
	/*
	 * Returns a string representation of this complex number.
	 * 
	 * Returns: a string representation of this complex number
	 */
	public String toString() {
		String result = "";
		
		if (this.im >= 0) {
			String reStr = Double.toString(this.re);
			Double imNum = Math.abs(this.im);
			String imStr = Double.toString(imNum);
			result = reStr + " + " + imStr + "i";
		}
		
		else {
			String reStr = Double.toString(this.re);
			Double imNum = Math.abs(this.im);
			String imStr = Double.toString(imNum);
			result = reStr + " - " + imStr + "i";
		}
		
		return result;
	}
	
	
}
