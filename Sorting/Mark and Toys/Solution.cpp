#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector<string> split_string(string);

// Complete the maximumToys function below.
int maximumToys(vector<int> prices, int k) {

  vector<int> toys;
  int res = 0;
  int toySum = 0;

  sort(prices.begin(), prices.end());

  for (int i = 0; i < prices.size(); ++i) {
    if (toySum + prices[i] < k) {
      toySum += prices[i];
      res++;
    }
  }

  return res;
}

int main()
{
    string nk_temp;
    getline(cin, nk_temp);

    vector<string> nk = split_string(nk_temp);


    int n = stoi(nk[0]);

    int k = stoi(nk[1]);

    string prices_temp_temp;
    getline(cin, prices_temp_temp);

    vector<string> prices_temp = split_string(prices_temp_temp);

    vector<int> prices(n);

    for (int i = 0; i < n; ++i) {
        int prices_item = stoi(prices_temp[i]);

        prices[i] = prices_item;
    }

    int result = maximumToys(prices, k);

    cout << result;

    return 0;
}

vector<string> split_string(string input_string) {

    // Iterator function for removing consecutive whitespaces
    string::iterator new_end = unique(input_string.begin(), input_string.end(), [] (const char &x, const char &y) {
        return x == y and x == ' ';
    });

    // Remove consecutive whitespaces
    input_string.erase(new_end, input_string.end());

    // Remove trailing whitespaces
    while (input_string[input_string.length() - 1] == ' ') {
        input_string.pop_back();
    }

    vector<string> splits;
    char delimiter = ' ';

    size_t i = 0;
    size_t pos = input_string.find(delimiter);

    // Check the position of each whitespace and add the string character before that
    while (pos != string::npos) {
        splits.push_back(input_string.substr(i, pos - i));

        i = pos + 1;
        pos = input_string.find(delimiter, i);
    }

    // Add the final element
    splits.push_back(input_string.substr(i, min(pos, input_string.length()) - i + 1));

    return splits;
}
