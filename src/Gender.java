public enum Gender {
    FEMALE("Ms"),
    MALE("Mr");

    private String value;

    Gender(String s) {
        this.value = s;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
