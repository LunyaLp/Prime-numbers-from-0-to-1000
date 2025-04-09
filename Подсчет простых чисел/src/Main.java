
public class Main {
    public static void main(String[] args) {
        int ProstieChisla100=0,ProstieChisla1000=0;
        for (int i=2;i<=100;i++){
            int k=0;
            for (int j = 2; j<=(i / 2); j++){
                if (i%j==0) k++;
                if (k>0) break;
            }
            if (k==0) {
                ProstieChisla100++;
            }
        }

        for (int i=100;i<=1000;i++){
            int k=0;
            for (int j = 2; j<=(i / 2); j++){
                if (i%j==0) k++;
                if (k>0) break;
            }
            if (k==0) ProstieChisla1000++;
        }

        if (ProstieChisla100>ProstieChisla1000) System.out.println("от 0 до 100 больше простых чисел, чем от 100 до 1000");
        else System.out.println("от 100 до 1000 больше простых чисел, чем от 0 до 100");
    }
}