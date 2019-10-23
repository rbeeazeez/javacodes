public class array {
    public static void main(String[] args) {
        int[] score = {40, 48, 50, 52, 69, 80, 35, 70};
        int sum = 0;
        for(int i : score){
            sum += i;
        }
        System.out.println(sum);
    }
}
