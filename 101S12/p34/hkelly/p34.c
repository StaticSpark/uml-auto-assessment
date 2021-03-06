/****************************************************/
/* Programmer: Harrison Kelly                       */
/*                                                  */
/* Program 34: Palindrome Detector                  */
/*                                                  */
/* Approximate completion time: 30 minutes          */
/****************************************************/

#include <stdio.h>
#include <string.h>

char is_palindrome( char* the_string, int start_char, int end_char );
int main( int argc, char* argv[] ){

  char* the_string;
  char string[20];
  int i;
  int end_char = 0;
  int start_char = 0;

  printf("\nEnter a string of 20 characters or less:\n");
  scanf("%s", string); /*User enters a string stored as string*/

  the_string = string; /* the string array turns into the_string*/
  end_char = (strlen( string ))-1; /* end_char becomes the length of the string
				      and is subtracted from one because of
				      the null byte                         */

  i = is_palindrome( the_string, start_char, end_char );

  if( i == 1 ){   /*If function returns a 1, its a palindrome*/
    printf("\nThe string is a palindrome\n");
  }
  else if( i == 0){           /*If function returns 0, it is not*/
    printf("\nThe string is not a palindrome\n");
  }

  return 0;

}

char is_palindrome( char* the_string, int start_char, int end_char ){

  if( end_char <= 1 ){ /*If there is one or zero characters, return 1*/
      return 1;
    }
  if( the_string[start_char] == the_string[end_char] ){ /*checks chars*/
    return is_palindrome( the_string, start_char+1, end_char-1 ); /*Recurses*/
    }
    else{
      return 0;
    }
}
      
  
