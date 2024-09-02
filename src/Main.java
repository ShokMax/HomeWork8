import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1,2");
        int [] i = new int [3];
        i [0] = 1;
        i [1] = 2;
        i [2] = 3;
        for (int x = 0; x < i.length; x++) {
        System.out.print(i[x]+ ","); }
        System.out.println();
        double [] z = {1.57, 7.654, 9.986};
        for (int w = 0; w < z.length; w++) {
            System.out.print(z[w]+",");}
        System.out.println();
        int [] y = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int t = 0; t < y.length;t++) {
        System.out.print(y[t] + ","); }
        System.out.println();
        System.out.println("Задача 3");
        for (int q = 2; q >= 0; q--) {
            System.out.print(i[q]+",");
        }
        System.out.println();
        for (int a = 2; a >= 0; a--) {
            System.out.print(z[a]+",");
        }
        System.out.println();
        for (int f = 11; f > 0; f--) {
            System.out.print(y[f]+","); }
        System.out.println();
        System.out.println("Задача 4");
        int [] g = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int h = 0; h < g.length; h++) {
            if (h % 2 == 0) {
            g[h]+=1;
            System.out.print(g[h]+ ",");
 } }






        }

}