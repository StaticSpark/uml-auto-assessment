/* Programmer: Rachel Driscoll                  */
/*                                              */
/* Program 8: One Horizontal Line of Asterisks  */
/*                                              */
/* Approximate Completion Time: 30 min          */
/*                                              */

#include <stdio.h>

int main (){
  int g;
  int i;
  FILE *fin;
  fin=fopen("testdata8","r");
  fscanf(fin,"%d",&g);
  for(i=0;i<g;i++){
    printf("*");
  }
  fclose(fin);
  printf("\n");
  return 0;
}
