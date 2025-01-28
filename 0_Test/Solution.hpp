#ifndef SOLUTION_HPP
#define SOLUTION_HPP
#include <iostream>

class obj {
public:
    obj(){std::cout<<1;}
    obj(const obj&){std::cout<<2;}
    void operator=(const obj&){std::cout<<3;}
};
#endif
//1123