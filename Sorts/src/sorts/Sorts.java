/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorts;

/**
 *
 * @author GerardoEnrique
 */

import java.util.Random;

public class Sorts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int len = 10;
        Comparable[] nums = new Comparable[len];
        Random random = new Random();
        
        for (int i = 0; i < len; i++) {
            nums[i] = random.nextInt(len*100);
        }
        
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
        
        Insertion.SelectionSort(nums);
        
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }
    
}
