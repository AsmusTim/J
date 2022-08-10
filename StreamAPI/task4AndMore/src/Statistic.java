import java.util.ArrayList;
import java.util.List;

public class Statistic {

    public static void getStatistic(List<Integer> list){
        list.sort(Integer::compare);

        for(int i = 2; i <= list.get(list.size() - 1); ++i){
            String sb = "Чисел кратных ";
            int count = 0;
            sb += i;
            for(int j: list){
                if(j % i == 0) count++;
            }
            if(count > 0){
                sb += ": " + count;
                System.out.println(sb);
            }
        }
    }

}
