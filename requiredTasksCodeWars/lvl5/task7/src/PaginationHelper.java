//https://www.codewars.com/kata/515bb423de843ea99400000a

import java.util.Arrays;
import java.util.List;

// TODO: complete this object/class
public class PaginationHelper<I> {

    private  List<I> list;
    private int itemsPerPage;
    private int pageCount;

    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.list = collection;
        this.itemsPerPage = itemsPerPage;
        this.pageCount = (int) Math.ceil((double) collection.size() / (double) itemsPerPage);
    }

    public int itemCount() {
        return list.size();
    }

    public int pageCount() { return this.pageCount; }

    public int pageItemCount(int pageIndex) {
        int pCount = this.pageCount();
        if(pageIndex < pCount - 1) return this.itemsPerPage;
        if(pageIndex == pCount - 1) return this.list.size() - this.itemsPerPage * (pCount - 1);
        else return -1;
    }

    public int pageIndex(int itemIndex) {
        if(itemIndex > list.size() || itemIndex < 0 || list.size() == 0 || itemsPerPage <= 0) return -1;
        return itemIndex / itemsPerPage ;
    }


    public static void main(String[] args) {
        PaginationHelper<Character> helper = new PaginationHelper<>(Arrays.asList(), 4);
        System.out.println(helper.pageIndex(0));
    }
}