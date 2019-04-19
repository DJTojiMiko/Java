public class Fraction {
    private int whole;
    private int numerator;
    private int denominator;


    // Create a paramaterless constructor, which sets
    // the whole number and numerator to 0 and the denominator to 1.
    public Fraction(){
        whole = 0;
        numerator = 0;
        denominator = 1;
    }
    
    // Create a constructor that accepts two parameters
    // for the numerator and denominator. When the constructor
    // is used, the whole number value is 0.
    public Fraction(int numerator, int denominator){
        whole = 0;
        this.numerator = (denominator < 0 ? -numerator : numerator);
        if (denominator == 0) {
            this.denominator = 1;
        }
        this.denominator = (denominator < 0 ? -denominator : denominator);
    }
    // Create a constructor that accepts three parameters
    // for the whole number, numerator, and denominator.
    public Fraction(int whole, int numerator, int denominator){
        this.whole=whole;
        this.numerator=numerator;
        this.denominator=denominator;
    }
    public void setWhole(int whole){
        this.whole=whole;
    }
    public int getWhole(){
        return whole;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getNumerator() {
        return numerator;
    }
    public void setDenominator(int denominator) {
        if (denominator > 0) {
            this.denominator = denominator;
        }
        else if (denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -denominator;
        }
    }
    public int getDenominator() {
        return denominator;
    }
    // This calculates greatest common divisor (GCD)
    // I expect that you will find it useful
    int gcd(int a, int b){
        if( b == 0 )
            return a;
        return gcd(b,a%b);
    }
    // Reduces the Fraction value to the lowest possible denominator
    // example 72/20 should be reduced to 18/5, which is also 3 3/5.
    public void reduce(){
        int reducer = gcd(numerator,denominator);
        if (reducer < 0){
            reducer = -reducer;
        }
        numerator = numerator/reducer;
        denominator = denominator/reducer;
        if (numerator>denominator){
            whole = numerator/denominator;
            numerator = numerator % denominator;
        }
    }

    // Add the current Fraction to Fraction A, return the result as a new Fraction (reduced, of course)
    public Fraction add(Fraction A){
        int numerator2 = A.getNumerator();
        int denominator2 = A.getDenominator();
        int numerator3 = numerator * denominator2 + numerator2 * denominator;
        int denominator3 = denominator * denominator2;
        Fraction result = new Fraction(numerator3, denominator3);
        result.reduce();
        return result;
    }

    // Fraction C = this - A;
    // Subtract the current Fraction Fraction A, return the result as a new Fraction (reduced, of course)
    public Fraction substract(Fraction A){
        int numerator2 = A.getNumerator();
        int denominator2 = A.getDenominator();
        int numerator3 = numerator * denominator2 - numerator2 * denominator;
        int denominator3 = denominator * denominator2;
        Fraction result = new Fraction(numerator3, denominator3);
        result.reduce();
        return result;
    }

    // Multiply the current Fraction to Fraction A, return the result as a new Fraction (reduced, of course)
    public Fraction multiply(Fraction A){
        int numerator2 = A.getNumerator();
        int denominator2 = A.getDenominator();
        int numerator3 = numerator * numerator2;
        int denominator3 = denominator * denominator2;
        Fraction result = new Fraction(numerator3, denominator3);
        result.reduce();
        return result;
    }

    // Divide Fractions (this/A), return the result as a new Fraction (reduced, of course)
    // You may assume that A will be a non-zero value
    public Fraction divide(Fraction A){
        int numerator2 = A.getNumerator();
        int denominator2 = A.getDenominator();
        int numerator3 = numerator * denominator2;
        int denominator3 = denominator * numerator2;
        Fraction result = new Fraction(numerator3, denominator3);
        result.reduce();
        return result;
    }

    // raturns a string that contains a fraction in the format:
    // whole number, a space, the numerator, a slash (/), and a denominator (e.g: 2 3/4).
    // When the whole number is 0, just display the fraction part (e.g: 1/2 instead of 0 1/2.
    // When the numerator is 0, just display the whole number (e.g: 2 instead of 2 0/3).
    // Also, just display 3 instead of 3/1.
    public String toString(){
        String fractionstring = "";
        if (whole == 0){
            String numstring = String.valueOf(numerator);
            String denstring = String.valueOf(denominator);
            fractionstring = numstring + " / " + denstring;
            
        }
        if (numerator == 0){
            String wholestring = String.valueOf(whole);
            fractionstring = wholestring;
            
        }
        if (numerator > denominator && denominator==1){
            String numstring = String.valueOf(numerator);
            fractionstring = numstring;
            
        }
        else{
            String numstring = String.valueOf(numerator);
            String denstring = String.valueOf(denominator);
            String wholestring = String.valueOf(whole);
        }
        return fractionstring;
    }
}