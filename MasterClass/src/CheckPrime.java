public class CheckPrime {
    public static void main (String[] args){
        int count = 0;
        for (int i = 20; i<=40; i++){
            if(isPrime (i)){
                count++;
                System.out.println ("Number " + i + "is a prime number");
                if (count == 3){
                    break;
                }
            }
        }
    }


    public static boolean isPrime(int n){
        if (n==1){
            return false;
        }
        for(int i = 2; i<=n/2; i++){
            if(n%1 == 0){
                return false;
            }
        }
        return true;
    }
}
