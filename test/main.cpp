#include "Solution.hpp"
#include <iostream>
using namespace std;

int f(int &x, int &y) {
    x = 3;
    y = 4;
    return x + y;
}

int main() {
    int x = 5;
    int y = 6;
    int z = f(x, y);
    cout << x << y << z << endl;
    return 0;
}


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

// int main() {
//     if (numeric_limits<char>::is_signed) {
//         std::cout << "char is signed\n";
//     } else {
//         std::cout << "char is unsigned\n";
//     }
//     return 0;
// }

// int main() {
//     const char* p = "Next";
//     cout<< p<< endl;
//     return 0;
// }
