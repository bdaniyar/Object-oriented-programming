package Labwork.Problem5;

import java.util.Vector;

public class DragonLaunch {

    private final Vector<Person> kidnapped = new Vector<>();

    public void kidnap(Person p) {
        kidnapped.add(p);
    }

    // true -> кто-то остался (дракон поест)
    // false -> никого не осталось (не поест)
    public boolean willDragonEatOrNot() {
        int top = 0; // размер "сжатой" линии

        for (int i = 0; i < kidnapped.size(); i++) {
            Person cur = kidnapped.get(i);

            if (top > 0) {
                Person prev = kidnapped.get(top - 1);

                boolean vanish = (prev.getGender() == Gender.BOY && cur.getGender() == Gender.GIRL);
                if (vanish) {
                    top--;           // BG исчезли
                    continue;
                }
            }

            // "кладём" cur в текущую линию (внутри того же Vector)
            if (top < kidnapped.size()) {
                kidnapped.set(top, cur);
            } else {
                kidnapped.add(cur);
            }
            top++;
        }

        // Не уменьшаем size() (чтобы не было потенциального O(n) из-за очистки),
        // просто решаем по top:
        return top > 0;
    }

    // просто для теста
    public static void main(String[] args) {
        DragonLaunch dl1 = new DragonLaunch();
        // BBGG -> исчезнет всё
        dl1.kidnap(new Person("B1", Gender.BOY));
        dl1.kidnap(new Person("B2", Gender.BOY));
        dl1.kidnap(new Person("G1", Gender.GIRL));
        dl1.kidnap(new Person("G2", Gender.GIRL));
        System.out.println("BBGG -> dragon eats? " + dl1.willDragonEatOrNot()); // false

        DragonLaunch dl2 = new DragonLaunch();
        // GBGB -> останется 2
        dl2.kidnap(new Person("G1", Gender.GIRL));
        dl2.kidnap(new Person("B1", Gender.BOY));
        dl2.kidnap(new Person("G2", Gender.GIRL));
        dl2.kidnap(new Person("B2", Gender.BOY));
        System.out.println("GBGB -> dragon eats? " + dl2.willDragonEatOrNot()); // true
    }
}