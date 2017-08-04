//record always
#include <stdio.h>
#include <pthread.h>
/**
* create thread for record voice always
*/
void recordAlways(){
  int i=0;
  for(i=0;i<=5;i++){
     printf("this is thread %d\n",i );
  }
   
}

int main(){
	pthread_t id;
	int ret,i=0;
	ret=pthread_create(&id,NULL,(void *)recordAlways,NULL);
	if(ret!=0){
		printf("to thread failed \n");
		exit(0);
	}
	for(i=0;i<=5;i++)  
    {  
        printf("This is main thread %d\n",i);  
        sleep(10);  // 当前线程睡眠1秒。  
    }  
    pthread_join(id,NULL);  
    // 将标识为id的线程加入当前线程。  
    // 即等待该线程执行结束再恢复当前线程运行   
     
	return 0;
}
