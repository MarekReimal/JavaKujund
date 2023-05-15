import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ShapeData {
    public double sideA;
    public double sideB;
    public static final double MINIMUM = 3;
    public static final double MAXIMUM = 15;
    public double perm;
    public double area;
    public double diagonal;
    public static List<ShapeData> shapeDataList = new ArrayList<>();

    public ShapeData(double sideA) {
        this.sideA = sideA;
        this.sideB = ThreadLocalRandom.current().nextDouble(MINIMUM, MAXIMUM + 1);
        this.perm = (this.sideA + this.sideB) * 2;
        this.area = (this.sideA * this.sideB);
        this.diagonal = Math.sqrt(Math.pow(this.sideA, 2) + Math.pow(this.sideB, 2));
        shapeDataList.add(this); // kirjutab andmeobjekti listi
    }

}