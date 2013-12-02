public class CloneDemo {
    public static void main(String[] args) 
                         throws CloneNotSupportedException {
        Table table = new Table();
        table.setCenter(new Point(2, 3));
        Point originalCenter = table.getCenter();

        Table clonedTable = (Table) table.clone();
        Point clonedCenter = clonedTable.getCenter();

        System.out.printf("��Ӫ�Table���ߡG(%d, %d)\n", 
           originalCenter.getX(), originalCenter.getY());
        System.out.printf("�ƻs��Table���ߡG(%d, %d)\n", 
           clonedCenter.getX(), clonedCenter.getY());

        clonedCenter.setX(10);
        clonedCenter.setY(10);

        // ���ܽƻs�~�����e�A���Ӫ����󤣷|���v�T
        System.out.printf("��Ӫ�Table���ߡG(%d, %d)\n", 
           originalCenter.getX(), originalCenter.getY());
        System.out.printf("�ƻs��Table���ߡG(%d, %d)\n", 
           clonedCenter.getX(), clonedCenter.getY());
    }
}