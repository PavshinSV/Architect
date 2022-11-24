package Lesson01.ModelElements.Objects;

public class Color {
    private short r;
    private short g;
    private short b;

    public Color(short r, short g, short b) {
        this.r = colorValidator(r);
        this.g = colorValidator(g);
        this.b = colorValidator(b);
    }

    public Color(){
        this.r = 0;
        this.g = 0;
        this.b = 0;
    }

    public short getR() {
        return r;
    }

    public void setR(short r) {
        this.r = colorValidator(r);
    }

    public short getG() {
        return g;
    }

    public void setG(short g) {
        this.g = colorValidator(g);
    }

    public short getB() {
        return b;
    }

    public void setB(short b) {
        this.b = colorValidator(b);
    }

    private short colorValidator(short x) {
        if (x >= 0 && x < 256) {
            return x;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Color{" +
                "r=" + r +
                ", g=" + g +
                ", b=" + b +
                '}';
    }
}
