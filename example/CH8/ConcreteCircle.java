public class ConcreteCircle extends AbstractCircle {
    public ConcreteCircle() {}

    public ConcreteCircle(double radius) {
        this.radius = radius;
    }

    public void render() {
        System.out.printf("�e�@�ӥb�| %f ����߶�\n", getRadius());
    }
}