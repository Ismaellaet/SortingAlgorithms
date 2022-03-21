package unidade_dois;

public class QuickSort {
    public static void quickSort(int nums[], int left, int right) {
        int le = left;
        int ri = right;
        int pivot = nums[(right + left) / 2];
        int aux;

        while(le <= ri) {
            while(nums[le] < pivot) {
                le += 1;
            }

            while(nums[ri] > pivot) {
                ri -=1;
            }

            if(le <= ri) {
                aux = nums[le];
                nums[le] = nums[ri];
                nums[ri] = aux;

                le += 1;
                ri -= 1;
            }
        }

        if(ri > left) {
            quickSort(nums, left, ri);
        }

        if(le < right) {
            quickSort(nums, le, right);
        }
    }

    public static void main(String[] args) {
        int nums[] = {9, 5, 1, 3, 4, 7, 2};
        int i;

        System.out.print("Desordenado: {");

        for(i = 0; i< nums.length; i++) {
            System.out.print(nums[i]);

            if(i == nums.length - 1) {
                System.out.print("},");
            }
        }

        System.out.print("Ordenado: {");
        quickSort(nums, 0, nums.length - 1);

        for(i = 0; i< nums.length; i++) {
            System.out.print(nums[i]);

            if(i == nums.length - 1) {
                System.out.print("}");
            }
        }
    }
}

/* For more information: https://www.geeksforgeeks.org/quick-sort/ */