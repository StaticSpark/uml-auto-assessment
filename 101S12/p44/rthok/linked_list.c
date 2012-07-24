/****************************************************************/
/* Programmer: Ravy Thok                                        */
/*                                                              */
/* linked_list.c: Provides linked list tools                    */
/* - The last node in the list will have next == NULL           */
/* - The payload data type is DATA_T, defined in linked_list.h  */
/*                                                              */
/****************************************************************/

#include <stdlib.h>
#include "linked_list.h"

NODE* make_node( DATA_T new_data, NODE* new_next ){
	
	NODE* newnode;

	newnode = malloc( sizeof( NODE ));	
       
	newnode -> data = new_data ;

	newnode -> next = new_next ;

	return newnode;
}

NODE* insert_node( DATA_T new_data, NODE* start ){

	NODE* newstart;
       
	newstart = make_node( new_data, start );

	newstart -> data = new_data ;

	newstart -> next = start ;
	
	return newstart;
}

void free_list( NODE* start ){

	if( start == NULL ) 

		free( start ) ;

	else{

		free_list( start -> next ) ;

			free( start ) ;

	}

}
