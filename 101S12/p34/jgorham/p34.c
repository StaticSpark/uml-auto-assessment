/********************************************************************************/
/* Programmer: Joshua Gorham                                                    */
/*                                                                              */
/* Program 34 Palindrom Detector                                                */
/*                                                                              */
/* Approximate Completion Time:  10 min                                         */
/********************************************************************************/

#include <stdio.h>
#include <string.h>

int palset(char* the_string, int length);
int is_palindrom(char* the_string, int start_char, int end_char);

int main(int argc, char* argv[]){
  char* in_string;
  int length;
  int pal = 0;
  printf("Enter string to check: ");
  scanf("%s", in_string);
  length = strlen(in_string);           /*Reads length of string*/
  pal = palset(in_string, length);
  if(pal == 1)
    printf("Entered string is a palindrom.\n");
  else
    printf("Entered string is not a palindrom.\n"); /*Originally was else if*/
                                                    /* seemed unnessesary   */
  return 0;
}

int palset(char* the_string, int length){
  int end_char = 0;
  int start_char = 0;
  int pal = 0;
  end_char = length - 1;
  pal = is_palindrom(the_string, start_char, end_char);
  return pal;
}

int is_palindrom(char* the_string, int start_char, int end_char){
  int is_pal = 0;
  if(start_char >= end_char)
    is_pal = 1;
  else if(the_string[start_char] == the_string[end_char]){
    end_char--;
    start_char++;
    is_pal = is_palindrom(the_string, start_char, end_char);
  }
  return is_pal;
}
