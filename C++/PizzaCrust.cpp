#include <iostream>

int main()
{
    float r, c;
    std::cin >> r >> c;
    printf("%.6f", ((r - c)*(r - c) * 100 / (r*r)));
    return 0;
}
