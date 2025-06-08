package joelru;

public class Gerent extends Employed implements Sueldo, payBonifice {
    public Gerent(String name, int age, int experience, int workDays) {
        super(name, age, experience, workDays);
    }
    int bonific = 25;

    @Override
    public int payBonifice(int sueldB) {
        if (workDays > 20) {
            sueldB = bonific + workDays + sueldB+ experience;;
        }
        return sueldB;
    }

    @Override
    public int sueldoTotal() {
        return payBonifice(sueldo);
    }
}
