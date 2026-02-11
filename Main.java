public class Main {
     public static void main(String[] args) {
         Hospital hospital = new Hospital("Городская Больница", "4 мкр");
         Doctor doctor = new Doctor("Askar", "Стоматолог");

         System.out.println(hospital.getAddress());
         System.out.println(hospital.getHospitalName());

         hospital.work();

         //вызываем новые методы

         System.out.println(doctor.getName());

         System.out.println(doctor.getSpecialisation());
         doctor.work();

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

class Doctor {
    private String name;
    private String specialisation;

    public Doctor(String name, String specialisation){
        this.name = name;
        this.specialisation = specialisation;

    }

    //Новые методы
    public String getName(){
        return name;
    }

    public String getSpecialisation(){
        return specialisation;
    }

    //интерфейс
    public void work(){
        System.out.println("Я окончил медвуз");
    }

}

interface Workable {
    void work();
}

