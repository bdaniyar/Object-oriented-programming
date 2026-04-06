package problem6;

import lab2.problem5.Animal;

class Dog extends Animal implements Trainable, Comparable<Dog> {

    private int level;

    public Dog(String name, int level) {
        // Animal from lab2.problem5 expects (name, age). We reuse level as age here.
        super(name, level);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public void train() {
        level++;
        System.out.println(getName() + " is training. Level = " + level);
    }

    @Override
    public int compareTo(Dog o) {
        return this.level - o.level;
    }

    @Override
    public String toString() {
        return "Dog{name='" + getName() + "', level=" + level + "}";
    }

    @Override
    public String getSound() {
        return "Woof";
    }
}
