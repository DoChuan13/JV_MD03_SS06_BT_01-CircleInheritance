package shape;

public class Circle {
    private float radius = 1.0f, area;
    private String color;

    public Circle() {
    }

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getArea() {
        return area;
    }

    public void calArea() {
        this.area = (float) (Math.PI * Math.pow(this.radius, 2));
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        calArea();
        return "Circle with " +
                "radius = " + getRadius() +
                ", area = " + getColor() +
                ", and color = '" + getColor() + '\'';
    }
}
