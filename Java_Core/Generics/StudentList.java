package Java_Core.Generics;

import java.util.ArrayList;

public class StudentList<T> {
ArrayList<T> studentList = new ArrayList<T>();

public void addElement(T element){
    studentList.add(element);
}

public void removeElement(T element){
    studentList.remove(element);
}

public String beginsWith(String selectedquery){
    String res="";
for(T studentList1 : studentList){
if(studentList1 instanceof  String){
        if(studentList1.toString().toLowerCase().startsWith(selectedquery.toLowerCase())){
            res+=studentList1.toString()+"\n";
        }
 }
}
    return res;
}

public String bloodGrpTest(String[] bloodGrp, String squery){
return null;
}
}

