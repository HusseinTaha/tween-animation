# tween-animation
-----------------
This module gives you the ability to animate your items when entering or exiting activity.

#Module Tween
-------------
###Class TweenAnimation
Contains the functions wanted to animate views left or right, on enter activity or on exit.

*Enter activity<br/>
```fromLeft (view, duration, offset)```<br/>
```fromRight (view, duration, offset)```<br/>
```fromBottom (view, duration, offset)```<br/>
```fromTop (view, duration, offset)```<br/>
<br/>
<br/>
*Exit activity<br/>
```toLeft (view, duration, offset)```<br/>
```toRight (view, duration, offset)```<br/>
```toBottom (view, duration, offset)```<br/>
```toTop (view, duration, offset)```<br/>

###Class BaseClass
This is the activity parent you should extend it contains the enter and exit operations.

```void leftActivity()``` this is the method you should ovveride to make your views left the activity in an animated way<br/>
  ```void enterActivity()``` this is the method you should ovveride to make your views enter the activity in an animated way<br/>

