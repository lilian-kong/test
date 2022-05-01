/**
 * TODO: Add your file header
 * Name: Lilian Kong
 * ID: A16927579
 * Email: llkong@ucsd.edu
 * File description: Impementation for MyArrayList
 */

/**
 * TODO: Add class header
 */
public class MyArrayList<E> implements MyReverseList<E> {
    static final int DEFAULT_CAPACITY = 5;
    
    Object[] data;
    int size;

    //IMPORTANT: DO NOT MODIFY THIS CONSTRUCTOR!
    //IMPORTANT: DO NOT ADD ANY MORE CONSTRUCTORS!

    /**
     * Constructor to create an array list with the given array's elements
     * @param arr - array of elements to be used to construct the ArrayList
     */
    public MyArrayList(E[] arr) {
        if (arr == null) {
            this.data = new Object[DEFAULT_CAPACITY];
        } else {
            this.data = arr.clone();
            this.size = arr.length;
        }
    }

    /**
	 * TODO: Method header comment here
	 */
    public void reverseRegion(int fromIndex, int toIndex) throws 
            IndexOutOfBoundsException{
        if (fromIndex < 0 || fromIndex >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (toIndex < 0 || toIndex >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (fromIndex >= toIndex) {
            return;
        }

        int halfWayIndex = (toIndex + fromIndex)/2 - fromIndex;
        for (int i = fromIndex; i < fromIndex + halfWayIndex; i++) {
            Object temp = data[i];
            data[i] = data[toIndex - i];
            data[toIndex - i] = temp;
        }
    }

    @Override
    /**
     * A method that returns the number of valid elements
     * in the ArrayList 
     * @return - number of valid elements in the arraylist
     */
    public int size() {
        return this.size;
    }

    @Override
    /**
     * A method that returns an Element at the specified index
     * @param index - the index of the return Element
     * @return Element at specified index
     */
    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) data[index];
    }
}
