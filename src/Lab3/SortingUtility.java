package Lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUtility implements SortingUtilityIF {

    /****Attributes****/
    private List<Product> product;

    /****Constructor****/
    public SortingUtility(){

    }

    /****Methods****/
    //Overridden sort method accepts a list of product type and integer
    //and calls the sort type based on integer
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

    //quick Sort
    public List<Product> quickSort(List<Product> items, int low, int high){

        //pivot from middle of list
        int middle = low + (high - low) / 2;
        int pivot = items.get(middle).getID();

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j)
        {
            //Check until all values on left side array are lower than pivot
            while (items.get(i).getID() < pivot)
            {
                i++;
            }
            //Check until all values on left side array are greater than pivot
            while (items.get(j).getID() > pivot)
            {
                j--;
            }
            //swap if needed, update iterators
            if (i <= j)
            {
                Collections.swap(items, i, j);
                i++;
                j--;
            }
        }
        //recursive call to sort two sub arrays
        if (low < j){
            quickSort(items, low, j);
        }
        if (high > i){
            quickSort(items, i, high);
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
