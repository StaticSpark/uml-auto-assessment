/******************************************************************/
/* Programmer: Jared King                                         */
/* Program 28: Digit Sum                                          */
/* Approx Completion Time: 30 Minutes                             */
/******************************************************************/

#include<stdio.h>

int digitsum(int c);
int main(int argc, char* argv[]){
  
  int num;
  int sum;  
  FILE *fin;
 
  fin= fopen(argv[1], "r");
  printf("The digit sum of each of the integers in the given file are:\n");
  
  while (fscanf(fin, "%d", &num) !=EOF){
    sum = digitsum(num);
    printf("%d\n", sum);
  }

  fclose( fin );
  return 0;
}
     
int digitsum(int number){
  
  int lastdigit;
  int sum = 0;
  
  while (number !=0){
    lastdigit = number%10;
    sum = sum + lastdigit;
    number = number/10;
  }

  return sum;
} 
 

