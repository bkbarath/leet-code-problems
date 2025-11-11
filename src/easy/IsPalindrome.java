class IsPalindrome {
  // is panlindrom function
  public boolean isPalindrome(int x) {
        int reversed = 0; // store the reversed values
        int num = x; // store main value and used to loop

        // return false if the value is in negative 
        if(x < 0) {
            return false;
        }

        // run the loop until the num become 0
        while(num > 0) {
          // find the last digit
            int digit = num % 10;
          // store in the reversed variable
            reversed = reversed * 10 + digit;
          // remove the last digit
            num /= 10;
        }

    // return if the original value and reversed values are same ? true: false
        return reversed == x;
    }
}
