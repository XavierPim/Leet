project(1_TwoSum)

# Create an executable for the 1_TwoSum problem
add_executable(1_TwoSum main.cpp Solution.cpp)
target_include_directories(1_TwoSum PRIVATE ${CMAKE_CURRENT_SOURCE_DIR})
