public enum MoreAction implements IDescription {
    TURN_LEFT {
        // ��@�����W����k
        public String getDescription() {
            return "�V����";
        }
    },  // �O�o�o�䪺�C�|�Ȥ��j�ϥ� ,
 
    TURN_RIGHT {
        // ��@�����W����k
        public String getDescription() {
            return "�V�k��";
        }
    }, // �O�o�o�䪺�C�|�Ȥ��j�ϥ� ,
 
    SHOOT {
        // ��@�����W����k
        public String getDescription() {
            return "�g��";
        }
    }; // �O�o�o�䪺�C�|�ȵ����ϥ� ;
}