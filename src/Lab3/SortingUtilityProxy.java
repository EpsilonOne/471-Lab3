package Lab3;

import java.util.List;

public class SortingUtilityProxy implements SortingUtilityIF {

    /****Attributes****/
    private SortingUtility sortingUtility;

    /****Constructor****/
    public SortingUtilityProxy(){
        this.sortingUtility = new SortingUtility();
    }

    /****Methods****/
    //Overridden sort method takes List and integer types and prints out list
    //in certain format depending on sortType
    @Override
    public List<Product> sort(List<Product> items, int sortType) {
        items = sortingUtility.sort(items, sortType);
        if(sortType == 1) {
            System.out.println("Quick Sorted by ID");
            for (Product item : items) {
                System.out.println("Name: " +item.getName() + ", ID: " + item.getID() + ", Price: " + item.getPrice());
            }
        }
        else if(sortType == 2){
            System.out.println("bubble Sorted by ID");
            for(Product item:items) {
                System.out.println("ID: " +item.getID() + ", Name: " + item.getName() + ", Price: " + item.getPrice());
            }

        }
        return items;
    }
}
