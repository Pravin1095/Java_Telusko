package AbstractionFresco;

import java.util.ArrayList;
import java.util.List;

public class Chair {
    public List<Integer> minChairs(List<String> simulation){
List <Integer> res = new <Integer>ArrayList();

for(String characters : simulation){
    int count =0;
    int availChairs = 0;
    for(char singleChar : characters.toCharArray()){
        if(singleChar=='U' || singleChar=='L'){
availChairs+=1;
        }
else if(singleChar=='C' || singleChar=='R'){
if(availChairs>0){
    availChairs-=1;
}
else{
    count+=1;
}
}
    }
    res.add(count);
}

return res;
    }
}
