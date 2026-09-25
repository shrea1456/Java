//Arithmetic Operations on Complex Numbers

class Complex {
    double real;
    double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static Complex add(Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real, c1.imaginary + c2.imaginary);
    }

    public void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + (-imaginary) + "i");
        }
    }
}

public class ComplexDemo {
    public static void main(String[] args) {
        Complex c1 = new Complex(4.5, 3.2);
        Complex c2 = new Complex(1.5, 2.8);

        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        Complex result = Complex.add(c1, c2);
        System.out.print("Sum: ");
        result.display();
    }
}