package person;

public enum Gender {
    FEMALE("Ms"),
    MALE("Mr");

    private String value;

    Gender(String honorific) {
        this.value = honorific;
    }

    public String getHonorific() {
        return this.value;
    }
}
