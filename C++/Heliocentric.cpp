#include <iostream>

int main()
{
	int cases = 1;
	int e, m;
	while (std::cin >> e >> m) {
		std::cout << "Case " << cases << ": ";

		int days = 0;
		while (e != 0 || m != 0) {
			e++; e%= 365;
			m++; m%= 687;
			days++;
		}
		std::cout << days << std::endl;
		cases++;
	}
}
