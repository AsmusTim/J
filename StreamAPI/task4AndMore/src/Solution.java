import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Solution {

    public static ArrayList<Integer> initList(boolean isEmpty){
        ArrayList<Integer> list = new ArrayList<>();
        if(!isEmpty){
            int size = (int)( Math.random() * 45 + 1 );
            for(int i = 0; i < size; ++i){
                list.add( random() );
            }
        }
        return list;
    }

    public static int random(){
        return (int)(Math.random() * 96);
    }

    public static ArrayList<String> initStringList(){
        ArrayList<String> list = new ArrayList<String>();
        int size = random();
        for(int i = 0; i < size; ++i){
            StringBuilder sb = new StringBuilder();
            int lenStr = (int)(Math.random() * 13 + 1);
            for(int j = 0; j < lenStr; ++j){
                char c;
                if(Math.random() < 0.5){ c = (char)('a' + (int)(Math.random() * 25)); }
                else { c = (char)('A' + (int)(Math.random() * 25)); }
                sb.append(c);
            }
            list.add(sb.toString());
        }
        return list;
    }

    public static void main(String[] args) {

//        task4(initList(false));
//        task4(initList(true));

//        task5(initList(false));
//        task5(initList(true));

//        task6(initList(false));
//        task6(initList(true));

//        task7(initList(false), e -> e % 7 == 1);
//        task7(initList(true), e -> e % 2 == 1);

//        task8(Human.getHumansList());

//        task9(Human.getHumansList());

//        task10(Human.getHumansList());

//        task11(initList(false));
//        task12(initList(false));


//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(50);
//        list1.add(300);
//        task13_14(initList(false), random());
//        task13_14(list1, 50);


//        task15(initList(false));
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1); list.add(15); list.add(61); list.add(21); list.add(111); list.add(617);
//        task15(list);

//        task16(initList(false), random());

//        task17(initList(false));

//        task18(initList(false));
//        task18(initList(true));

//        task19(Human.getHumansList());

//        task20(initList(false));
//        task20(initList(true));

//        task21(initStringList());

//        task22(initStringList());

//        task23(initStringList());
//        task24(initStringList());

//        task25(Human.getHumansList());

//        task26(Human.getHumansList());

//        task27(initStringList());

//        task28(initStringList());

//        task29(Human.getHumansList());
//        task30(Human.getHumansList());

//        task31(initList(false));
//        task31(initList(true));

//        task32(initList(false));

//        task33_34(initList(false));

//        task35(initList(false));

//        task36(initList(false));

//        task37(initList(false));

//        task38(initList(false));
//        task38(initStringList());

//        task39(initStringList());

//        task40(initStringList());

        task41(initStringList());

//        task42(initStringList());

//        task43(initStringList());


    }



    public static void task4(ArrayList<Integer> list){
        list.stream().filter(e -> e.equals((int) (Math.random() * 50 + 1)))
                .findAny().ifPresentOrElse(System.out::println, () -> {
                    try {
                        throw new Exception("Error");
                    } catch (Exception e) {
                        System.out.println("Throw Exception: Error");
                    }
                } );
    }

    public static void task5(ArrayList<Integer> list){
        list.stream().skip(2).limit(1).findAny().ifPresent(System.out::println);
    }

    public static void task6(ArrayList<Integer> list){
        list.stream().skip(1).limit(2).forEach(e -> System.out.print(e + " "));
    }

    public static void task7(ArrayList<Integer> list, Predicate<? super Integer> predicate){
        list.stream().filter(predicate).forEach(System.out::println);
    }

    public static void task8(ArrayList<Human> list){
        list.stream().filter(e -> e.sex == 'M' && 18 <= e.age && e.age <= 27).forEach(System.out::println);
    }

    public static void task9(ArrayList<Human> list){
        list.stream().filter(e -> e.sex == 'M').mapToInt(e -> e.age).average().ifPresent(System.out::print);
    }

    public static void task10(ArrayList<Human> list){
        long count = list.stream().filter(e -> {
            return (e.sex == 'F' && 18 <= e.age && e.age < 55) || (e.sex == 'M' && 18 <= e.age && e.age < 60);
        }).count();
        System.out.println(count);
    }

    public static void task11(ArrayList<Integer> list){
        list.stream().distinct().forEach(e -> System.out.print(e + " "));
    }

    public static void task12(ArrayList<Integer> list){
        list.stream().sorted().distinct().forEach(e -> System.out.print(e + " "));
    }

    public static void task13_14(ArrayList<Integer> list, int element){
        System.out.print(0 != list.stream().filter(e -> e.equals(element)).count() );
    }

    public static void task15(ArrayList<Integer> list){
        System.out.print( list.size() == list.stream().map(String::valueOf).filter(e -> e.contains("1")).count() );
    }

    public static void task16(ArrayList<Integer> list, Integer element){
        System.out.print( 0 == list.stream().filter(e -> e.equals(element)).count() );
    }

    public static void task17(ArrayList<Integer> list){
        list.stream().map(String::valueOf).map(e -> e + "_1").forEach(e -> System.out.print(e + " "));
    }

    public static void task18(ArrayList<Integer> list){
        System.out.println(list);
        System.out.print( Arrays.toString(list.stream().skip(1).toArray()) ); // fix to int arr
    }

    public static void task19(ArrayList<Human> list){
        System.out.print( list.stream().map(e -> String.valueOf(e.age) ).collect(Collectors.joining(", ")) );
    }

    public static void task20(ArrayList<Integer> list){
        System.out.println( list.stream().reduce(0, Integer::sum) );
    }

    public static void task21(ArrayList<String> list){
        System.out.print( list.stream().sorted().toList() );
    }

    public static void task22(ArrayList<String> list){
        System.out.print(list.stream().sorted(Comparator.reverseOrder()).toList());
    }

    public static void task23(ArrayList<String> list){
        System.out.println( list.stream().distinct().sorted().toList() );
    }

    public static void task24(ArrayList<String> list){
        System.out.println( list.stream().distinct().sorted(Comparator.reverseOrder()).toList() );
    }

    public static void task25(ArrayList<Human> list){
        System.out.println( list.stream().sorted(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return -1 * o1.name.compareTo(o2.name);
            }
        }).toList() );
    }

    public static void task26(ArrayList<Human> list){
        System.out.println( list.stream().sorted(Comparator.comparing(Human::getSex).thenComparing(Human::getAge) ).toList() );
    }

    public static void task27(ArrayList<String> list){
        list.stream().max((o1, o2) -> Integer.compare(o1.length(), o2.length())).ifPresent(System.out::println);
    }

    public static void task28(ArrayList<String> list){
        list.stream().min((o1, o2) -> Integer.compare(o1.length(), o2.length())).ifPresent(System.out::println);
    }

    public static void task29(ArrayList<Human> list){
        list.stream().max((o1, o2) -> Integer.compare(o1.age, o2.age)).ifPresent(System.out::println);
    }

    public static void task30(ArrayList<Human> list){
        list.stream().min((o1, o2) -> Integer.compare(o1.age, o2.age)).ifPresent(System.out::println);
    }

    public static void task31(ArrayList<Integer> list){
        System.out.println( list.stream().reduce(0, Integer::sum) );
    }

    public static void task32(ArrayList<Integer> list){
        list.stream().max(Integer::compareTo).ifPresentOrElse(System.out::println, () -> System.out.println(-1));
    }

    public static void task33_34(ArrayList<Integer> list){
        System.out.println( list.stream().filter(e -> e % 2 == 1).reduce(0, Integer::sum) );
    }

    public static void task35(ArrayList<Integer> list){
        list.stream().mapToInt(e -> e - 1).average().ifPresent(System.out::println);
    }

    public static void task36(ArrayList<Integer> list){
        list = (ArrayList<Integer>) list.stream().mapToInt(e -> e + 3).boxed().collect(Collectors.toList());
        Statistic.getStatistic(list);
    }

    public static void task37(ArrayList<Integer> list){
        System.out.println( list.stream().collect(Collectors.groupingBy(e -> e % 2 == 0)) );
    }

    public static <T> void task38(ArrayList<T> list){
        System.out.println( list.stream().distinct().toList() );
    }

    public static void task39(ArrayList<String> list){
        System.out.println( list.stream().distinct().map(String::toUpperCase).toList() );
    }

    public static void task40(ArrayList<String> list){
        System.out.println( list.stream().map(e -> "<b>" + e + "</b>").collect(Collectors.joining(":\n")) );
    }

    public static void task41(ArrayList<String> list){
        System.out.println( list.stream().filter(e -> e.length() > 1)
                .collect(Collectors.groupingBy( e -> e.substring(0, 1),
                        Collectors.mapping(e -> e.substring(1, 2), Collectors.toList() ))
                )
        );
    }

    public static void task42(ArrayList<String> list){
        System.out.println( list.stream().collect(Collectors.groupingBy(e -> e.substring(0, 1), Collectors.toList())) );
    }

    public static void task43(ArrayList<String> list){
        System.out.println( list.stream().collect(Collectors.groupingBy(e -> e.substring(0, 1),
                Collectors.mapping(e -> {
                    String[] arr = e.split("");
                    return String.join(":", arr);
                }, Collectors.toList()
                ))) );
    }

}
