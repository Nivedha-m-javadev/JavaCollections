import java.util.Map;
import java.util.TreeMap;
public class StudentSort {
    TreeMap<String, Integer> Mark = new TreeMap<>();
    public void addStudent(String name, int Score){
        Mark.put(name, Score);
    }
    public void ShowSortedStudent(){
        System.out.println("Show the student list");
        for(Map.Entry<String,Integer>entry : Mark.entrySet()){
            System.out.println(entry.getKey()+ ";" + entry.getValue());
        }
    }
}
