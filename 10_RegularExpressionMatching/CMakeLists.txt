project(10_RegularExpressionMatching)

add_executable(10_RegularExpressionMatching main.cpp Solution.cpp
        ../121_BestTimeToBuyAndSell/main.cpp)
target_include_directories(10_RegularExpressionMatching PRIVATE ${CMAKE_CURRENT_SOURCE_DIR})