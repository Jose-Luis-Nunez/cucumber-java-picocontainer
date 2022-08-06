package example2.model2;

public class Customer {
    String name;
    int refund;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
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
