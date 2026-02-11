import javax.print.Doc;
import java.util.Objects;

public class Main {
     public static void main(String[] args) {
         Hospital hospital = new Hospital("Городская Больница", "4 мкр");
         Doctor doctor = new Doctor("Askar", "Стоматолог", "Городская Больница", "4 мкр");

         System.out.println(hospital.getAddress());
         System.out.println(hospital.getHospitalName());

         hospital.work();
     }
 }


class Hospital implements Workable{
    private String hospitalName;
    private String address;

    public Hospital(String hospitalName, String address){
        this.address = address;
        this.hospitalName = hospitalName;
    }

    public void work(){
        System.out.println("Я работаю стоматологом в больнице: " + getHospitalName());
    }

    public String getHospitalName(){
        return hospitalName;
    }

    public String getAddress(){
        return address;
    }
}

class Doctor extends Hospital{
    private String name;
    private String specialisation;

    public Doctor(String name, String specialisation, String hospitalName, String address){
        this.name = name;
        this.specialisation = specialisation;
        super(hospitalName, address);
    }
}

interface Workable {
    void work();
}

