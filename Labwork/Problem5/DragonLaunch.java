package Labwork.Problem5;

import java.util.Vector;

public class DragonLaunch {

    private final Vector<Person> kidnapped = new Vector<>();

    public void kidnap(Person p) {
        kidnapped.add(p);
    }

    // true -> someone remains (поест)
    // false -> all vanish (не поест)
    public boolean willDragonEatOrNot() {
        int top = 0; // stack pointer

        for (int i = 0; i < kidnapped.size(); i++) {
            Person cur = kidnapped.get(i);

            if (top > 0) {
                Person prev = kidnapped.get(top - 1);

                boolean vanish = (prev.getGender() == Gender.BOY && cur.getGender() == Gender.GIRL);
                if (vanish) {
                    top--;           // BG vanished
                    continue;
                }
            }

            // push cur to stack
            if (top < kidnapped.size()) {
                kidnapped.set(top, cur);
            } else {
                kidnapped.add(cur);
            }
            top++;
        }
        return top > 0;
    }
    public static void main(String[] args) {
        DragonLaunch dl1 = new DragonLaunch();
        // BBGG -> all vanish
        dl1.kidnap(new Person("B1", Gender.BOY));
        dl1.kidnap(new Person("B2", Gender.BOY));
        dl1.kidnap(new Person("G1", Gender.GIRL));
        dl1.kidnap(new Person("G2", Gender.GIRL));
        System.out.println("BBGG -> dragon eats? " + dl1.willDragonEatOrNot()); // false

        DragonLaunch dl2 = new DragonLaunch();
        // GBGB -> 2 will remain
        dl2.kidnap(new Person("G1", Gender.GIRL));
        dl2.kidnap(new Person("B1", Gender.BOY));
        dl2.kidnap(new Person("G2", Gender.GIRL));
        dl2.kidnap(new Person("B2", Gender.BOY));
        System.out.println("GBGB -> dragon eats? " + dl2.willDragonEatOrNot()); // true
    }
}