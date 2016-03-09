public class Age {
    private int age;
    public Age(int age) {
        this.age = age;
    }
    public boolean isGreaterThan(int age){
        return this.age > age;
    }

    @Override
    public String toString() {
        return ""+age;
    }
}
