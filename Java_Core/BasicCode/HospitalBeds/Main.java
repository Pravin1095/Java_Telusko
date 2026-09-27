package Java_Core.BasicCode.HospitalBeds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static List<String> addHospital(List<String> list, String hospitalName) {
        list.add(hospitalName);
        return list; // Fixed variable name
    }
    public static void main(String[] a){
        List<Hospital> hospitals = List.of(
                new Hospital("Apollo", "Chennai", 120),
                new Hospital("Fortis", "Bengaluru", 80),
                new Hospital("Kauvery", "Chennai", 50),
                new Hospital("Manipal", "Bengaluru", 110),
                new Hospital("AIIMS", "Delhi", 200)
        );
        Map<String, Integer> hospitalBedCount = new HashMap<>();
        Map<String, List<String>> grpByHospitalName = new HashMap<>();
        List<String> hospitalNames = new ArrayList<>();


        for(Hospital h : hospitals){
            hospitalBedCount.put(h.getCity(), hospitalBedCount.getOrDefault(h.getCity(),0)+h.getAvailableBeds());
            grpByHospitalName.put(h.getCity(),addHospital(grpByHospitalName.getOrDefault(h.getCity(),new ArrayList<>()), h.getName()));
        }



        System.out.println(hospitalBedCount);
    }
}
