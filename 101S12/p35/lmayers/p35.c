/*************************************************************************/
/* Programmer: Lisa Mayers                                               */
/*                                                                       */
/* Program: Passing a Two Dimensional Array                              */
/*                                                                       */
/* Approximate completion time: 40 minutes                               */
/*************************************************************************/
#include <stdio.h>
extern int sum( int A[][3], int r, int c) ;

int main( int argc, char *argv[] ) {

  int i ,j , x ;
  int A[3][3];
 
  for( i =0; i < 3; i++)
    for (j =0; j < 3; j++){

      printf("Please enter an integer:\n");
      scanf("%d", &A[i][j]);
    }
      x = sum(A, 3, 3);
      printf("%d\n",x);
      
      return 0;
}


int sum( int A[][3], int r, int c) {
  int i, j, x = 0;

  for( i = 0; i < r; i++)
    for(j = 0; j < c; j++)

      x += A[i][j];

return x;
}

