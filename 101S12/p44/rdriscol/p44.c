/****************************************************************/
/* Programmer:Rachel Driscoll                                   */
/*                                                              */
/* Program 44: Linked List                                      */
/*                                                              */
/* Program Completion Time:  2 hours                            */
/****************************************************************/

#include <stdio.h>
#include <stdlib.h>
#include "linked_list.h"

void stored( NODE* start );

int main (int argc, char* argv[])
{
	NODE* start = NULL;
	float x;
	NODE* current = NULL;


	printf( "Please enter a value: Press control d when finished\n" );

	while( scanf( "%f", &x) !=EOF){ 
		printf( "Please enter a value:\n" );
		start = insert_node( x, start );
	}
	current = start;
	while( current != NULL){
		printf( "Stored order: %f\n", current -> data );
		current = current-> next;
		
	}
	stored( start );
	
	free_list(start);
	
	return 0;
}

void stored( NODE* start ){
	
	if( start == NULL)
		return;
	stored( start -> next);
	printf( "Entered order: %f\n", start -> data ); 
}
