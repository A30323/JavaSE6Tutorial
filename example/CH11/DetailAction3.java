public enum DetailAction3 implements IDescription {
    TURN_LEFT("�V����"), TURN_RIGHT("�V�k��"), SHOOT("�g��");
 
    private String description;
 
    // �����}���غc��k
    private DetailAction3(String description) {
        this.description = description;
    }
 
    public String getDescription() {
        return description;
    }
}