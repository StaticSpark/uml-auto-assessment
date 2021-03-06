/*****************************************************************************/
/* Programmer: Erin Graceffa                                                 */
/*                                                                           */
/* Program: Passing a Two Dimensional Array                                  */
/*                                                                           */
/* Approximate completion time: 2 hours                                      */
/*****************************************************************************/

#include <stdio.h>
int sum( int array[][3]);
int main( int argc, char *argv[] )
{
  int i, j, x;
  int array[3][3];
  /* declares the multidimensional array */
  printf("Please enter nine integers to be summed:\n");
  /* promps the user for values */
  for (i=0; i<3; i++){
    for (j=0; j<3; j++){
      scanf("%d", &array[i][j]);
  /* scans the values into the array */
    }
  }
  x = sum(array);
  /* calls the sum function */
  printf("The sum of the integers is %d.\n", x); 
  /* prints the sum of the values in the array */
  return 0 ;
}
int sum( int array[][3]){
  int k, l, y=0;
  for(k=0; k<3; k++){
  /* executes the following code once for each block of cells in the array */
    for(l=0; l<3; l++){
    /* executes the following code once for each cell within the aforementioned block */
      y = y + (array[k][l]);
      /* sums the values within the array block by block */
    }
  }
  return y;
  /* returns the cummulative sum to the main function */
}
