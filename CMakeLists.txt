cmake_minimum_required(VERSION 3.3)
project(HackerRank)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(SOURCE_FILES C++/Introduction/HelloWorld.cpp C++/Introduction/InputAndOutput.cpp C++/Introduction/BasicDataTypes.cpp C++/Introduction/ConditionalStatements.cpp C++/Introduction/ForLoop.cpp C++/Introduction/Functions.cpp C++/Introduction/Pointer.cpp C++/Introduction/ArraysIntroduction.cpp Algorithms/src/Implementation/SharlockAndSquares.cpp Algorithms/src/Implementation/ChocolateFeast.cpp C++/strings/AttributeParser.cpp C++/strings/Strings.cpp C++/strings/StringStream.cpp C++/Classes/Class.cpp)
add_executable(HackerRank ${SOURCE_FILES})