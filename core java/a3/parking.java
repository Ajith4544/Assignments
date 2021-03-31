
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class parking {

	public static void main(String[] args) 
	{
		
		ParkedCarOwnerList p = new ParkedCarOwnerList();
		ParkedCarOwnerDetails d = new ParkedCarOwnerDetails("a","1111",2222,3333,"hyderabad");
		p.addNewCar(d, 13);
		//p.removeCar();
		p.getParkedCarLocation(1111);

	}

}
 class ParkedCarOwnerDetails {

    String ownerName;
    String carModel;
     int carNo;
    long mobileNo;
     String ownerAddress;

    ParkedCarOwnerDetails() {
    }

     ParkedCarOwnerDetails(String ownerName, String carModel, int carNo, long mobileNo, String ownerAddress) {
        this.ownerName = ownerName;
        this.carModel = carModel;
        this.carNo = carNo;
        this.mobileNo = mobileNo;
        this.ownerAddress = ownerAddress;
    }
 String getOwnerName() {
        return ownerName;
    }

    void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    String getCarModel() {
        return carModel;
    }

     void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    int getCarNo() {
        return carNo;
    }

    void setCarNo(int carNo) {
        this.carNo = carNo;
    }

     long getMobileNo() {
        return mobileNo;
    }

     void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

     String getOwnerAddress() {
        return ownerAddress;
    }

     void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    @Override
    public String toString() {
        return "ParkedCarOwnerDetails{" +
                "ownerName='" + ownerName + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carNo=" + carNo +
                ", mobileNo=" + mobileNo +
                ", ownerAddress='" + ownerAddress + '\'' +
                '}';
    }
}




 class ParkedCarOwnerList {

    
    HashMap<Integer, ParkedCarOwnerDetails> carsParked = new HashMap<>();


    public void addNewCar(ParkedCarOwnerDetails car, int token) {
        carsParked.put(token, car);
    }

    void Car(int token) {

        for (Map.Entry m : carsParked.entrySet()) {
            if (m.getKey().equals(token)) {
                carsParked.remove(token);
                System.out.println("Car with token" + token + " car left parking area");
            } else
                System.out.println("Car not found with such details");
        }

    }

    public void getParkedCarLocation(int token) {
        boolean flag = false;
        ParkedCarOwnerDetails c = new ParkedCarOwnerDetails();
        for (Map.Entry m : carsParked.entrySet()) {
            if (m.getKey().equals(token)) {
                flag = true;
                c = carsParked.get(m.getKey());
                break;
            } else
                System.out.println("Car not found");

        }
        if(flag)
            System.out.println("Car Found at: \n" + c.toString());
    }

}
