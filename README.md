# ActivityLifeCycle
Activity A: onCreate invoked-> 
Activity A: onStart invoked-> 
Activity A: onResume invoked-> 

Now click Button and go to next Activity 

Activity A: onResume invoked-> 
Activity A: onPause invoked-> 
Activity B: onCreate invoked-> 
Activity B: onStart invoked-> 
Activity B: onResume invoked-> 
Activity A: onStop invoked-> 


Now go to back Activity A

Activity B: onPause invoked-> 
A: onRestart invoked-> 
Activity A: onStart invoked-> 
Activity A: onResume invoked-> 
Activity B: onStop invoked-> 
Activity B: onDestroy invoked-> 


When i will close app then 

Activity A: onPause invoked-> 
Activity A: onStop invoked-> 
Activity A: onDestroy invoked-> 


If i am in Activity B then i close the app 

Activity B: onPause invoked-> 
Activity B: onStop invoked-> 
Activity A: onDestroy invoked-> 
Activity B: onDestroy invoked-> 
