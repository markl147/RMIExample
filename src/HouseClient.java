import java.rmi.Naming;

public class HouseClient {

    public static void main(String[] args) {
        String url = "rmi:///"; //locally sourced objects do not need ip address
        System.out.println("Client has started");
        try {
            HouseInterface h1 = (HouseInterface) Naming.lookup("ourBungalow");

            String bungalowOwners = h1.getOwner();
            System.out.println("Owner of bungalow: " + bungalowOwners);

            HouseInterface h2 = (HouseInterface) Naming.lookup("ourDormer");
            System.out.println("Owner of dormer: " + h2.getOwner());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
