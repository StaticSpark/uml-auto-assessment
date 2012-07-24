/*****************************************************************************/
/* Programmer: Erin Graceffa                                                 */
/*                                                                           */
/* Program: Palindrome Detector                                              */
/*                                                                           */
/* Approximate completion time: 3 hours                                      */
/*****************************************************************************/

#include <stdio.h>
#include <string.h>
int is_palindrome( char* the_string, int start_char, int end_char );
int main( int argc, char *argv[] )
{
  char the_string[256];
  int start_char, end_char, y, length;
  printf("The following program will determine whether or not the word  you enter is a palindrome. Please enter the word of your choice:\n");
  /* prompts the user */
  scanf("%s", the_string);
  /* scans the word in as a string */
  length = strlen(the_string);
  /* calculates the length of the sting */
  end_char = length -1;
  start_char = 0;
  y = is_palindrome(the_string, start_char, end_char);
  /* calls the is_palindrome function */
  if( y == 0){
    printf("%s is not a palindrome.\n", the_string);
    /* prints the above if is_palindrome returns false */
  }
  else{
    printf("%s is a palindrome.\n", the_string);
    /* prints the above if is_palindrome returns true */
  }
  return 0;
}
int is_palindrome( char* the_string, int start_char, int end_char )
{
  if((the_string[start_char]) != (the_string[end_char])){
     return 0;
     /* returns false if the last character of the string and the first character of the string are different */ 
  }
  if(start_char >= end_char){
    return 1;
    /* returns true for the base case: that is, that the middle character of the string is the same */
  }
  else{
    return(is_palindrome(the_string, (start_char + 1), (end_char - 1)));
    /* otherwise, another recursive call is made, redefining the start and end characters of the string */
  }
}
