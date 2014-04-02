BarLaurea Menu Android App
================
Introduction
-------
This project includes 2 big modules, one is BarLaurea Menu Web App, and another is BarLaurea Android App. Both modules have been connected and ready to use. Even though these modules are just prototypes, they have enough core functionalities  to serve real users and use cases.

BarLaurea Android App will be for the end users meanwhile BarLaurea Web App is only used by BarLaurea's employees. The idea is whenever BarLaurea's employees change something on the web view, information in the device will be updated dynamically and instantly, even without end user's awareness. This way of implementation can also be useful in many situations like scheduling updating (for school, transportation, sport etc.)

Demo notes
-------
To use the web app, just go to http://www.codingisloving.com/WEBAPPS/barlaurea/index.html
For its openness and demonstrational purposes it has not been added any layer of authentication at the moment. Anyone can use it and type anything they want.

To use the android app, just download the apk file here at https://github.com/vinhnghi223/Bar-Laurea-Menu-App/blob/master/Bar-Laurea-Menu-Android-App/BarLaurea_v5.apk (click on Raw) and install it on your android device. 

You will see that the information displayed on the device sync instantly whenever you change something on the web view.

I do recommend you to install the apk file on your device and start playing with the web app, since only doing so will help you see the true beauty of the app, which does not lie only on the UI. It transfers data instantly and that's the capability that I believe all modern web apps and mobile apps should have.

Screenshots
-------
![ScreenShot](https://raw.githubusercontent.com/vinhnghi223/Bar-Laurea-Menu-App/master/BarLaurea-2.png)


![ScreenShot](https://raw.githubusercontent.com/vinhnghi223/Bar-Laurea-Menu-App/master/BarLaurea-1.png)

Development notes
-------
The development process has gone through 2 big changes. The first version of the whole product has a dramatically slow processing time due to the fact that I implement the front-end module via Wordpress (at http://barlaurea.biz.ht/, in case you are interested in). Wordpress imported RSS feed data from Firefeed, which was a service that has been dropped by Firebase recently. The android app, on the other hand use Firebase as a No-Backend service, and from there,Firebase export JSON data to Firefeed. The whole process took about 10 minutes.

The second version of the product (current version) has a huge improvement in performance, user experience (as well as UI). Instead of using a CMS solution like Wordpress, I built a single page application on my own with the help of AngularJS, AngularFire, and Bootstrap 3.0. The app works smoothly and sync data in just 1-3 seconds depending on internet connection's speed. 

Future development notes
-------
Finding what food will be severed at Laurea cafeteria has never been easier with this app. The idea is it's not only easy to use for the direct users, it also helps Laurea employees a lot in inputting, modifying and managing entries without any IT knowledge. The app syncs dynamically and offer a good user experience. 

Even though possessing almost all core functionalities at the moment, the app needs to have an authentication as well as validation mechanism, especially for the front-end web module and a way to store, manage and retrieve data in multiple weeks, months, even years, even in offline environment.



