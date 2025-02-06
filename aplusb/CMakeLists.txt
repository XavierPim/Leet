project(aplusb)

add_executable(aplusb main.cpp main.c Solution.cpp)
target_include_directories(aplusb PRIVATE ${CMAKE_CURRENT_SOURCE_DIR})
