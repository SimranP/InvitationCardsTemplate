package runner;
import java.util.Arrays;
import static java.lang.String.join;

public class Label {
    private final String content;

    public Label(String content) {
        this.content = content;
    }

    public Label add(String label){
        return new Label(String.format("%s, %s",this.content,label));
    }

    private String spaceCounter(String label){
        String upperBorder = "+-----------------------------------+";
        int spaces = (upperBorder.length()-label.length());
        if(spaces > 0) {
            String[] spacesString = new String[spaces-3];
            Arrays.fill(spacesString, " ");
            return join("", spacesString);
        }
        return "";
    }

    @Override
    public String toString() {
        return content;
    }
}
