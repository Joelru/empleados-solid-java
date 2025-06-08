package joelru;

public class Employed {

    String name;
    int age;
    int experience;
    int workDays;
    protected int sueldo = 200;

    public Employed(String name, int age, int experience, int workDays) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.workDays = workDays;
    }

    protected int aplicarBonificacionBase(int sueldo, int bonific) {
        if (workDays > 20) {
            return bonific + workDays + sueldo + experience;
        }
        return sueldo;
    }

}
