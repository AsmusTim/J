import java.util.List;

// TODO: complete this object/class


       /*not complete*/


public class PaginationHelper<I> {

    private  List<I> list;
    private int itemsPerPage;

    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.list = collection;
        this.itemsPerPage = itemsPerPage;
    }

    public int itemCount() {
        return list.size();
    }

    public int pageCount() {
        int count = 0;
        for(int i = 1; i < this.itemsPerPage; ++i){
            if(this.list.size() - (this.itemsPerPage * i) < 0) count = i - 1;
        }
        return count;
    }

    public int pageItemCount(int pageIndex) {
        int pCount = this.pageCount();
        if(pageIndex < pCount - 1) return this.itemsPerPage;
        if(pageIndex == pCount - 1) return this.list.size() - this.itemsPerPage * (pCount - 1);
        else return -1;
    }

    public int pageIndex(int itemIndex) {
        if(itemIndex > list.size()) return -1;
        return itemIndex / this.itemsPerPage;
    }
}