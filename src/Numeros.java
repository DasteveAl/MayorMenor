public class Numeros {
    double numA;
    double numB;
    String msg;
    public void setNumA(double numA) {
        this.numA = numA;
    }
    public void setNumB(double numB) {
        this.numB = numB;
    }
    public String getResult() {
        if (numA > numB) {
            msg = "A es mayor que B";
        }
        else if (numB > numA) {
            msg = "B es mayor que A";
        }
        else {
            msg = "A es igual a B";
        }
        return msg;
    }
}
