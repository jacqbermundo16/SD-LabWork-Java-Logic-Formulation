public class MaximumValue {  
    public static void main(String[] args) {  
  
        int [] numbers = {1, 3, 5, 7, 9, 2, 4, 6, 8};  
        int max = numbers[0];  

        //Loop through the array
        for (int i = 0; i < numbers.length; i++) {  
            //compare elements with the max value
            if(numbers[i] > max)
            // if the number is larger, then it will be the new max
                max = numbers[i]; 
         }

        System.out.println("The maximum value in the array is: " + max);  
    }  
}  