package shape;

public class Cylinder extends Circle {
    private float height, volume;

    public Cylinder() {
    }

    public Cylinder(float radius, String color, float height) {
        super(radius, color);
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getVolume() {
        return volume;
    }

    public void calVolume() {
        super.calArea();
        this.volume = this.height * super.getArea();
    }

    @Override
    public String toString() {
        calVolume();
        return "Cylinder with " + "height=" + getHeight() +
                ", volume = " + getVolume() +
                ", radius = " + super.getRadius() +
                ", color = '" + super.getColor() + '\'';
    }
}
