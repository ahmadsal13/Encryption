public class App {
    public static void main(String[] args) throws Exception {

        int key = 6;

        String text = "Nk⌂&nu}&oy&oz&ngtmotmE";

        System.out.println(text);

        char[] chars = text.toCharArray();

        for (char c : chars) {
            c -= key;
            System.out.print(c);
        }
    }
}
