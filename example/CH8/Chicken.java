public class Chicken extends Bird { // �X�RBird���O
    private String crest; // �s�W�p�������A���a�y�z

    public Chicken() {
        super();
    }

    // �w�q�غc��k
    public Chicken(String name, String crest) {
        super(name);
        this.crest = crest;
    }

    // �s�W��k
    public void setCrest(String crest) {
        this.crest = crest;
    }

    public String getCrest() {
        return crest;
    }

    public void wu() {
       System.out.println("�B�B�s�K");
    }
}