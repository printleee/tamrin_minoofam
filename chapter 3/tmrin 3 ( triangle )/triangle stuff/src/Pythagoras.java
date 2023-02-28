public class Pythagoras {
    private double side1, side2, hypotenuse;

    public Pythagoras(double m, double n) {
        side1 = Math.pow(m, 2) - Math.pow(n, 2);
        side1 = Math.abs(side1);
        side2 = 2 * m * n;
        hypotenuse = Math.pow(m, 2) + Math.pow(n, 2);
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }
}