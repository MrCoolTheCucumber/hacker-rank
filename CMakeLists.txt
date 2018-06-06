cmake_minimum_required(VERSION 3.3)
project(HackerRank)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(SOURCE_FILES C++/Introduction/HelloWorld.cpp C++/Introduction/InputAndOutput.cpp C++/Introduction/BasicDataTypes.cpp C++/Introduction/ConditionalStatements.cpp C++/Introduction/ForLoop.cpp C++/Introduction/Functions.cpp C++/Introduction/Pointer.cpp C++/Introduction/ArraysIntroduction.cpp Algorithms/src/Implementation/SharlockAndSquares.cpp Algorithms/src/Implementation/ChocolateFeast.cpp C++/strings/AttributeParser.cpp C++/strings/Strings.cpp C++/strings/StringStream.cpp C++/Classes/Class.cpp C++/Classes/Structs.cpp C++/Classes/ClassesAndObjects.cpp C++/Classes/BoxIt.cpp C++/Classes/InheritedCode.cpp C++/STL/VectorSort.cpp C++/STL/SetsSTL.cpp C++/STL/MapsSTL.cpp C++/STL/PrintPretty.cpp C++/STL/LowerBoundSTL.cpp C++/STL/DequeSTL.cpp C++/STL/VectorErase.cpp C++/Introduction/VariableSizedArrays.cpp)
add_executable(HackerRank ${SOURCE_FILES})