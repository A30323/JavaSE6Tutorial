public class ExtendDemo { 
    public static void main(String[] args) {
        Chicken chicken1 = new Chicken("�p�J", "����p���a");
        Chicken chicken2 = new Chicken();
 
        System.out.printf("�p��1 - �W�� %s, ���a�O %s�C \n", 
            chicken1.getName(), chicken1.getCrest());
        chicken1.wu();

        System.out.printf("�p��2 - �W�� %s, ���a�O %s�C \n", 
            chicken2.getName(), chicken2.getCrest());
        chicken2.wu();
    } 
}