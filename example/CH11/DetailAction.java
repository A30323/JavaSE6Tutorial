public enum DetailAction {
    TURN_LEFT, TURN_RIGHT, SHOOT;
 
    public String getDescription() {
        switch(this.ordinal()) {
            case 0:
                return "�V����";
            case 1:
                return "�V�k��";
            case 2:
                return "�g��";
            default:
                return null;
        }
    }
}