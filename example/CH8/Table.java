public class Table implements Cloneable {
    private Point center;

    public void setCenter(Point center) {
        this.center = center;
    }
    public Point getCenter() {
        return center;
    }

    public Object clone () 
                     throws CloneNotSupportedException {
        // �I�s������clone()�ӽƻs
        Table table = (Table) super.clone();

        if(this.center != null) {
            // �ƻsPoint��������Ʀ���
            table.center = (Point) center.clone(); 
        }
        
        return table; 
    }
}