package model;

public class Doctor {

    //Auto incremental
    private static int id = 0;
    private String name;
    private String lastName;
    private String speciality;

    public Doctor(){}

    public Doctor( String name, String lastName, String speciality){
        id++;
        this.name = name;
        this.lastName = lastName;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "model.Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
