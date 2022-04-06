public class QuadraticEquation {
    public static void QuadraticEquationProgram () {
        System.out.println("a: 5");
        System.out.println("b: 4");
        System.out.println("c: 3");
        int a = 5;
        int b = 4;
        int c = -3;


        double d = b * b - 4.0 * a * c;
        double r1 = (-b + Math.sqrt(d)) / 2.0 * a;
        double r2 = (-b - Math.sqrt(d)) / 2.0 * a;
        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);

    }
}
