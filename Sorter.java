/**
 * 
 */
public class Sorter {
    public static void SelectionSortTrucks(Trucks[] trucks) {
        for(int i = 0; i < trucks.length-1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < trucks.length; j++ ) {
                // compare the prices

                if(trucks[j].getPrice() < trucks[minIndex].getPrice()) {

                    minIndex = j;
                }
            }
            // swap the trucks
            Trucks temp = trucks[i];
            trucks[i] = trucks[minIndex];
            trucks[minIndex] = temp;
        }
    }
}

public static void insertionSortTrucks(Trucks[] trucks) {
    for (int i = 1; i < trucks.length; i++) {
    Trucks key = trucks[i];
    int j = i - 1;
    // shift items greater than key
    while (j >= 0 && arr[j].getPrice() > key.getPrice()) {
    trucks[j + 1] = trucks[j];
    j--;
    }
    trucks[j + 1] = key;
    }
    public static int linearSearchTruck(Truck[] trucks, Truck target) {
        for (int i = 0; i < trucks.length; i++) {
            if (trucks[i].equals(target)) {
                return i; // Found
            }
        }
        return -1; // Not found
    }
    }
   
