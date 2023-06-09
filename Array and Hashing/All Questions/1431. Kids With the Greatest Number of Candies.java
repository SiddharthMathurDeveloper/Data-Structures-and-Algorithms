


/* 
  Brute Force & Optimized -> Time - O(N) Space - O(1) 
  
*/ 


class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int maxi = Integer.MIN_VALUE; // make a maxi variable to store the max value to compare in later stage
        
        List<Boolean> boolCandies = new ArrayList<Boolean>(); // To store the answer

        for(int candide:candies){ // loop over the candies to get the max value
            
            maxi = Math.max(maxi,candide); // store max value in this maxi variable
            
        }

        int index=0; // index for using for each loop
        
        for(int candide:candies){ // Loop over the candies
            
            if(candide+extraCandies>=maxi){ // if candide+extraCandies is greater than max value put in  boolCandies as True
                
                boolCandies.add(true); // add True to boolCandies
                
            }
                
            else{ // else candide+extraCandies is smaller than max value put in  boolCandies as False
                
                boolCandies.add(false); // add False to boolCandies
                
            }
        }


        return boolCandies; // Return the result


    }
}
