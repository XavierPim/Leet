#include "Solution.hpp"
#include <iostream>
#include <limits>
using namespace std;

// int main() {
//     obj a;
//     obj b{};
//     obj c();
//     obj d = a;
//     d = b;
//     auto e = obj{};
//     obj f{a};
//     obj g(a);
//     auto h = b;
//     obj (i);
// }

int main() {
    if (numeric_limits<char>::is_signed) {
        std::cout << "char is signed\n";
    } else {
        std::cout << "char is unsigned\n";
    }
    return 0;
}

// int main() {
//     const char* p = "Next";
//     cout<< p<< endl;
//     return 0;
// }
