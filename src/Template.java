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

    public Template join(Template template){
        Template t = this;
        int size = template.templateFields.size();
        t.addField(template.templateFields);
            for (int i = 0; i < size ; i++) {
                t.template.put(template.templateFields.get(i),template.template.get(template.templateFields.get(i)));
            }
        return t;
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


