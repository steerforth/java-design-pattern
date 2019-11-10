public class Main {

    public static void main(String[] args) {
        byte[] a = new byte[]{0x32,0x30,0x30,0x31,0x36,0x30,0x34,0x35,0x45,0x30,0x30,0x32,0x31,0x30};
        int sum = 0;
        for (int i = 0; i <a.length ; i++) {
            sum += a[i];
        }
        System.out.println(sum);
        System.out.println(0xFFFF-(sum & 0xFFFF)+1);


        byte[] b = new byte[]{0x32,0x30,0x30,0x36};
        int sum2 = 0;
        for (int i = 0; i < b.length; i++) {
            sum2 += b[i];
        }
        System.out.println(sum2);
        System.out.println(0xFF-(sum2 & 0xFF) +1);
    }
}
