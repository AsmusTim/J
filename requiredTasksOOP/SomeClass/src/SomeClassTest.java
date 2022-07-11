import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class SomeClassTest {

    List<Integer> sc1;
    List sc2;

    @Before
    public void createData(){
        sc1 = new SomeClass<Integer>();
        for(int i = 0; i < 12; ++i){
            sc1.add(i);
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
        assertEquals(Optional.of(-200), sc1.get(3));
    }

    @Test
    public void set() {
        sc1.set(5, -200);
        assertEquals(Optional.of(-200), sc1.get(5));
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
        assertEquals(3, Optional.ofNullable(e.next()));
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
        //int[] testArr = sc1.toArray(new int[0]);
    }

    @Test
    public void remove() {
        sc1.remove(1);
        assertEquals(11, sc1.size());
        assertEquals(Optional.of(2), sc1.get(1));
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
    }

    @Test
    public void retainAll() {
    }


    @Test
    public void indexOf() {
    }

    @Test
    public void lastIndexOf() {
    }

    @Test
    public void listIterator() {
    }

    @Test
    public void testListIterator() {
    }

    @Test
    public void subList() {
    }
}