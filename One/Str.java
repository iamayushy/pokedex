public class Str {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 7};
        System.out.println(convertToStr(num));

    }
    public static String convertToStr(int[] box){
        String  ans = "" + box[0];
        for (int i = 1; i < box.length; i++) {
            ans += ", "+ box[i];
        }
        return "["+ ans +"]";
    }
}
