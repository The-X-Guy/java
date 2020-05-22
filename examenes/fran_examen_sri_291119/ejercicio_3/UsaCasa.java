public class UsaCasa {
    private static Casa[] casa = new Casa[5];
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            casa[i] = new Casa();
            System.out.println(casa[i]);
        }
    }
}