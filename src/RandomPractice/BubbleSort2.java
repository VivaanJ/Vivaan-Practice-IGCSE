package RandomPractice;
public class BubbleSort2 {
    public static void main(String[] args) {
        int array[] = {2,13,4,1,23,12}; //2`
        // declaring the array!
        boolean swap = true; // Declaring a variable swap and initializing it to true!
        while(swap){ // Loop will run till swap is true
            swap = false; // Swap is false at the start of each iteration of while loop
            for (int i = 0;i< array.length-1;i++){
                if(array[i] > array[i+1] ){ // It will chech for each array value if its next value is smaller than the number or not
                    int temp = array[i]; // If the next number is smaller then we do the swap algorithm
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swap = true; // and swap will become true
                }
            }
        }
        for (int i = 0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}
