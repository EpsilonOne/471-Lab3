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
    private List <Product> quickSort(List <Product> qList, int low, int high){
        Product pivot = qList.get(high);
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (qList.get(j).getID() < pivot.getID())
            {
                i++;

                // swap arr[i] and arr[j]
                Product temp = qList.get(i);
                qList.set(i, qList.get(j));
                qList.set(j, temp);
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        Product temp1 = qList.get(i+1);
        qList.set(i+1, qList.get(high));
        qList.set(high, temp1);

        return qList;
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
