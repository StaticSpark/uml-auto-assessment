/*********************************************/
/* Programmer: Jimmy Swanbeck                */
/*                                           */
/* Program 19: Argv                          */
/*                                           */
/* Approximate completion time: 7 minutes    */
/*********************************************/

#include <stdio.h>

int main(int argc,char* argv[])
{
  int i;
  for(i=0;i<argc;i++)
    {
      printf(argv[i]);
      printf("\n");
    }
  return 0;
}
