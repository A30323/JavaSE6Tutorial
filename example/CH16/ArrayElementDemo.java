package onlyfun.caterpillar;

public class ArrayElementDemo {
    public static void main(String[] args) {
        short[] sArr = new short[5];
        int[] iArr = new int[5];
        long[] lArr = new long[5];
        float[] fArr = new float[5];
        double[] dArr = new double[5];
        byte[] bArr = new byte[5];
        boolean[] zArr = new boolean[5];
        String[] strArr = new String[5];

        System.out.println("short �}�C���O�G" + sArr.getClass());
        System.out.println("int �}�C���O�G" + iArr.getClass());
        System.out.println("long �}�C���O�G" + lArr.getClass());
        System.out.println("float �}�C���O�G" + fArr.getClass());
        System.out.println("double �}�C���O�G" + dArr.getClass());
        System.out.println("byte �}�C���O�G" + bArr.getClass());
        System.out.println("boolean �}�C���O�G" + zArr.getClass());
        System.out.println("String �}�C���O�G" + strArr.getClass());
    }
}