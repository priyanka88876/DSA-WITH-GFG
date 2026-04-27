class Solution {
    static String findDay(int Day, int Month, int Year) {
        // Code Here
         List<String> days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY");
        
        //Creating an instance of the Calendar class.
        Calendar cal = Calendar.getInstance();
        
        //Setting the year, month, and day in the calendar.
        cal.set(Year, Month-1, Day); 
            
        //Getting the day of the week as an integer.
        int p = cal.get(Calendar.DAY_OF_WEEK);
        
        //Getting the corresponding day name from the list using the obtained integer.
        String s = days.get(p-1);
        
        //Returning the day name.
        return s;

    }
}