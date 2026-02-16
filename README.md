# 📱 TestApp - Android Test Application

Simple Android application designed for mobile test automation practice with Appium.

## ✨ Features

- **Login Screen** with TC (11 digits) and password (6 digits) validation
- **Dashboard Screen** with user information display
- **Profile, Settings, Logout** button navigation
- **Multi-user support** (4 test users)
- **Remember Me** checkbox functionality
- **Forgot Password** link
- **Input validation** with real-time error messages
- **Clean UI** with Material Design principles

## 🎯 Purpose

This application is specifically designed to practice mobile test automation with Appium. It provides various test scenarios including:
- Positive and negative login tests
- Form validation (empty fields, invalid input)
- Navigation between screens
- User session management
- Button click events
- Text verification

## 👥 Test Users

| TC (11 digits) | Password (6 digits) | Status | Description |
|----------------|---------------------|--------|-------------|
| 12345678901 | 111111 | ✅ Valid | Primary test user |
| 11111111111 | 111111 | ✅ Valid | Test user 1 |
| 22222222222 | 222222 | ✅ Valid | Test user 2 |
| 33333333333 | 333333 | ✅ Valid | Test user 3 |

## 🛠️ Tech Stack

- **Android Studio** Arctic Fox or later
- **Java** 8+
- **Minimum SDK:** 21 (Android 5.0 Lollipop)
- **Target SDK:** 34 (Android 14)
- **Gradle:** 8.0+

## 📂 Project Structure
TestApp/
├── app/
│   ├── src/main/
│   │   ├── java/com/personal/testapp/
│   │   │   ├── MainActivity.java        # Login screen logic
│   │   │   └── DashboardActivity.java   # Dashboard screen logic
│   │   ├── res/layout/
│   │   │   ├── activity_main.xml        # Login UI layout
│   │   │   └── activity_dashboard.xml   # Dashboard UI layout
│   │   └── AndroidManifest.xml
│   └── build.gradle
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
## 🔧 Build Instructions

### Prerequisites
- Android Studio installed
- Android SDK (API 21+)
- Java JDK 8 or higher

### Build Debug APK
```bash
./gradlew assembleDebug

### APK Locationapp/build/outputs/apk/debug/app-debug.apk

### Install on Device/Emulator
```bash
adb install app/build/outputs/apk/debug/app-debug.apk

### Run from Android Studio
1. Open project in Android Studio
2. Connect device or start emulator
3. Click **Run** (▶️) button

## 📱 Application Screens

### 1. Login Screen
**Elements:**
- TC input field (11 digits max, number input)
- Password input field (6 digits max, password input)
- Remember Me checkbox
- Login button
- Forgot Password link (TextView, clickable)
- Result text (error/success messages)

**Validation Rules:**
- Both fields required
- TC must be exactly 11 digits
- Password must be exactly 6 digits
- Invalid credentials show error message

**Element IDs:**com.personal.testapp:id/tcField
com.personal.testapp:id/passwordField
com.personal.testapp:id/rememberMeCheckbox
com.personal.testapp:id/loginButton
com.personal.testapp:id/forgotPasswordLink
com.personal.testapp:id/resultText

### 2. Dashboard Screen
**Elements:**
- Welcome text ("Hoş Geldiniz!")
- User info text (displays TC)
- Profile button
- Settings button
- Logout button (red background)
- Dashboard result text (action feedback)

**Element IDs:**com.personal.testapp:id/welcomeText
com.personal.testapp:id/userInfoText
com.personal.testapp:id/profileButton
com.personal.testapp:id/settingsButton
com.personal.testapp:id/logoutButton
com.personal.testapp:id/dashboardResultText

## 🧪 Test Automation

This app is fully tested using the **MobileTestAutomation** framework:

