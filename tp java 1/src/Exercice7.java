import java.util.List;
import java.util.ArrayList;

public class Exercice7 {
    public static void main(String[] args) {
        String[] tab = {"toi", "axel", "clement", "nils","michel-jesus"};
        String result = "";

        for (String s : tab) {
            if(result.length() < s.length()) {
                result = s;
            }
        }
        //meme chose avec des listes
        result = "";
        List<String> valueList = new ArrayList<>();
        valueList.add("un");
        valueList.add("deux");
        valueList.add("trois");
        for(String value : valueList) {
            if(result.length() < value.length()) {
                result = value;
            }
        }
        System.out.println(result);
    }
}
