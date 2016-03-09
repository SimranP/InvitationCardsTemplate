import java.util.ArrayList;
import java.util.Hashtable;

public class Template {

    private Hashtable<String, String> template;
    private ArrayList<String> templateFields;

    public Template() {
        template = new Hashtable<String, String>();
        templateFields = new ArrayList<String>();
    }

    public void addField(String fieldName) {
        templateFields.add(fieldName);
    }
    public void addField(ArrayList<String> fields) { templateFields.addAll(fields); }


    public void takeContent(String[] content) {
        for (int i = 0; i < content.length; i++) {
            template.put(templateFields.get(i),content[i]);
        }
    }

    public Template join(Template otherTemplate){
        Template template = this;
        int size = otherTemplate.templateFields.size();
        template.addField(otherTemplate.templateFields);
            for (int i = 0; i < size ; i++) {
                template.template.put(otherTemplate.templateFields.get(i),otherTemplate.template.get(otherTemplate.templateFields.get(i)));
            }
        return template;
    }

    @Override
    public String toString() {
        String outputString = "";
        int size = templateFields.size();
        for (int i = 0; i < size-1; i++) {
            outputString += template.get(templateFields.get(i))+" ";
        }
        outputString += template.get(templateFields.get(size-1));
        return outputString;
    }
}


