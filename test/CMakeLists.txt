project(test)

add_executable(test main.cpp main.c Solution.cpp)
target_include_directories(test PRIVATE ${CMAKE_CURRENT_SOURCE_DIR})
