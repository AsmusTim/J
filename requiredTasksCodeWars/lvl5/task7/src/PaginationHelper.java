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
        if(itemIndex >= list.size()) return -1;
        if(itemsPerPage <= 0) return -1;
        return ;
    }


    public static void main(String[] args) {
        PaginationHelper<Character> helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', '1', '2', '3', '4', '5'), 4);
        System.out.println(helper.pageIndex(1));
    }
}