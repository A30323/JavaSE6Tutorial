public class HollowCircle extends AbstractCircle {
    public HollowCircle() {}

    public HollowCircle(double radius) {
        this.radius = radius;
    }

    public void render() {
        System.out.printf("�e�@�ӥb�| %f ���Ť߶�\n", getRadius());
    }
}