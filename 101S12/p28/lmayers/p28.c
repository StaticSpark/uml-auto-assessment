/*************************************************************************/
/* Programmer: Lisa Mayers                                               */
/* Modified by Mark Sherman                                              */
/* Program: Digit Sum                                                    */
/*                                                                       */
/* Approximate completion time: 20 minutes                               */
/*************************************************************************/
#include <stdio.h>
#include <stdlib.h>
int digitsum(int n);

int main (int argc , char *argv[]) {

  int n , sum ;

  FILE* fin;

  fin = fopen( argv[1] , "r"  );

  while( fscanf( fin, "%d", &n ) != EOF ){ 

	  sum = digitsum( n );
	  printf("\nThe sum is %d.\n",sum );
  }

  return 0;
}

int digitsum( int n){

  if (n < 10) return n;
  return (n % 10) + digitsum(n / 10);

}
