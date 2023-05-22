import java.util.Scanner;

public class View {
    private static final Scanner scanner= new Scanner(System.in); // lugemise jaoks input

    public void showInfo(){
        //System.out.println("Saab arvutada ühe või mitme ristküliku andmed");
        System.out.println("Kasutaja sisestab ühe külje, teine külg on juhuslik vahemikus " +
                ShapeData.MINIMUM + " - " + ShapeData.MAXIMUM );

    }
    public String ask(){
        System.out.println("Sisesta külg A"); //, lõpetamiseks vajuta s");
        String sideA = scanner.nextLine();
        return sideA;

    }
    public void showData() {
        int i = 0; // järjekorra number
        for (ShapeData p : ShapeData.shapeDataList) {
            i += 1; // jnr kasvab
                // esimene variant printf formindab 1 koht peale koma
//            System.out.printf("%s. ristküliku külg a = %.1f; külg b = %.1f; P = %.1f; S = %.1f; D = %.1f\n",
//            i, p.sideA, p.sideB, p.perm, p.area, p.diagonal); // %d int vorm, %.1f murd 1 koht peale koma
            System.out.printf("Ristküliku parameetrid on järgmised:%nkülg a = %f; külg b = %f; P = %f; S = %.1f; D = %f\n",
                    p.sideA, p.sideB, p.perm, p.area, p.diagonal); // %d int vorm, %.1f murd 1 koht peale koma
        }
    }
}
