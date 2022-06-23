package StarCraft;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeTest;

import static org.junit.jupiter.api.Assertions.*;

public class StarCraftTest {

    public StarCraft.Zegar[] Zarr = new StarCraft.Zegar[10];
    public StarCraft.Protos[] Parr = new StarCraft.Protos[5];
    public StarCraft.Terr[] Tarr = new StarCraft.Terr[12];

    public void Data(){
        for(int i = 0; i < 10; ++i){
            Zarr[i] = new StarCraft.Zegar("z" + i);
        }
        for(int i = 0; i < 10; ++i){
            Zarr[i] = new StarCraft.Zegar("z" + i);
        }
        for(int i = 0; i < 5; ++i){
            Parr[i] = new StarCraft.Protos("p" + i);
        }
        for(int i = 0; i < 12; ++i){
            Tarr[i] = new StarCraft.Terr("t" +  i);
        }
    }

    @Test
    void testOnNotNullZ() {
        Data();
        boolean a = true;
        for(StarCraft.Zegar i: Zarr){
            if(i == null) {a = false; break;}
        }
        assertTrue(a);
    }
    @Test
    void testOnNotNullP() {
        Data();
        boolean a = true;
        for(StarCraft.Protos i: Parr){
            if(i == null) {a = false; break;}
        }
        assertTrue(a);
    }
    @Test
    void testOnNotNullT() {
        Data();
        boolean a = true;
        for(StarCraft.Terr i: Tarr){
            if(i == null) {a = false; break;}
        }
        assertTrue(a);
    }

    @Test
    void UniqueNameZ(){
        Data();
        boolean a = true;
        for(int i = 0; i < Zarr.length; ++i){
            for(int j = i + 1; j < Zarr.length; ++j){
                if(Zarr[i].name.equals(Zarr[j].name)){a = false; break;}
            }
        }
        assertTrue(a);
    }
    @Test
    void UniqueNameP(){
        Data();
        boolean a = true;
        for(int i = 0; i < Parr.length; ++i){
            for(int j = i + 1; j < Parr.length; ++j){
                if(Parr[i].name.equals(Parr[j].name)){a = false; break;}
            }
        }
        assertTrue(a);
    }
    @Test
    void UniqueNameT(){
        Data();
        boolean a = true;
        for(int i = 0; i < Tarr.length; ++i){
            for(int j = i + 1; j < Tarr.length; ++j){
                if(Tarr[i].name.equals(Tarr[j].name)){a = false; break;}
            }
        }
        assertTrue(a);
    }
    @Test
    void UniqueNameZP(){
        Data();
        boolean a = true;
        for(StarCraft.Zegar i: Zarr){
            for(StarCraft.Protos j: Parr){
                if(i.name.equals(j.name)){a = false; break;}
            }
        }
        assertTrue(a);
    }
    @Test
    void UniqueNameZT(){
        Data();
        boolean a = true;
        for(StarCraft.Zegar i: Zarr){
            for(StarCraft.Terr j: Tarr){
                if(i.name.equals(j.name)){a = false; break;}
            }
        }
        assertTrue(a);
    }
    @Test
    void UniqueNamePT(){
        Data();
        boolean a = true;
        for(StarCraft.Protos i: Parr){
            for(StarCraft.Terr j: Tarr){
                if(i.name.equals(j.name)){a = false; break;}
            }
        }
        assertTrue(a);
    }
}