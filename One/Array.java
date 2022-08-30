public class Array {
    public static void main(String[] args) {
        String[] crushes = {"Khushboo", "Khushi", "Riya"};
        int[] crushAtAge = {16, 20, 18};
        for(int i = 0; i < crushAtAge.length; i++){
            switch (crushes[i]) {
                case "Khushboo":
                    System.out.println("Crush on "+ crushes[i] +" at age "+crushAtAge[i]);
                    break;
                case "Khushi":
                    System.out.println("Crush on "+ crushes[i] +" at age "+crushAtAge[i]);
                    break;
                case "Riya":
                    System.out.println("Crush on "+ crushes[i] +" at age "+crushAtAge[i]);
                    break;

                default:
                    System.out.println("Will Be Upadted Soon");
            }
        }
    }
}
