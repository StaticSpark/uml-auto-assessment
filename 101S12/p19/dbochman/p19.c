/********************************************************/
/* Programmer:   Dylan Bochman                          */
/* Program 19:   Argv                                   */
/* Time:         12 minutes                             */
/********************************************************/

#include <stdio.h>

int main ( int argc, char *argv[] ) {
  int i;
  for (i=0; i<argc; i++){
      printf("%s ",argv[i]);
}
  printf("\n");
}
