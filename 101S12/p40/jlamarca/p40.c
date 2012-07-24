/****************************************************/
/* Programmer: Joe LaMarca                          */
/* Program: Finite State Machine                    */
/* Approximate time of completion: 3 days           */
/****************************************************/

#include <stdio.h>

int language_1(int a);
int language_2(int b);
int language_3(int c);

int state=0;

int main(int argc, char* argv[]){

  int input,x,y,z;

  printf("Please enter a string of numbers:");
  getchar();
  while((input=getchar())!=EOF){
    x=language_1(input);
    y=language_2(input);
    z=language_3(input);
    getchar();
  }

  printf("Language 1: %d\n", x);
  printf("Language 2: %d\n", y);
  printf("Language 3: %d\n", z);
 
  return 0;
}

int language_1(int a){
 
  if(state==0){
    if(a==0)
      state=1;
    else
      state=0;
  }
  if(state==1){
    if(a==0)
      state=1;
    else
      state=2;
  }
  if(state==2){
    if(a==0)
      state=3;
    else
      state=0;
  }
  if(state==3){
    if(a==0)
      state=3;
    if(a==1)
      state=3;
  }

  if(state==3)
    return 1;
  else
    return 0;
}

int language_2(int b){
 
  if(state==0){
    if(b==0)
      state=1;
    else
      state=2;
  }
  if(state==1){
    if(b==0)
      state=0;
    else
      state=3;
  }
  if(state==2){
    if(b==0)
      state=3;
    else
      state=1;
  }
  if(state==3){
    if(b==0)
      state=2;
    else
      state=1;
  }
  
  if(state==2)
    return 1;
  else
    return 0;
}

int language_3(int c){
  
  if(state==0){
    if(c==0)
      state=1;
    else
      return 0;
  }
  if(state==1){
    if(c==0)
      state=2;
    else
      state=2;
  }
  if(state==2){
    if(c==0)
      state=1;
    if(c==1)
      state=1;
  }

  if(state==1)
    return 1;
  else
    return 0;
}
