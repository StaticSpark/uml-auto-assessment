/****************************************************************/
/* Programmer:Betty Makovoz                                     */
/*                                                              */
/* linked_list.c: Provides linked list tools                    */
/* - The last node in the list will have next == NULL           */
/* - The payload data type is DATA_T, defined in linked_list.h  */
/*                                                              */
/****************************************************************/

#include <stdio.h>
#include <stdlib.h>
#include "linked_list.h"

NODE* make_node( DATA_T new_data, NODE* new_next ){
  NODE* newnode;
  newnode=(NODE*) malloc(sizeof (DATA_T));
  newnode -> data = new_data;
  newnode -> next = new_next;
  return newnode;
}


NODE* insert_node( DATA_T new_data, NODE* start ){
  NODE* newstart;
  
  newstart = make_node( new_data, start );  
  return newstart;
}


void free_list( NODE* start ){
  
  if(start ->next == NULL){
    free(start);
  }
  else{
    free_list(start -> next);
    free(start);
  }
  return;
}

void print_forward ( NODE * start){
  if ( start -> next == NULL){
    printf(" %f",start->data);
  }
  else{
    print_forward( start -> next);
    printf (" %f",start->data);
  }
  return;
}

void print_backward ( NODE* start ){
  if (start -> next == NULL){
    printf(" %f", start -> data);
  }
  else {
    printf(" %f", start -> data);
    print_backward (start -> next);
  }
  return;
}
