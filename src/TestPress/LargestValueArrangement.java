package TestPress;

import java.util.Arrays;

import java.util.Comparator;
public class LargestValueArrangement {
	    public static void main(String[] args) {
	        Integer[] numbers = {54, 546, 548, 60};
	        largestValueArrangement(numbers);	    	
	    } 
	    public static void largestValueArrangement(Integer[] numbers) {
	        Arrays.sort(numbers, new LargestValueComparator());
	        
	        StringBuilder largestValue = new StringBuilder();
	        for (Integer number : numbers) {
	            largestValue.append(number);
	        }
	        
	        System.out.println("Largest value arrangement: " + largestValue);
	    }   
	    static class LargestValueComparator implements Comparator<Integer> {
	        @Override
	        public int compare(Integer num1, Integer num2) {
	            String num1Str = num1.toString();
	            String num2Str = num2.toString();  
	            String firstOption = num1Str + num2Str;
	            String secondOption = num2Str + num1Str;
	            
	            return secondOption.compareTo(firstOption); // Reverse order to sort in descending order
	        }
	    }
	}