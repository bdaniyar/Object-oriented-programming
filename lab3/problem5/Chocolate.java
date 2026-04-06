package problem5;

class Chocolate implements Comparable<Chocolate> {

    private String name;
    private double weight;

    public Chocolate(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    @Override
    public int compareTo(Chocolate o) {
        return Double.compare(this.weight, o.weight);
    }
    @Override
    public String toString() {
        return name + " (" + weight + "g)";
    }
}