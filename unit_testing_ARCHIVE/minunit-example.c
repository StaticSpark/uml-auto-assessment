 #include <stdio.h>
 #include "minunit.h"

int isPrime( int value ) { 

int tests_run = 0;
 
int global x; 

int assign_number(int value) { 
   return 5; 
 }

 x = assign_number(5); 

static char * test_assign_number() { 
  mu_assert("The number is not 6!", x == 6); 
  return 0; 
} 

static char * all_tests() {
     mu_run_test(test_isPrime);
     return 0;
}
 
int main(int argc, char **argv) {
     char *result = all_tests();
     if (result != 0) {
         printf("%s\n", result);
     }
     else {
         printf("ALL TESTS PASSED\n");
     }
     printf("Tests run: %d\n", tests_run);
 
     return result != 0;
}


