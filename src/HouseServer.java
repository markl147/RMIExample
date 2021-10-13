import java.rmi.Naming;

public class HouseServer {
    public static void main(String[] args) {

        System.out.println("Server has started...");

        try {
            House bungalow = new House("Smiths", "Dublin");
            System.out.println("Bungalow created");

            House dormer = new House("Burkes", "Kerry");
            System.out.println("Dormer created");

            Naming.rebind("bungalowHouse", bungalow);
            Naming.rebind("dormerHouse", dormer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
