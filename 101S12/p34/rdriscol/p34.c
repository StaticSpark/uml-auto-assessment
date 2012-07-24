/***********************************/
/* Programmer: Rachel Driscoll     */
/*                                 */
/* Program: Palindrome Detector    */
/*                                 */
/* Approx Completion Time:1 hr     */
/***********************************/


#include <stdio.h>
#include <string.h>

int is_palindrome( char* the_string, int start_char, int end_char );


int main( int argc, char *argv[]){
  
  
  int length;
  char array[21];

  printf( "Enter a word:");
  scanf( "%s", array );
  length = strlen( array );
  
  if(is_palindrome( array,0,length -1 ))
   
    printf( "This is a palindrome\n" ); 
  
  else
    
    printf( "This is not a palindrome!\n");

    return 0;

} 

int is_palindrome( char* the_string, int start_char, int end_char){

  if( start_char >= end_char )
    
    return 1;
  
  else if( the_string[ start_char ] != the_string[ end_char ] )
  
    return 0;
  
  return is_palindrome( the_string, start_char +1, end_char -1 );

}
