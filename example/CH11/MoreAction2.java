public enum MoreAction2 {
    TURN_LEFT {
        // ��@��H��k
        public String getDescription() {
            return "�V����";
        }
    },  // �O�o�o�䪺�C�|�Ȥ��j�ϥ� ,
 
    TURN_RIGHT {
        // ��@��H��k
        public String getDescription() {
            return "�V�k��";
        }
    }, // �O�o�o�䪺�C�|�Ȥ��j�ϥ� ,
 
    SHOOT {
        // ��@��H��k
        public String getDescription() {
            return "�g��";
        }
    }; // �O�o�o�䪺�C�|�ȵ����ϥ� ;

    // �ŧi�ө�H��k
    public abstract String getDescription();
}