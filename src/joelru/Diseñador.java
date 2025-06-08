package joelru;

public class Diseñador extends Employed implements payBonifice, Sueldo {

    int bonific = 2;

    public Diseñador(String name, int age, int experience, int workDays) {
        super(name, age, experience, workDays);
    }

    @Override
    public int payBonifice(int sueldB) {
        if (workDays > 20) {
            sueldB = bonific + workDays + sueldB+ experience;
        }
        return sueldB;
    }

    @Override
    public int sueldoTotal() {
        return payBonifice(sueldo);
    }
}