**Repository:** [github.com/Okhantaha/MobileTestAutomation](https://github.com/Okhantaha/MobileTestAutomation)

**Framework:** Appium + Java + TestNG + Page Object Model

**Test Coverage:**
- 18 automated test scenarios
- Login validation tests (6 tests)
- Dashboard functionality tests (5 tests)
- JSON data-driven tests (7 tests)
- Extent Reports with screenshots
- Dynamic wait strategies

## 🔑 Test Scenarios

### Login Tests
✅ Successful login with valid credentials  
✅ Empty fields validation  
✅ Invalid TC (too short/long)  
✅ Wrong password validation  
✅ Forgot password link functionality  
✅ Remember me checkbox  

### Dashboard Tests
✅ Navigation from Login to Dashboard  
✅ User TC display verification  
✅ Profile button click  
✅ Settings button click  
✅ Logout functionality  

## 🚀 Development

### Clone Repository
```bash
Tabii! Tek seferde yazayım! 🚀

📱 TestApp README.md
bashcd ~/PersonalProjects/MobileApp/TestApp
nano README.md
Tüm içeriği kopyalayıp yapıştırın:
markdown# 📱 TestApp - Android Test Application

Simple Android application designed for mobile test automation practice with Appium.

## ✨ Features

- **Login Screen** with TC (11 digits) and password (6 digits) validation
- **Dashboard Screen** with user information display
- **Profile, Settings, Logout** button navigation
- **Multi-user support** (4 test users)
- **Remember Me** checkbox functionality
- **Forgot Password** link
- **Input validation** with real-time error messages
- **Clean UI** with Material Design principles

## 🎯 Purpose

This application is specifically designed to practice mobile test automation with Appium. It provides various test scenarios including:
- Positive and negative login tests
- Form validation (empty fields, invalid input)
- Navigation between screens
- User session management
- Button click events
- Text verification

## 👥 Test Users

| TC (11 digits) | Password (6 digits) | Status | Description |
|----------------|---------------------|--------|-------------|
| 12345678901 | 111111 | ✅ Valid | Primary test user |
| 11111111111 | 111111 | ✅ Valid | Test user 1 |
| 22222222222 | 222222 | ✅ Valid | Test user 2 |
| 33333333333 | 333333 | ✅ Valid | Test user 3 |

## 🛠️ Tech Stack

- **Android Studio** Arctic Fox or later
- **Java** 8+
- **Minimum SDK:** 21 (Android 5.0 Lollipop)
- **Target SDK:** 34 (Android 14)
- **Gradle:** 8.0+

## 📂 Project Structure
```
TestApp/
├── app/
│   ├── src/main/
│   │   ├── java/com/personal/testapp/
│   │   │   ├── MainActivity.java        # Login screen logic
│   │   │   └── DashboardActivity.java   # Dashboard screen logic
│   │   ├── res/layout/
│   │   │   ├── activity_main.xml        # Login UI layout
│   │   │   └── activity_dashboard.xml   # Dashboard UI layout
│   │   └── AndroidManifest.xml
│   └── build.gradle
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## 🔧 Build Instructions

### Prerequisites
- Android Studio installed
- Android SDK (API 21+)
- Java JDK 8 or higher

### Build Debug APK
```bash
./gradlew assembleDebug
```

### APK Location
```
app/build/outputs/apk/debug/app-debug.apk
```

### Install on Device/Emulator
```bash
adb install app/build/outputs/apk/debug/app-debug.apk
```

### Run from Android Studio
1. Open project in Android Studio
2. Connect device or start emulator
3. Click **Run** (▶️) button

## 📱 Application Screens

### 1. Login Screen
**Elements:**
- TC input field (11 digits max, number input)
- Password input field (6 digits max, password input)
- Remember Me checkbox
- Login button
- Forgot Password link (TextView, clickable)
- Result text (error/success messages)

**Validation Rules:**
- Both fields required
- TC must be exactly 11 digits
- Password must be exactly 6 digits
- Invalid credentials show error message

**Element IDs:**
```
com.personal.testapp:id/tcField
com.personal.testapp:id/passwordField
com.personal.testapp:id/rememberMeCheckbox
com.personal.testapp:id/loginButton
com.personal.testapp:id/forgotPasswordLink
com.personal.testapp:id/resultText
```

### 2. Dashboard Screen
**Elements:**
- Welcome text ("Hoş Geldiniz!")
- User info text (displays TC)
- Profile button
- Settings button
- Logout button (red background)
- Dashboard result text (action feedback)

**Element IDs:**
```
com.personal.testapp:id/welcomeText
com.personal.testapp:id/userInfoText
com.personal.testapp:id/profileButton
com.personal.testapp:id/settingsButton
com.personal.testapp:id/logoutButton
com.personal.testapp:id/dashboardResultText
```

## 🧪 Test Automation

This app is fully tested using the **MobileTestAutomation** framework:

**Repository:** [github.com/Okhantaha/MobileTestAutomation](https://github.com/Okhantaha/MobileTestAutomation)

**Framework:** Appium + Java + TestNG + Page Object Model

**Test Coverage:**
- 18 automated test scenarios
- Login validation tests (6 tests)
- Dashboard functionality tests (5 tests)
- JSON data-driven tests (7 tests)
- Extent Reports with screenshots
- Dynamic wait strategies

## 🔑 Test Scenarios

### Login Tests
✅ Successful login with valid credentials  
✅ Empty fields validation  
✅ Invalid TC (too short/long)  
✅ Wrong password validation  
✅ Forgot password link functionality  
✅ Remember me checkbox  

### Dashboard Tests
✅ Navigation from Login to Dashboard  
✅ User TC display verification  
✅ Profile button click  
✅ Settings button click  
✅ Logout functionality  

## 🚀 Development

### Clone Repository
```bash
git clone https://github.com/Okhantaha/TestApp.git
cd TestApp
```

### Open in Android Studio
1. File → Open
2. Select TestApp directory
3. Wait for Gradle sync
4. Run on emulator or device

## 📄 License

This project is created for educational and practice purposes.

## 👤 Author

**Okhan Taha**
- GitHub: [@Okhantaha](https://github.com/Okhantaha)
- Test Framework: [MobileTestAutomation](https://github.com/Okhantaha/MobileTestAutomation)

## 📚 Related Projects

- [MobileTestAutomation](https://github.com/Okhantaha/MobileTestAutomation) - Appium test automation framework for this app

---

**Note:** This is a sample application created specifically for learning and practicing mobile test automation. It is not intended for production use.
