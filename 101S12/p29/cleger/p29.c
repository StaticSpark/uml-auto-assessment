/****************************************************************************/
/* Programmer: Chris Leger                                                  */
/*                                                                          */
/* Program 29: Rock Paper Scissors Lizard Spock                             */
/*                                                                          */
/* Approx Completion Time: 1 Hour                                           */
/*                                                                          */
/* INSTRUCTIONS:                                                            */
/* Fill in the "gameLogic" function below to implement the rules of the     */
/* game correctly. Use the pre-defined values: rock, paper, scissors,       */
/* lizard, spock to parse input to the function.                            */
/* Return one of the three outcomes, by name: player1, player2, draw.       */
/* The inputs are defined using pre-processors definitions (#define).       */
/* The return values are defined using const global variables.              */
/*                                                                          */
/* Make sure you update this header with your name and your completion time.*/
/****************************************************************************/

#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

#define rock 114
#define paper 112
#define scissors 115
#define lizard 108
#define spock 107

const int player1 = 1 ;
const int player2 = 2 ;
const int draw  =   0 ;

void            playRound();
int             gameLogic(char a, char b);

int main(int argc, char *argv[])
{
	int i;

	printf("\nRock! Paper! Scissors! Lizard! Spock!\n");

	/* Play 5 rounds in a row (best out of 5?)*/
	for( i = 0 ; i < 5 ; i++ )
		playRound();

	return 0;
}

/* gameLogic 
 * Accepts two characters, representing the forms played by the two players.
 * Returns the winner, which is described by the constant values above.      
 * Inputs must be one of the defined values, and can simply be referenced
 * by name: rock, paper, scissors, lizard, or spock.                         */
int gameLogic(char a, char b)
{

  /* gace logic array- only initilized once when the program is run */
  int 
    gamearray[5][5] = {{draw,    player2, player1, player1, player2},
		       {player1, draw,    player2, player2, player1 },
		       {player2, player1, draw,    player1, player2 },
		       {player2, player1, player2, draw,    player1 },
		       {player1, player2, player1, player2, draw }};

  /* converts function arguments to array indicies */
  int indexa,indexb;


  switch ( a ) {
  case( rock ):
    indexa = 0;
    break;
  case( paper ):
    indexa = 1;
    break;
  case( scissors ):
    indexa = 2;
    break;
  case( lizard ):
    indexa = 3;
    break;
  case( spock ):
    indexa = 4;
    break;
  }

  switch ( b ) {
  case( rock ):
    indexb = 0;
    break;
  case( paper ):
    indexb = 1;
    break;
  case( scissors ):
    indexb = 2;
    break;
  case( lizard ):
    indexb = 3;
    break;
  case( spock ):
    indexb = 4;
    break;
  }
  return gamearray[indexa][indexb];

    

}

/* playRound
 * Plays a single round of the game. 
 * Prompts user, gets data from stdin, and prints results.
 *
 *                DO NOT MODIFY THIS FUNCTION                                */
void playRound()
{

	char p1 = 0, p2 = 0, winner;
	
	printf("\nEnter what was played for both players (r,p,s,l,k): ");

	/* Makes sure we only process alphanumeric chars and ignore others*/
	while( ! isalpha( p1 = getchar() ) );
	while( ! isalpha( p2 = getchar() ) );

	printf("Inputs: %c and %c\n", p1, p2);

	winner = gameLogic(p1, p2);

	if (winner == player1)
		printf("\nPlayer 1 wins!\n");
	else if (winner == player2)
		printf("\nPlayer 2 wins!\n");
	else if (winner == draw)
		printf("\nA Draw! (That's a tie)\n");
	else
		printf("\nUnknown outcome. Problem with gameLogic function\n");

	return;
}
