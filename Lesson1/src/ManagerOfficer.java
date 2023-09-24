import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ManagerOfficer {
    private List<Office> offices;
    public ManagerOfficer(){
        this.offices = new ArrayList<>();
    }
    public void addOffice(Office office){
        this.offices.add(office);
    }
    public List<Office> searchOfficeByname(String name){
        return this.offices.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }
    public void showListInforOfficer(){
        this.offices.forEach(office -> System.out.println(office.toString()));
    }
}
