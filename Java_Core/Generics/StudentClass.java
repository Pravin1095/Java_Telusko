package Java_Core.Generics;

import java.util.ArrayList;

public class StudentClass<T> {
    public String getQuery(String studentData, String query) {
        int type;
        String res = "";
        type = Integer.parseInt(query.split(",")[0]);
        String[] a = studentData.split(" ");
        if (type == 1) {
            StudentList<String> slist = new StudentList<>();
            for (int i = 0; i < a.length; i++) {
                slist.addElement(a[i]);
            }
            String selectedQuery = query.split(",")[1];
            res = slist.beginsWith(selectedQuery);
        }
        if(type==2){
            StudentList<String> slist = new StudentList<>();
            for (int i = 0; i < a.length; i++) {
                slist.addElement(a[i]);
            }
            String[] bloodGrp = query.split(",")[1].split(" ");
            String squery = query.split(",")[2];
            res = slist.bloodGrpTest(bloodGrp, squery);
        }
        return res;
    }
}
