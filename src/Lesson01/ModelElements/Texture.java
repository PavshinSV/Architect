package Lesson01.ModelElements;

public class Texture {
    private int sizeX;
    private int sizeY;
    private String path;

    public Texture(int sizeX, int sizeY, String path) {
        this.sizeX = sizeValidator(sizeX);
        this.sizeY = sizeValidator(sizeY);
        this.path = path;
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public String getPath() {
        return path;
    }

    private int sizeValidator(int q){
        if (q>0) {
            return q;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Texture{" +
                "sizeX=" + sizeX +
                ", sizeY=" + sizeY +
                ", path='" + path + '\'' +
                '}';
    }
}
