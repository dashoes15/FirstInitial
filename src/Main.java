public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (j == 0 || j == 6 || (i == 0 && j < 6) || (i == 6 && j < 6)) {
                    System.out.print("* ");
                } else if (j ==1 || j ==5) {
                    System.out.print(" ");
                } else if (j ==2 || j == 4){
                    System.out.print("   ");
                }else if (j ==3){
                    System.out.print("    ");
                }
            } System.out.println(); }
    }
}