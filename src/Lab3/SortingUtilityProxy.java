package Lab3;

import java.util.List;

public class SortingUtilityProxy implements SortingUtilityIF {
    private SortingUtility sortingUtility;

    public SortingUtilityProxy(){
        this.sortingUtility = new SortingUtility();
    }

    @Override
    public List<Product> sort(List<Product> items, int sortType) {
        items = sortingUtility.sort(items, sortType);
        if(sortType == 1) {
            System.out.println("Quick Sorted");
            for (Product item : items) {
                System.out.println(item.getName() + " " + item.getID() + " " + item.getPrice());
            }
        }
        else if(sortType == 2){
            System.out.println("bubble Sorted");
            for(Product item:items) {
                System.out.println(item.getID() + " " + item.getName() + " " + item.getPrice());
            }

        }
        return items;
    }
}
