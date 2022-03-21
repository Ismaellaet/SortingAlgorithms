package unidade_dois;
public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = {9, 5, 1, 3, 4, 7, 2};

        System.out.print("Desordenado: {");

        for(int i = 0; i< nums.length; i++) {
            System.out.print(nums[i]);

            if(i == nums.length - 1) {
                System.out.print("},");
            }
        }

        /* Bubble Sort */
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length - 1; j++) {
                if(nums[j] > nums[j + 1]) {
                    int aux = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = aux;
                }
            }
        }

        System.out.print("Ordenado: {");
        for(int i = 0; i< nums.length; i++) {
            System.out.print(nums[i]);

            if(i == nums.length - 1) {
                System.out.print("}");
            }
        }
    }
}

/*For more information: https://www.geeksforgeeks.org/bubble-sort/ */