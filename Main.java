import java.util.Objects;

public class Main {
     public static void main(String[] args) {

     }
 }


class Hospital{
    private String hospitalName;
    private String address;

    public Hospital(String hospitalName, String address){
        this.address = address;
        this.hospitalName = hospitalName;
    }

    public String getHospitalName(){
        return hospitalName;
    }

    public String getAddress(){
        return address;
    }
}


