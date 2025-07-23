import java.util.HashMap;
public class Hashmapclass {
    HashMap<String, String> map= new HashMap<>();
    public void addcountry(){
        map.put("India" , "Delhi");
        map.put("TamilNadu" , "Chennai");
        map.put("USA" , "Washington");
        map.put("UK" , "London");

    }
    public void PrintCapitals(){
        System.out.println("Capital - > Country");
        for(String country : map.keySet()){
            String capitol= map.get(country);
            System.out.println(country + " -> " + capitol);
        }
    }
}
