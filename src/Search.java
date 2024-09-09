import java.util.ArrayList;

public class Search {

    public static int linearSearch(int[] array, int value) {

        for(int i = 0; i < array.length; i++){

            if(array[i] == value){

                return i;

            }

        }

        return -1;

    }

    public static int linearSearch(ArrayList<String> list, String string) {

        int index = 0;
        for(String str : list){

            if(str.equals(string)){

                return index;

            }
            index++;

        }

        return -1;

    }

    public static int binarySearch(int[] array, int value) {

        int min = 0;
        int max = array.length - 1;

        while(min <= max){

            int mid = (min + max) / 2;

            if(array[mid] < value){

                min = mid + 1;

            } else if (array[mid] == value) {

                return mid;

            } else { // if array[mid] > value

                max = mid - 1;
            }

        }

        return -1;

    }

    public static int binarySearch(String[] array, String string) {

        int min = 0;
        int max = array.length - 1;

        while(min <= max){

            int mid = (min + max) / 2;

            if(array[mid].compareTo(string) < 0){

                min = mid + 1;

            } else if (array[mid].equals(string)) {

                return mid;

            } else { // if array[mid] > string

                max = mid - 1;
            }

        }

        return -1;

    }
}
