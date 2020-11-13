public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller(model);
        View view = new View(model);
        controller.getInfFromUser();
        view.print();
    }
}
