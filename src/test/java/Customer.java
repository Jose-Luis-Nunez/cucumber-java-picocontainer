public class Customer {
    String name;
    int refund;

    public Customer(String name) {
        this.name = name;
    }

    public void refund(int refund) {
        this.refund = refund;
    }

    public int getRefunded() {
        return refund;
    }

    @Override
    public String toString() {
        return "name: " + name + " , refund: " + refund;
    }
}
