import java.util.LinkedHashMap;
import java.util.Map;
public class StudentsLL {
    LinkedHashMap<String, Integer> Marks= new LinkedHashMap<>();
    public void addStudent(String name, Integer Score){
        Marks.put(name,Score);

    }
    public void DisplayStudents(){
        System.out.println("Students Marks in insertion order");
        for(Map.Entry<String,Integer> entry : Marks.entrySet()){
            System.out.println(entry.getKey()+ ";" + entry.getValue());
        }
    }
}
