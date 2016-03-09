public class Label {
    private final String content;

    public Label(String content) {
        this.content = content;
    }

    public Label add(String label){
        return new Label(String.format("%s, %s",this.content,label));
    }

    @Override
    public String toString() {
        return content;
    }
}
