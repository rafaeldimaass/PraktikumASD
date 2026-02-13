public class Percobaan2 {
    public static void main(String[] args) {
        String nim = "254107020051";
        int n = 51;
        for(int i = 1; i <= n; i++) {
            
            if (i == 10 || i == 15) {
                continue;
            } else if (i % 3 == 0) {
                System.out.print("# ");
                continue;
            } else if(i % 2 != 0) {
                System.out.print("* ");
                continue;
            } 
            System.out.print(i + " ");
        }
    }
}
