/****************************************************************/
/* Programmer: Harrison Kelly                                   */
/*                                                              */
/* Program 44: Linked List                                      */
/*                                                              */
/* Program Completion Time: 4 Hours                             */
/****************************************************************/

#include <stdio.h>
#include <stdlib.h>
#include "linked_list.h"

int main (int argc, char* argv[])
{
  NODE* start = NULL;
  NODE* temp;
  DATA_T new_data;
  NODE* new_next = NULL;
  
  printf("\nEnter integers to store in the nodes.");
  printf("\nEnter EOF when completed.\n");
  
  scanf("%f", &new_data);
  temp = make_node( new_data, new_next );
  start = temp;
  
  while( scanf("%f", &new_data) != EOF ){ /* Scans while EOF isnt scanned */
    
    if( new_data != EOF ){
      temp = insert_node( new_data, start );
      start = temp; /* Sets start to location of first node */
    }
    else{
      break;
    }
  }
  printf("\nList printed forwards (In the order it was stored):\n");
  print_list_forwards( start );
  printf("\n");
  
  printf("\nList printed backwards (In the order it was entered):\n");
  print_list_backwards( start );
  printf("\n");
  
  free_list(start);
  
  return 0;
}
