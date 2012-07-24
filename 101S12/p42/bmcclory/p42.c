/*********************************************************/
/* Programmer: Brian McClory                             */
/*                                                       */
/* Program #42: 2-Dimensional Array with Malloc          */
/*                                                       */
/* Approximate Completion Time: 30 minutes               */
/*********************************************************/

#include <stdio.h>
#include <stdlib.h>

int main(int argc, char* argv[]){

  int r, c; /* Rows and columns */
  int r_tmp, c_tmp; /* To reset the offsets */
  int r_offset, c_offset; /* So the user can enter the row or column to be added */
  int r_sum, c_sum, total; /* For when we add values */
  int i, j, k;
  int L, P; /* Length and Position for when the array is filled up at a 1-D pointer */
  int* grid;

  printf("Enter the length of one row: ");
  scanf("%d", &r);

  printf("\nEnter the number of columns: ");
  scanf("%d", &c);
  
  grid = (int*)malloc(r * c * sizeof(int));

  L = r * c;

  /* Popluate the array */
  
  for(P = 0; P <= L; P++){
    printf("Enter a value: ");
    scanf("%d", grid[i + j * c] grid[i][j]);
    printf("\n");
  }

  printf("Type the row you want added: ");
  scanf("%d", &r_offset);

  r_tmp = grid[r * r_offset];

  for(i = 0; i <= r; i++){
    r_sum += grid[(r * r_offset) + 1];
  }

  printf("%d/n", r_sum);

  printf("Type the column you want added: ");
  scanf("%d", &c_offset);

	c_tmp = c_offset * (grid + r);

	for(j = 0; j <= c; j++){
	c_sum += grid + c_tmp;
	}
  
  printf("%d", c_sum);
  
  for(k = 0; k <= L; k++){
	total += grid;
	}

	printf("%d", total);
  
  free(grid);

  return 0;
}
