/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author Amith Liyanage
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    static void bubbleSort(int a[]) {
        
        int temp;
        int x = a.length - 1; //get array length
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];    //swap array elements
                    a[j] = a[j + 1];//swap array elements
                    a[j + 1] = temp;//swap array elements
                }
            }
        }
        for (int i = 0; i <= x; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int a[] = {12, 56, 34, 89, 9, 24, 47, 18};
        bubbleSort(a);
        System.out.println("Sorted array"+a);
    }
}
