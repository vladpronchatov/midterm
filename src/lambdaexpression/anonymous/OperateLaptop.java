package lambdaexpression.anonymous;

public class OperateLaptop {

    public static void main(String[] args) {
        Phone phone = (network) -> System.out.println(network);
        phone.cellularNetwork("Phone uses network for data and carrier is unknown");
    }

    Laptop laptop = new Laptop() {
        @Override
        public void ramSize(int memorySize) {

        }

        @Override
        public void monitorSize(int screenSize) {
        }
    };
}
    //Please implement anonymous class for interface laptop
    //Laptop laptop = new Laptop(){}


    //please implement anonymous function for Phone interface



