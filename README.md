# react-native-tink

Tink is a multi-language, cross-platform cryptographic library for react native application

## Install
```
yarn add react-native-tink
react-native link react-native-tink
```

or
 
```
react-native install react-native-tink
```

### iOS

~~**Add with CocoaPods(if you integrated react-native to native iOS project)**~~

To be continue... 

### Android 

#### Checkout settings.gradle

> your project/android/settings.gradle

```
include ':react-native-tink'
project(':react-native-tink').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-tink/android')
```

#### Checkout module's build.gradle, add configuration

> your project/android/app/build.gradle

```
...
dependencies {
  ...
  compile project(':react-native-tink')
  ...
}
```


## License
---
MIT
