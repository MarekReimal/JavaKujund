public class KujundMain {
    public KujundMain() { // kontroller
        View view = new View(); // loob view objekti
        Controller controller = new Controller(view); // loob controller objekti
        controller.run();  // käivitab prog
    }

    public static void main(String[] args) {
        new KujundMain(); // Objekt loodud?

    }
}
