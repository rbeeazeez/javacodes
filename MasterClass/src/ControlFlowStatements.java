public class ControlFlowStatements {
    public static void main(String[] args){

        int switchValue = 5;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was a 3, 4 or 5");
                System.out.println("Actually, it was a " + switchValue);
            default:
                System.out.println("Value was neither 1 or 2");
                 break;
        }
        char myAlphabet = 'A';
        switch (myAlphabet) {
            case 'A':
                System.out.println("It was an A");
                break;
            case 'B':
                System.out.println("It was a B");
                break;
            case 'C':
                System.out.println("It was a C");
                break;
            case 'D':
                System.out.println("It was a D");
                break;
            case 'E':
                System.out.println("It was an E");
                break;
            default:
                System.out.println("It was neither A, B, C, D or E");
        }
        String month = "January";
        switch (month){
            case "January":
                System.out.println("Jan");
                break;
            case "February":
                System.out.println("feb");
                break;
            default:
                System.out.println("Not sure");
        }
    }

}
