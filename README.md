# News_ApI
News ApI is a news reading appllication where user can create his/her account and can read all time news .

Tools used  :
XML : it is used for creating user interface .
Firebase Authentication : it is for google sigin authentication.
Retrofit Api : it is used for fetch data frim API.
Android Studio IDE : It's a software that i used to create appllication.

List of Libraries i used in this appllication is below :

    implementation 'androidx.appcompat:appcompat:1.4.1'
    //for material designing i used this
    
    implementation 'com.google.android.material:material:1.6.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    implementation 'androidx.legacy:legacy-support-v4:1.0.0'
    
    // for connecting firebase i used this lebraries
    implementation 'com.google.firebase:firebase-auth:21.0.1'
    implementation 'com.google.android.gms:play-services-auth:20.1.0'
    implementation platform('com.google.firebase:firebase-bom:29.1.0')
    
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
    // fetch image from API i used glide libraries
    implementation 'com.github.bumptech.glide:glide:4.13.0'
   
   // fetch data from API i used retrofit
    implementation 'com.squareup.retrofit2:retrofit:2.5.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.5.0'
    
    // for country code number i used this libraries
    implementation 'com.hbb20:ccp:2.5.2'
