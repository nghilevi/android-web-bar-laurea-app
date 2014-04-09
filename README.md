Finding what food will be severed at Laurea cafeteria has never been easier with this app. The idea is it's not only easy to use for the direct users, it also helps Laurea employees a lot in inputting, modifying and managing entries without any IT knowledge. The app syncs dynamically and offer a good user experience. 

##Table of Contents##

- [Introduction](#introduction)
- [Demo notes](#demo-notes)
- [Screenshots](#screenshots)
- [Development notes](#development-notes)
    - [Technologies used](#technologies-used)
    - [Future development](#future-development)

##Introduction##
This project includes 2 big modules, one is BarLaurea Menu Web App, and another is BarLaurea Android App. Both modules have been connected and ready to use. 

BarLaurea Android App will be used by the general public users while BarLaurea Web App is accessed only by  BarLaurea's employees/admins. The idea is whenever BarLaurea's employees change something on the web view, information in the device will be updated dynamically and instantly.

This way of implementation can also be useful in many situations like scheduling updating (for school, transportation, sport etc.) or imagine an app that can lookup all the lunch offer in near by canteens and cafeterias.

##Demo notes##
Web app Demo Link: [Demo Link](http://goo.gl/WnNuzm) 
APK File (Click on Raw to download): [Download](http://goo.gl/WdPE0E)

For its openness and demonstrational purposes it has not been added any layer of authentication at the moment. Anyone can use it and type anything they want.

After installing the apk file into your android device, you will see the information displayed on the device sync instantly whenever you change something on the web view.

##Screenshots##
![ScreenShot](https://raw.githubusercontent.com/vinhnghi223/Bar-Laurea-Menu-App/master/BarLaurea-2.png)


![ScreenShot](https://raw.githubusercontent.com/vinhnghi223/Bar-Laurea-Menu-App/master/BarLaurea-1.png)

##Development notes##
###Technologies used:
**Ver 1.0**
   *  Wordpress
   *  Firefeed
   *  Firebase
   
The first version of the whole product has a dramatically slow processing time. The idea is the web app, which is a Wordpress site (http://barlaurea.biz.ht/), exports RSS feed data and send it to Firefeed (which has been dropped by Firebase recently). From there, Firefeed converts RSS to JSON and send it to Firebase.The android app then gets JSON data from Firebase. The whole process took about 10 minutes.

**Ver 2.0**
   *  AngularJS
   *  AngularFire
   *  Bootstrap 3
   *  Firebase
   
The second version of the product (current version) has a huge improvement in performance, user experience (as well as UI). Instead of using a CMS solution like Wordpress, I built a single page application on my own with the help of AngularJS, AngularFire, and Bootstrap 3. The app works smoothly and sync data in just miliseconds depending on internet speed. 

###Future development
   *  implement authentication, validation
   *  create a way to manage data by weeks/months
   *  ability to store data offline in the app




