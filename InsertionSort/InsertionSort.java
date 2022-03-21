package unidade_dois;

public class InsertionSort {
    public static void main(String[] args) {
        int nums[] = {9, 5, 1, 3, 4, 7, 2};
        int aux = 0;
        int j = 0;
        int i = 0;
        
        System.out.print("Desordenado: {");

        for(i = 0; i< nums.length; i++) {
            System.out.print(nums[i]);

            if(i == nums.length - 1) {
                System.out.print("},");
            }
        }

        /* Insertion Sort */
        for(i = 1; i < nums.length; i++) {
            aux = nums[i];
            j = i - 1;

            while((j > -1) && (nums[j] > aux)) {
                nums[j + 1] = nums[j];
                j--; 
            }

            nums[j + 1] = aux;
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

/*For more information: https://www.geeksforgeeks.org/insertion-sort/ */