BarLaurea Menu Android App
================
Description 
-------
This project includes 2 big modules, one is BarLaurea Menu Web App, another is BarLaurea Android App. Both modules has been connected and ready to use. Even though these modules are just prototypes, they have enough core fucntionalities to serve real users and use cases.

BarLaurea Android App will be for the end users meanwhile BarLaurea Web App is only used by BarLaurea's employees. The ideas are whenever BarLaurea's employees change something on the web view, information in the device will be update dynamically and instantly even without the end user's awareness.

Usage notes
-------
To use the web app, just go to http://gdriv.es/barlaurea.
For its openess and desmonstration purposes it has not been added any layer of authentication at the moment. Any one can use it and type anything they want.

To use the android app, just download the apk file here at https://github.com/vinhnghi223/Bar-Laurea-Menu-App/blob/master/Bar-Laurea-Menu-Android-App/BarLaurea_v5.apk (click on Raw) and install it on your android device. 

You will see that the information displayed on the device sync instantly whenerver you change something on the web view.

I do recommend you to install the apk file on your device and start playing with the web app, since only doing so will help you see the true beauty of the app, which does not lie only on the UI. It transfers data instanntly and that's what I believe in modern web apps and mobile apps are.

Screenshots
-------
![ScreenShot](https://raw.githubusercontent.com/vinhnghi223/Bar-Laurea-Menu-App/master/Bar-Laurea-Menu-Android-App/Screenshot.png)


![ScreenShot](https://raw.githubusercontent.com/vinhnghi223/Bar-Laurea-Menu-App/master/Bar-Laurea-Menu-Web-App/Screenshot-web-app.PNG)

Development notes
-------
The development process has gone through 2 big changes. The first version of the whole product has a dramatically slow processing time due to the fact that I implement the front-end module via Wordpress (at http://barlaurea.biz.ht/, in case you are interested in). Wordpress imported RSS feed data from Firefeed, which was a service that has been dropped by Firebase recently. The android app, on the other hand use Firebase as a No-Backend service, and from there,Firebase export JSON data to Firefeed. The whole process will take about 10 minutes.

The second version of the product (current version) has a huge improvement in performance, user experience (as well as UI). Instead of using a CMS solution like Wordpress, I built a single page application on my own using AngularJS, AngularFire, and Bootstrap 3.0. The app works smoothly and sync data in just 1-3 seconds depending on internet connection's speed. 

Also notice that this is just a prototype and I didn't hosted the whole app in a dedicated/real server. (The server do play an important role here, an obvious example is when you view the web app  on Github html preview at http://htmlpreview.github.io/?https://raw.github.com/vinhnghi223/Bar-Laurea-Menu-App/master/Bar-Laurea-Menu-Web-App/index.html, you can click on the select week button but unable to use edit functionality, the contrary things happens when you start using the same web app, with exact same source code,and same browser, on http://gdriv.es/barlaurea)

Future Development
-------
Finding what food will be servered at Laurea cafeteria has never been easier with this app. The idea is it's not only easy to use for the direct users, it also helps Laurea employees a lot in inputing, modifying and managing entries without any IT knowledge. The app syncs dynamically and offer a good user experience. 

Even though having almost all core functionalities at the moment, the app needs to have an authentication as well as validation mechanism, especially for the front-end web module and a way to store, manage and retrieve data in multiple weeks, months, even years, even in offline environment.



