public enum DetailAction2 {
    TURN_LEFT("�V����"), TURN_RIGHT("�V�k��"), SHOOT("�g��");
 
    private String description;
 
    // �����}���غc��k
    private DetailAction2(String description) {
        this.description = description;
    }
 
    public String getDescription() {
        return description;
    }
}