public class Wood {
    private int base;
    private int height;

    public Wood(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getBase() {
        return base;
    }

    public int getCrossSectionalArea() {
        return base*height;
    }

    public double getMomentOfIntertia() {
        return (base * height * height * height) / 12;
    }

    public double getSectionModules() {
        return (base * height * height) / 6;
    }
}