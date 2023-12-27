#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<stdbool.h>

bool isValid(char* s){
    int len=strlen(s);
    if(len%2!=0){
        return false;
    }
    int top=-1;
    char* p=(char*)malloc(len);
    for(int i=0;i<len;i++){
        char ch=s[i];
        if(ch=='{'||ch=='('||ch=='['){
            p[top++]=ch;
        }
        else if(top==-1||(ch=='}'&&(p[top-1]!='{'))||(ch==')'&&(p[top-1]!='('))||(ch==']'&&(p[top-1]!='['))){
            free(p);
            return false;
        }
        else{
            top--;
        }
    }
    free(p);
    return top==-1;
}

int main(){
    char s[100];
    scanf("%s",s);
    if(isValid(s)){
        printf("true");
    }
    else{
        printf("false");
    }
}
