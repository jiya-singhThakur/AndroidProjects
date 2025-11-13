# flamsAssignment

## ✅ Features Implemented
- Android app with OpenCV integration (C++ & JNI)
- Raw camera feed and edge detection toggle
- OpenGL visual effects (grayscale/invert)
- FPS counter and performance logging

## 📸 Screenshots
(Add your screenshots here below by dragging and dropping or linking)

![App Screenshot](https://github.com/jiya-singhThakur/AndroidProjects/blob/master/screenshot1.png.jpg)

## ⚙ Setup Instructions
1. Clone this repo:
   ```bash
   git clone https://github.com/jiya-singhThakur/AndroidProjects
2.Open in Android Studio.
3.Ensure OpenCV SDK and NDK are installed.
4.Build and run the project on your Android device.

🧠Architecture Explanation
  JNI used to connect Java ↔ C++ for OpenCV processing.
  Native methods defined in native-lib.cpp.
  OpenGL shaders handle image rendering.
  TypeScript web viewer (if implemented) communicates via WebSocket/HTTP mock.
