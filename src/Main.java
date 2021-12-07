import model.Doctor;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Pepito","Perez","General");
        System.out.println(doctor);
        Doctor doctor2 = new Doctor("Pepita","Perez","Neurocognitive");
        System.out.println(doctor2);

        showMenu();
    }
}
