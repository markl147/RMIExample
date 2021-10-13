import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class House extends UnicastRemoteObject implements HouseInterface {

    private String owner;
    private String address;

    public House(String o, String a) throws RemoteException {
        this.owner = o;
        this.address = a;
    }

    public String getOwner() {
        return owner;
    }

    public String getAddress() {
        return address;
    }

}
