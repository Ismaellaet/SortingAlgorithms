package unidade_dois;

public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = {9, 5, 1, 3, 4, 7, 2};
        int min, aux;
        int i, j;

        System.out.print("Desordenado: {");

        for(i = 0; i< nums.length; i++) {
            System.out.print(nums[i]);

            if(i == nums.length - 1) {
                System.out.print("},");
            }
        }

        /* Selection Sort */
        for(i = 0; i < nums.length - 1; i++) {
            min = i;

            for(j = i + 1; j < nums.length; j++) {
                if(nums[j] < nums[min]) {
                    min = j;
                }
            }
            
            aux = nums[i];
            nums[i] = nums[min];
            nums[min] = aux;
        }

        System.out.print("Ordenado: {");

        for(i = 0; i< nums.length; i++) {
            System.out.print(nums[i]);

            if(i == nums.length - 1) {
                System.out.print("}");
            }
        }
    }
}

/* For more information: https://www.geeksforgeeks.org/selection-sort/ */