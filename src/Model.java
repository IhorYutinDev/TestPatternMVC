public class Model {
    private String stringFromController;
    private String resultOperation = "";


    //change model data
    public void setStringFromController(String stringFromController) {
        this.stringFromController = stringFromController;
        operation();
    }

    public String getResultOperation() {
        return resultOperation;
    }

    //hard business logic
    public void operation() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stringFromController);
        resultOperation = stringBuilder.reverse().toString();
    }
}
