package Lab3;

import java.util.ArrayList;
import java.util.List;

public class SortingUtility implements SortingUtilityIF {

    private List<Product> product;

    public SortingUtility(){}

    @Override
    public List<Product> sort(List<Product> items, int sortType) {
        this.product = items;
        int n = items.size();
        if (sortType == 1){
            product = quickSort(items, 0, n-1);
        }
        else if (sortType == 2){
            product = bubbleSort(product);
        }
        return product;
    }
    private List <Product> quickSort(List <Product> items, int low, int high){
        Product pivot = items.get(high);

        for(int i = 0; i < high; i++)
            for(int j = i+1; j < high+1; j++){
                if(items.get(i).getID() > (items.get(j).getID())){
                    Product temp = items.get(i);
                    items.set(i, items.get(j));
                    items.set(j, temp);
                }
            }

        return items;
    }
    private List <Product> bubbleSort(List <Product> bSort)
    {
        int n = bSort.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if(bSort.get(j).getID() > bSort.get(j+1).getID())
                {
                    // swap arr[j+1] and arr[i]
                    Product temp = bSort.get(j);
                    bSort.set(j, bSort.get(j+1));
                    bSort.set(j+1, temp);
                }
        return bSort;
    }
}
