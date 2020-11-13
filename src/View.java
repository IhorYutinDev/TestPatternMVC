public class View {
    private Model model;

    public View(Model model) {
        this.model = model;
    }

    public void print(){
        System.out.println("View output: " + model.getResultOperation());
    }
}
