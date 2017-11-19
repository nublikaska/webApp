import javax.inject.Named;

@Named
public class ExampleBean {
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    private static String str = "CDI example";
}
