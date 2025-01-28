project(0_Test)

add_executable(0_Test main.cpp main.c Solution.cpp)
target_include_directories(0_Test PRIVATE ${CMAKE_CURRENT_SOURCE_DIR})
