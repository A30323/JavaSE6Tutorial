public class MathTool {
    public static int sum(int... nums) { // �ϥ�...�ŧi�Ѽ�
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum;
    }
}