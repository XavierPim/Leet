project(2_AddTwoNumbers)

add_executable(2_AddTwoNumbers main.cpp Solution.cpp)
target_include_directories(2_AddTwoNumbers PRIVATE ${CMAKE_CURRENT_SOURCE_DIR})