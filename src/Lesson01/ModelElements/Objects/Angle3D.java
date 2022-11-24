package Lesson01.ModelElements.Objects;

public class Angle3D {
    private short horizontalAngle;
    private short VerticalAngle;

    public Angle3D(short horizontalAngle, short verticalAngle) {
        this.horizontalAngle = angleValidator(horizontalAngle);
        this.VerticalAngle = angleValidator(verticalAngle);
    }

    public Angle3D() {
        this.horizontalAngle = 0;
        this.VerticalAngle = 0;
    }

    public short getHorizontalAngle() {
        return horizontalAngle;
    }

    public void setHorizontalAngle(short horizontalAngle) {
        this.horizontalAngle = angleValidator(horizontalAngle);
    }

    public short getVerticalAngle() {
        return VerticalAngle;
    }

    public void setVerticalAngle(short verticalAngle) {
        VerticalAngle = angleValidator(verticalAngle);
    }

    private short angleValidator(short x){
        if (x>=0&&x<360) {
            return x;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Angle3D{" +
                "horizontalAngle=" + horizontalAngle +
                ", VerticalAngle=" + VerticalAngle +
                '}';
    }
}
