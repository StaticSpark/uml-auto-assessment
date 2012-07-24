/*******************************************************/
/* Programmer: Jimmy Swanbeck                          */
/*                                                     */
/* Program 34: Palindrome Detector                     */
/*                                                     */
/* Approximate completion time: 40 minutes             */
/*******************************************************/

#include <stdio.h>
#include <string.h>

int is_palindrome( );

int main( int argc , char *argv[] )
{
  int check;
  int length;
  char string[20];
  printf( "Enter a string of up to 20 characters: " );
  scanf( "%s" , string );
  length = strlen( string );
  check = is_palindrome( string , 0 , length - 1 );
  if( check == 1 )
    printf( "The string is a palindrome\n" );
  else
    printf ( "The string is not a palindrome\n" );
  return 0;
}

int is_palindrome( char *the_string , int start_char , int end_char )
{
  if( start_char >= end_char )
    return 1;
  else if( the_string[ start_char ] == the_string[ end_char ] )
    return is_palindrome( the_string , start_char + 1 , end_char - 1 );
  else
    return 0;
}
