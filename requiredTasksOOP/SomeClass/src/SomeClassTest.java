import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SomeClassTest {

    SomeClass<Integer> sc1;
    SomeClass sc2;
    List<Integer> list;

    @Before
    public void createData(){
        sc1 = new SomeClass<>();
        for(int i = 0; i < 12; ++i){
            sc1.add(i);
        }
        list = new ArrayList<>();
        for(int i = 0; i < 5; ++i){
            list.add(i);
        }
    }

    @Test
    public void add() {
        sc2 = new SomeClass<Integer>();
        int count = 0;
        for(int i = 0; i < 100; ++i){
            sc2.add(i);
            count++;
        }
        assertEquals(100, count);
    }

    @Test
    public void testAdd() {
        sc1.add(3, -200);
        assertEquals(13, sc1.size());
        assertEquals(Optional.of(-200), Optional.of(sc1.get(3)));
    }

    @Test
    public void set() {
        sc1.set(5, -200);
        assertEquals(Optional.of(-200), Optional.of(sc1.get(5)));
        assertEquals(12, sc1.size());
    }


    @Test
    public void isEmpty() {
        sc1.clear();
        assertTrue(sc1.isEmpty());
    }

    @Test
    public void contains() {
        assertTrue(sc1.contains(4));
    }

    @Test
    public void iterator() {
        Iterator<Integer> e = sc1.iterator();
        for(int i = 0; i < 3 && e.hasNext(); ++i){
            e.next();
        }
        assertEquals(Optional.of(3), Optional.ofNullable(e.next()));
        while (e.hasNext()){
            e.next();
        }
        assertTrue(!e.hasNext());
    }

    @Test
    public void toArray() {
        Object[] arrForCheck = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        Object[] testArr = sc1.toArray();
        assertArrayEquals(arrForCheck, testArr);
    }

    @Test
    public void testToArray() {
        int[] arrForCheck = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] arr = new int[0];
        arr = sc1.toArray(arr);

    }

    @Test
    public void remove() {
        sc1.remove(1);
        assertEquals(10, sc1.size());
        assertEquals(Optional.of(2), Optional.of(sc1.get(1)));
    }

    @Test
    public void testRemove() {
        sc2 = new SomeClass<String>();
        for(int i = 0; i < 5; ++i){
            sc2.add("" + i);
        }
        sc2.remove("2");
        assertEquals(4, sc2.size());
        assertEquals("3", sc2.get(2));
    }

    @Test
    public void containsAll() {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 12; ++i){
            list.add(i);
        }
        assertTrue(sc1.containsAll(list));
    }

    @Test
    public void addAll() {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 12; ++i){
            list.add(i);
        }
        sc2 = new SomeClass<Integer>();

        sc2.addAll(list);

//        for(Object i: sc2){ working only with class Object. If use another class compiler begin disturb
//            System.out.println(i);
//        }

        assertEquals(12, sc2.size());
        assertTrue(sc2.containsAll(list));
    }

    @Test
    public void testAddAll() {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 2; ++i){
            list.add(0);
        }
        sc1.addAll(2, list);
        assertEquals(0, sc1.get(3) + sc1.get(4));
        assertEquals(14, sc1.size());
    }

    @Test
    public void removeAll() {

        sc1.removeAll(list);
        int sum = 0;
        for(int i: sc1){
            sum += i;
        }
        assertEquals(56, sum);
        assertEquals(7, sc1.size());
    }

    @Test
    public void retainAll() {
        sc1.retainAll(list);
        int sum = 0;
        for(int i: sc1){ sum += i; }
        assertEquals(5, sc1.size());
        assertEquals(10, sum);
    }


    @Test
    public void indexOf() {
        assertEquals(5, sc1.indexOf(5));
    }

    @Test
    public void lastIndexOf() {
        sc1.add(5);
        assertEquals(12, sc1.lastIndexOf(5));
    }

    @Test
    public void listIterator() {
        /*next*/
        ListIterator<Integer> e = sc1.listIterator();
        assertEquals(Optional.of(0), Optional.ofNullable(e.next()));
        /*previous*/
        e.next();
        assertEquals(Optional.of(1), Optional.ofNullable(e.previous()));
        /*nextIndex*/
        assertEquals(Optional.of(2), Optional.of(e.nextIndex()));
        /*previousIndex*/
        assertEquals(Optional.of(0), Optional.of(e.previousIndex()));
        /*set*/
        e.set(100);
        assertEquals(Optional.of(100), Optional.of(sc1.get(1)));
        /*add*/
        e.add(200);
        e.next();
        assertEquals(Optional.of(200), Optional.of(e.next()));
        /*remove*/
        e.remove();
        assertEquals(Optional.of(12), Optional.of(sc1.size()));
        /*check correct work remove*/
        int count = 0;
        for(int i: sc1){ count++; }
        assertEquals(12, count);


    }

    @Test
    public void testListIterator() {
        ListIterator<Integer> e = sc1.listIterator(4);
        e.next();
        assertEquals(Optional.of(5), Optional.of(e.next()));
    }

    @Test
    public void subList() {
        List<Integer> list = sc1.subList(3, 8);
        int count = 0;
        for(int i: list){
            count += i;
        }
        assertEquals(25, count);

    }
}