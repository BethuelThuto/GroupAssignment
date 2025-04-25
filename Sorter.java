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