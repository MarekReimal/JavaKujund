public class Controller {
    public View view;
    public boolean s = false; // kontroller kas vajutati s
    public Controller(View view) { // sisendiks peab olema view objekt
        this.view = view;

    }
    public void run(){
        this.view.showInfo(); // kuvab info mida programm teeb
        while (!this.s) { // sisestab andmeid kuni s true
            // on küll loop, aga küsib ühe korra, all pool lõpetab kohe
            String sideA = this.view.ask(); // küsib külje pikkuse
            try {
                double sideIntA = Double.parseDouble(sideA); // teisendab str>int
                ShapeData side = new ShapeData(sideIntA); // loob andmeobjekti ja kirjutab listi
            } catch (NumberFormatException e) {
                this.s = true; // sisestati s ja lõpetab küsimise
                System.out.println("Sisesta täisarv või murdarv .-ga, prog. lõpetab");
            }
        this.s = true; // küsib ainult ühe korra andmeid ja lõpetab loopi
        }
        this.view.showData(); //
    }

}
