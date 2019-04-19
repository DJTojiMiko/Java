public class Discriminant {
    public static void main(String[] args){
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);
        double d = Double.parseDouble(args[2]);

        double disc = (b*b*c*c) - (4*c*c*c) - (4*b*b*b*d) - (27*d*d) + (18*b*c*d);

        System.out.printf("The discriminant of the polynomial x^3 + %.2fx^2 + %.2fx + %.2f is %.2f", b,c,d,disc);
    }
}