/*****************************************************************************/
/* Programmer : Zachary Robichaud                                            */
/*                                                                           */
/* Assignment : Multiple deterministic finite state machines                 */
/*                                                                           */
/* Approximate Completion Time : 120 minutes                                 */
/*****************************************************************************/

#include <stdio.h> 

int lang1( char input , int state ) ;
int lang2( char input , int state ) ;
int lang3( char input , int state ) ;

int main( int argc , char* argv[] ) { 
	
	int l1 = 0 , l2 = 0 , l3 = 0 ;
	char input ; 
	
	while( ( input = getchar() ) != EOF ) {
		if( input == '0' || input == '1'){
			l1 = lang1( input , l1 ) ;
			l2 = lang2( input , l2 ) ;
			l3 = lang3( input , l3 ) ;
		}
	}

	putchar ( '\n' ) ;
	if ( l1 == 3 ) 
		printf( "Language 1 accepts!!!\n" ) ;
	else
		printf( "Language 1 rejects\n" ) ;
	if ( l2 == 2 ) 
		printf( "Language 2 accepts!!!\n" ) ;
	else
		printf( "Language 2 rejects\n" ) ;
	if ( l3 == 1 ) 
		printf( "Language 3 accepts!!!\n" ) ;
	else 
		printf( "Language 3 rejects\n" ) ;

	return 0 ;       
}

/* All finite state machines use the same principle to get to a accept or
   reject state.  They all take the input from stdin and they also take a 
   stat arg. This state starts at 0 , but after each time through the loop each
   machine has its own state that it carries with it. This ensures that each 
   time the loop restarts, the state of each machine is not lost.  Within
   each machine it uses simple logic that compares the input, and assigns the
   next state according to the input.  Finally when the EOF character is input
   the machine returns its state for the last time. The main function then 
   tests to see if it each machine is at its accepts state or not , and prints
   that to the screen for the user to see.
 */

int lang1( char input , int state ) {	       

	switch ( state ) {
	case 0 :
		if ( input == '0' ) 
			state = 1 ;
		else 
			state = 0 ;
		break ;
	case 1 : 
		if ( input == '0' ) 
			state = 1 ;
		else 
			state = 2 ;
		break ;
	case 2 : 
		if ( input == '0' ) 
			state = 3 ;
		else
			state = 0 ;
		break ;
	case 3 :
		state = 3 ;
		break ;			 		   
	}
	return state ;	
}
              	      		       
int lang2( char input , int state ) {

	switch ( state ) {  
	case 0 : 
		if ( input == '0' ) 
			state = 1 ;
		else
			state = 2 ;
		break ;
	case 1 :
		if ( input == '0' ) 
			state = 0 ;
		else
			state = 3 ;
		break ;
	case 2 :
		if ( input == '0' ) 
			state = 3 ;
		else
			state = 0 ;
		break ;
	case 3 : 
		if ( input == '0' ) 
			state = 2 ;
		else
			state = 1 ;
		break ; 
	}	                       
	return state ;
}

int lang3( char input , int state ) {
             			       
	switch ( state ) {
	case 0 :
		if ( input == '0' ) 
			state = 1 ;
		else
			state = 3 ;
		break ;
	case 1 : 
		if ( input == '0' ) 		       
			state = 2 ;
		else
			state = 2 ;
		break ;
	case 2 :
		if ( input == '0' ) 
			state = 1 ;
		else 
			state = 1 ;
		break ;
	case 3: 
		state = 3 ;
		break ;
	}
	return state ; 
} 

		
				
		
	     
