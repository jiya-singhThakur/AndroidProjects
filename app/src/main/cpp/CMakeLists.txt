cmake_minimum_required(VERSION 3.10.2)
project("flamsassignment")

add_library(
        flamsassignment
        SHARED
        native-lib.cpp)

find_library(
        log-lib
        log)

# Add the OpenCV library (.so)
add_library(opencv_java4 SHARED IMPORTED)
set_target_properties(opencv_java4 PROPERTIES IMPORTED_LOCATION
        ${CMAKE_SOURCE_DIR}/../libs/${ANDROID_ABI}/libopencv_java4.so)

target_link_libraries(
        flamsassignment
        ${log-lib}
        opencv_java4
        c++_shared)