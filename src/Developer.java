public class Developer extends Employed implements payBonifice, Sueldo {

    int bonific = 10;

    public Developer(String name, int age, int experience, int workDays) {

        super(name, age, experience, workDays);
    }

    @Override
    public int payBonifice(int sueldB) {
       return aplicarBonificacionBase(sueldB,bonific);
    }

    @Override
    public int sueldoTotal() {
        return payBonifice(sueldo);
    }
}
