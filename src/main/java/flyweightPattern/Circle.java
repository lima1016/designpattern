package flyweightPattern;
// ConcreteFlyweight에 해당하며 인터페이스(API)의 내용을 정의하고, 필요한 속성을 가질 수 있습니다.
public class Circle implements Shape {
  private String color;
  private int x;
  private int y;
  private int radius;

  public Circle(String color) {
    this.color = color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  @Override
  public void draw() {
    System.out.println("Circle{" +
        "color='" + color + '\'' +
        ", x=" + x +
        ", y=" + y +
        ", radius=" + radius +
        '}');
  }
}
